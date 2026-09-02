package org.example;

public class Main {
    public static void main(String[] args) {

        float varf = 2.7f;

        long varL = (long) varf;

        // casting explícito
        double varD = varL;

        System.out.println("Valor do float: " + varf);
        System.out.println("Valor do long: " + varL);
        System.out.println("Valor do double: " + varD);
    }
}

