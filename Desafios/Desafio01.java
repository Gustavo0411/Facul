package Desafios;

import java.util.Scanner;
/*
 fazer um algoritmo que você digitava 5 números e ele apontava qual o maior
 Lembrando que pode ter números negativos e tem que ser em laço
 */

public class Desafio01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //int[] n = new int[5];
        int n;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("N: ");
            n = input.nextInt();

            if (n > maior) {
                maior = n;
            }

        }

        System.out.println(maior);

    }
}
