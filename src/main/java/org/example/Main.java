package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double distancia;
        System.out.println("Informe a distancia percorrida: ");
        distancia = entrada.nextDouble();
        System.out.println("Informe o total de combustivel gasto em litros : ");
        double combustivel;
        combustivel = entrada.nextDouble();
        double media= distancia / combustivel;
        System.out.println("O consumo medio de combustivel e : " + media);
    }
}


