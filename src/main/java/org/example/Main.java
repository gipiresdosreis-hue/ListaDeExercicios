package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
    

        System.out.println("Informe o valor do salario do cliente:");
        salario = entrada.nextDouble();

        if (salario > 50000) {
            System.out.println("Isenção aceita ");
        } else {
            System.out.println("Tarifa será mantida");
        }

        entrada.close();
    }
}














