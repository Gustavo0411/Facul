package Lista2;

import java.util.Scanner;
/*
 Faça um programa que leia um número N, some todos os números inteiros de 1 a N, 
 e mostre o resultado obtido.
 */

public class Lista02_Exerc02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, soma = 0;

        System.out.print("entre com o valor de n: \n");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            soma = (soma + i);
        }
        System.out.println(soma);
    }
}
