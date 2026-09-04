package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe se o funcionário possui veículo próprio: (S/N) ");

        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Auxílio combustível disponível");
        } else {
            System.out.println("Auxílio combustível não está disponível");
        }

        entrada.close();
    }
}













