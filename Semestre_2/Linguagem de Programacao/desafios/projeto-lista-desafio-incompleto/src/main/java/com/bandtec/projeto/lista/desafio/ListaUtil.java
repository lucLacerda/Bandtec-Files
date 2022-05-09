package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            inteiros.remove(valor);
        }
    }

    public Integer count() {
        return inteiros.size();
    }

    public Integer countPares() {
        Integer pares = 0;

        for (int i = 0; i < inteiros.size(); i++) {
            if ((inteiros.get(i) % 2) == 0) {
                pares++;
            }
        }

        return pares;
    }

    public Integer countImpares() {
        Integer impares = 0;

        for (int i = 0; i < inteiros.size(); i++) {
            if ((inteiros.get(i) % 2) != 0) {
                impares++;
            }
        }

        return impares;
    }

    public Integer somar() {
        Integer soma = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            soma += inteiros.get(i);
        }
        return soma;
    }

    public Integer getMaior() {
        Integer maior = inteiros.get(0);

        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) > maior) {
                maior = inteiros.get(i);
            }
        }
        return maior;
    }

    public Integer getMenor() {
        Integer menor = inteiros.get(0);

        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) < menor) {
                menor = inteiros.get(i);
            }
        }
        return menor;
    }

    public Boolean hasDuplicidade() {
        Boolean duplicidade = false;

        for (int i = 0; i < inteiros.size(); i++) {
            Integer var = inteiros.get(i);
            
            for (int j = 0; j < inteiros.size(); j++) {
                if (var == inteiros.get(j)) {
                    duplicidade = true;
                }
            }

        }
        return duplicidade;
    }
}
