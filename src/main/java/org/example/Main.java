package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double real;
        System.out.println("Informe o valor em real: ");
        real  = entrada.nextDouble();
        System.out.println("Informe a cotacao atual do dolar : ");
        double dolar;
        dolar = entrada.nextDouble();
        double valorFinal = real / dolar;
        System.out.println("O valor " + real + " em dolares e: " + valorFinal);
    }
}


