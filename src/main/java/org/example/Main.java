package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor;
        double limite = 10000;

        System.out.println("Digite o valor da transação:");
        valor = entrada.nextDouble();

        if (valor > limite) {
            System.out.println("Transação suspeita!");
        } else {
            System.out.println("Transação normal!");
        }

        entrada.close();
    }
}














