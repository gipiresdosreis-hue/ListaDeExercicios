package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tempo de empresa em meses: ");

        int meses = entrada.nextInt();

        if (meses >= 3) {
            System.out.println("Plano de saúde está disponível ");
        } else {
            System.out.println("Plano de saúde não está disponível ");
        }

        entrada.close();
    }
}













