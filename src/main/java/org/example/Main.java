package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio;
        System.out.println("Informe o raio do circulo : ");
        raio  = entrada.nextDouble();
        double area;
        area = 3.14 * raio * raio ;
        System.out.println("A area do circulo e :" + area);
    }
}


