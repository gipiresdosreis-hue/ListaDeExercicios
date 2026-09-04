package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o cargo do funcionário:  ");

        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("Administrativo") ||
                resposta.equalsIgnoreCase("Liderança")) {

            System.out.println("Programa de idiomas disponível");

        } else {

            System.out.println("Programa de idiomas não disponível");
        }

        entrada.close();
    }
}













