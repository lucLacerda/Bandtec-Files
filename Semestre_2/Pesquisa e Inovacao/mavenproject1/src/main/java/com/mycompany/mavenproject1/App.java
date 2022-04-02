package com.mycompany.mavenproject1;

import com.github.britooo.looca.api.core.Looca;
import com.github.javafaker.Faker;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.forLanguageTag("pt-br"));
        Looca looca = new Looca();

        System.out.println("Hello " + looca.getSistema());

    }
}
