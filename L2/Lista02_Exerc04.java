package Lista2;

import java.util.Scanner;
/*
 4. Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000.
 */

public class Lista02_Exerc04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int serie;

        for (int i = 0; i <= 1000; i = i + 10) {
            serie = i;
            System.out.println(serie);
        }

    }
}
