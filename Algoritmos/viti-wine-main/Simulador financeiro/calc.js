function Calcular() {
  var ipt_calculo = Number(faturamento.value);
  var result1 = ipt_calculo * 0.1;
  var result = Number(result1 + ipt_calculo);

  div_calc.innerHTML += `Seu lucro atual é de <b> R$ ${ipt_calculo.toFixed(2)}</b>Após aquisição dos nossos serviços seus lucros passam  ser de<b> R$ ${result.toFixed(2)}</b> <br> `;

}

function italia() {
  var faturar = Number(faturamento.value);
  var faturar1 = faturar * 6.59;
  var result = faturar1 * 0.1;

  div_calc.innerHTML += `Seu lucro na uva <b>Italía</b> será de <b> R$ ${result.toFixed(2)}</b> <br> `;

}

function thompson() {
  var faturar = Number(faturamento.value);
  var faturar1 = faturar * 9.14;
  var result = faturar1 * 0.1;

  div_calc.innerHTML += `Seu lucro na uva <b>Thompson</b> será de <b> R$ ${result.toFixed(2)}</b> <br> `;
}

function crimson() {
  var faturar = Number(faturamento.value);
  var faturar1 = faturar * 8.94;
  var result = faturar1 * 0.1;

  div_calc.innerHTML += `Seu lucro na uva <b>Crismson</b> será de <b>R$ ${result.toFixed(2)} </b><br>`;
}


function malbec() {
  var faturar = Number(faturamento.value);
  var faturar1 = faturar * 8.60;
  var result = faturar1 * 0.1;

  div_calc.innerHTML += `Seu lucro da uva <b>Malbec</b> será de <b>R$ ${result.toFixed(2)}</b> <br>`;
}

function merlot() {
  var faturar = Number(faturamento.value);
  var faturar1 = faturar * 9.50;
  var result = faturar1 * 0.1;

  div_calc.innerHTML += `Seu lucro  da uva <b>Merlot</b> será de <b> R$ ${result.toFixed(2)}</b> <br> `;
}




