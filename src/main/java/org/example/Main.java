package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor investido pelo cliente:");

        double valor = entrada.nextDouble();


        if (valor <= 10000) {

            System.out.println("Bronze");

        } else if (valor <= 50000){
            System.out.println("Prata");
        }
        else if (valor <=100000){
            System.out.println("Ouro");
        }
        else {
            System.out.println("Platinium");
        }

        entrada.close();
    }
}














