package com.mycompany.projeto03.ads;

public class Utilitaria {

    /* 
    Crie uma classe Java e escreva um método chamado calcularMedia, que recebe 
    duas notas e retorna a média das notas, como é calculada a média da Faculdade 
    Bandtec (nota1 * 0.4 + nota2 * 0.6). No método main, solicite que o usuário 
    digite 2 notas, chame o método calcularMedia passando as notas digitadas 
    como argumento e exiba o valor retornado pelo método. 
     */
    Double calcularMedia(Double nota1, Double nota2) {
        
        Double media = (nota1 * 0.4 + nota2 * 0.6);
        
        return Math.floor(media);
    }

}
