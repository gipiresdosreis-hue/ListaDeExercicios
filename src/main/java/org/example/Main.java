package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor do produto?");

        double valorProduto = entrada.nextDouble();

        double desconto = 15.0;

        double valorDesconto = valorProduto * desconto / 100;

        double valorFinal = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Seu valor final com desconto é: R$ " + valorFinal);

        entrada.close();
    }
}












