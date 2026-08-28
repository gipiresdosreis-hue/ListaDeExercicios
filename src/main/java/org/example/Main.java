package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor inteiro: ");
        int valor1;
        valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valor2;
        valor2 = entrada.nextInt();
        int divisao;
        divisao = valor1 / valor2;;
        int qouciente;
        qouciente = valor1 % valor2;
        System.out.println("Resultado na divisao: " + divisao);
        System.out.println("Resultado do quocinte: " + qouciente);
      }
}
