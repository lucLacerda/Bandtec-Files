const sensors = require('./sensors');
const SerialPort = require('serialport');
const Readline = SerialPort.parsers.Readline;


class ArduinoDataRead {

    constructor(){
        this.listData = [];
		this.__listDataTemp = [];
    }

    get List() {
        return this.listData;
    }
    get ListTemp() {
        return this.__listDataTemp;
    }
	
    fake_data(){
        setInterval(() => {
            let data_float = sensors.dht11({minHum:50, maxHum:100});

            if (this.__listDataTemp.length === 59) {
                let sum = this.__listDataTemp.reduce((a, b) =>  a + b, 0);
                while(this.__listDataTemp.length > 0) {
                    this.__listDataTemp.pop();
                }
            }
            console.log('temp: ', parseFloat(data_float[1].toFixed(2)), 'hum: ', data_float[0]);
            this.__listDataTemp.push(data_float[1]);
            this.listData.push(data_float[0]);

        }, 2000);
    }

    SetConnection() {
        SerialPort.list().then(listSerialDevices => {
            let listArduinoSerial = listSerialDevices.filter(serialDevice => {
                return serialDevice.vendorId == 2341 && serialDevice.productId == 43;
            });

            if (listArduinoSerial.length != 1) {
                this.fake_data();
                throw new Error("Arduino not found - Generating data")
            }else{
                console.log("Arduino found in the com %s", listArduinoSerial[0].comName);
                return listArduinoSerial[0].comName;
            }
        }).then(arduinoCom => {
            
            let arduino = new SerialPort(arduinoCom, {baudRate: 9600});
            
            const parser = new Readline();
            arduino.pipe(parser);
            
            parser.on('data', (data) => {
				let value = data.toString().split(';');
				let temperature = parseFloat(value[1].replace('\r', ''));
				let humidity = parseFloat(value[0].replace('\r', ''));
                this.listData.push(humidity);
                this.__listDataTemp.push(temperature)
                console.log("Temp: ",temperature," Umidade: ",humidity);
            });
            
        }).catch(error => console.log(error));
    }
}

const serial = new ArduinoDataRead();
serial.SetConnection();

module.exports.ArduinoData = {List: serial.List, ListTemp: serial.ListTemp} 