package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o peso: ");
        double peso;
        peso = entrada.nextDouble();
        System.out.println("Informe a altura: ");
        double altura;
        altura = entrada.nextDouble();
        double imc;
        imc = peso / altura * altura;
        System.out.println("O imc e : " + imc );



    }
}



