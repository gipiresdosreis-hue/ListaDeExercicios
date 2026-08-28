package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        double valor;
        valor = entrada.nextDouble();
        System.out.println("Informe a taxa de juros mensal: ");
        double taxa;
        taxa = entrada.nextDouble();
        System.out.print("Informe o tempo em meses: ");
        double meses;
        meses = entrada.nextDouble();
        double juros;
        juros = valor * taxa * meses;
        System.out.println("O valor dos juros simples e " + juros );
    }
}