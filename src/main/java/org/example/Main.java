package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println( "Qual o valor de A ? ");
        int A;
        A = entrada.nextInt();
        System.out.println( "Qual o valor de B ? ");
        int B;
        B = entrada.nextInt();
        System.out.println("Primeiro valor: A = " + A + " e B = " + B);

        int temporaria = A;
        A = B;
        B = temporaria;
        System.out.println( "Segundo valor: A =  " + A  + " e " + B );


    }
}



