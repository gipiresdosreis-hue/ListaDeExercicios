package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor do salario?");

        double salario = entrada.nextDouble();

        if (salario >= 4000) {
            System.out.println("Funcionario possui o beneficio do vr");
        } else {
            System.out.println("Funcionario nao possui o beneficio");
        }

        entrada.close();
    }
}













