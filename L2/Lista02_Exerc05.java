package Lista2;

import java.util.Scanner;
/*
 5. Faça um programa para imprimir os números pares entre 100 e 1, 
 em ordem decrescente.
 */

public class Lista02_Exerc05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pares;

        for (int i = 100; i > 0; i = i - 2) {
            pares = i;
            System.out.println(pares);
        }

    }
}