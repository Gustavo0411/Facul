package Lista2;

import java.util.Scanner;
/*
 Faça um programa que mostre todos os números inteiros de 1 a 50. 
*/

public class Lista02_Exerc01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 50;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}