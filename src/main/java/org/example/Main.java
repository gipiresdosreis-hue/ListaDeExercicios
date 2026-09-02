
        package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double altura;

        System.out.println("Informe a altura do seu retângulo em cm:");
        altura = entrada.nextDouble();

        System.out.println("Informe a base do seu retângulo em cm:");
        double base = entrada.nextDouble();

        double perimetro = base + base + altura + altura;

        System.out.println("Perímetro do retângulo: " + perimetro + " cm");

        entrada.close();
    }
}










