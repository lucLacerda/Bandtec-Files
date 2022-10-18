package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class LimiteUltrapassadoException extends ExemploThrow {
    String dataHora;


    public LimiteUltrapassadoException(String msg) {
        super(msg);
        this.dataHora = LocalDate.now().toString();
    }
}