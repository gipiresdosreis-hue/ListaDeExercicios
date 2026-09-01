package aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a quantidade de segundos: ");
        double segundos = entrada.nextDouble();

        double minutos = segundos / 60;
        double horas = segundos / 3600;


                System.out.println("Segundos: " + segundos +
                ", minutos: " + minutos +
                ", horas: " + horas);


        
    }
}