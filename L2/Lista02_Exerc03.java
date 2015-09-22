package Lista2;

import java.util.Scanner;
/*
 3. Escreva um programa que leia um conjunto de 10 números inteiros positivos e 
 determine o maior deles.
 */

public class Lista02_Exerc03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int maiorPositivo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Entre com um numero maior que 0: \n");
            n = input.nextInt();

            if (n > maiorPositivo) {
                maiorPositivo = n;
            }

        }

        System.out.println(maiorPositivo);

    }
}
