
package com.mycompany.projeto.poo;

public class ContaCorrente {
    
//    Declarando as caracteristicas da nossa conta.
//    Atributos
    String titular;
    Double saldo;
    
//    Declarando os comportamentos || habilidades da nossa conta.
//    Metodos
    void depositar10() {
        saldo += 10;
    }
    
    void sacar10() {
        saldo -= 10;
    }
}
