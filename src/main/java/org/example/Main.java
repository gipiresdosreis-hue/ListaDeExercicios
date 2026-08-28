package org.example;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorDaHora;

        System.out.println("Informe o valor da hora trabalhada:");
        valorDaHora = entrada.nextDouble();

        System.out.println("Informe o numero de horas trabalhadas no mes:");
        double horaTrabalhada = entrada.nextDouble();

        double salario = valorDaHora * horaTrabalhada;

        System.out.println("O salario bruto e " + salario);

    }
}

