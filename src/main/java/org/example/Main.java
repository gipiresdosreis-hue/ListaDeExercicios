package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor em metros: ");
        double metros;
        metros = entrada.nextDouble();
        double cm;
        cm = metros * 100;
        System.out.println("O valor em cm e : " + cm );



    }
}



