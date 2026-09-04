package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o salário do cliente:");

        double salario = entrada.nextDouble();
        System.out.println("Informe o valor da parcela desejada:");
        double parcela = entrada.nextDouble();
        double porcentagem = salario * 0.30;

        if (parcela <= porcentagem) {

            System.out.println("Emprestimo aprovado");

        } else {

            System.out.println("Emprestimo nao aprovado");
        }
        entrada.close();
    }
}














