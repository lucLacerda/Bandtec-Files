package com.mycompany.projeto.lista.adsb;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.forLanguageTag("pt-br"));
        List<String> nome = new ArrayList<>();

        // o metodo add permite adicionar novos elementos em uma lista
        for (int i = 0; i < 10; i++) {
            nome.add(faker.name().fullName());

            System.out.println(
                    String.format(
                            "%d - %s",
                            i + 1,
                            nome.get(i)
                    )
            );

            if (i == 9) {
                nome.set(9, "Lucas Ribeiro de Lacerda");
            }
        }

        for (String nomes : nome) {
            System.out.println("Nome: " + nome);
        }
    }
}
