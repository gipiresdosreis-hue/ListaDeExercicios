package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a renda mensal: ");
        double renda = entrada.nextDouble(); 

        System.out.println("Informe o score de crédito");
        double credito = entrada.nextDouble(); 
        
        if (renda >= 8000 && credito >= 7000) {
            System.out.println("Aprovado");
        } else { 
            System.out.println("Reprovado");
        }
 

    }
}














