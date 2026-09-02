package org.example;
public class Main {

    public static void main(String[] args) {

        int nota = 100;
        int frequencia = 50;

        boolean A = nota >= 50;
        boolean B = frequencia >= 60;

        boolean cond1, cond2, cond3;

        cond1 = A && B;
        cond2 = A || B;
        cond3 = !A;

        System.out.println("O aluno passou? " + cond1);
        System.out.println("O aluno passou? " + cond2);
        System.out.println("O aluno passou? " + cond3);
    }
}



