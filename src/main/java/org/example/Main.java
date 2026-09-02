package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lado;

        System.out.println("Informe o lado do seu quadrado em cm:");

        lado = entrada.nextDouble();

        double area = lado * lado;

        System.out.println("Área do quadrado: " + area + " cm quadrados");

        entrada.close();
    }
}








