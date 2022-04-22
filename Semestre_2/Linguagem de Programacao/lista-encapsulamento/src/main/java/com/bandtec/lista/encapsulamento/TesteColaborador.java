package com.bandtec.lista.encapsulamento;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador("Giuliana", "Dev");
        Colaborador colab2 = new Colaborador("Manoel", "Dev",20000.00);
  
        RecursosHumanos rh = new RecursosHumanos();
        
//        System.out.println(colab1.getCargo());
//        System.out.println(colab1.getNome());
//        System.out.println(colab1.getSalario());
//        
//        System.out.println(colab2.getNome());
//        System.out.println(colab2.getSalario());
//        System.out.println(colab2.getCargo());

        System.out.println(colab1.toString());
        System.out.println(colab2.toString());
        
        rh.promoverColaborador(colab1, "Diretora", 20001.00);
        rh.promoverColaborador(colab2, "Super Estagiário", 1501.00);
        rh.reajustarSalario(colab2, 2.0);
        
        System.out.println(colab1);
        System.out.println(colab2);
        
        System.out.println(rh);

    }
}
