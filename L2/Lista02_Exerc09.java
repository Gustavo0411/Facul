package Lista2;

import java.util.Scanner;
/*
 Escreva um programa que imprima os múltiplos de 7 menores que 200.
 */

public class Lista02_Exerc09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        for (int i = 1; i <= 200; i++) {
            num = i;
            if ((num % 7) == 0) {
                System.out.println("Os Multiplos de 7 de 0 a 200 são: " + num);
            }
            /*else {
             System.out.println("Nao é multiplo de 7")
             }*/

        }

    }
}
