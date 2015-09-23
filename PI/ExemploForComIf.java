package JapaPI;

import java.util.Scanner;
/*
 */

public class ExemploForComIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, somaPar = 0, somaImpar = 0;

        System.out.println("Numero: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i = i + 1) {//ou i++
            if (i % 2 == 0) {
                somaPar = somaPar + i;
                System.out.printf("Parcial pares(%d) :%d \n", i, somaPar);
            } else {
                somaImpar = somaImpar + i;
                System.out.printf("Parcial Impares(%d):%d \n", i, somaImpar);
            }
        }

        System.out.println("Soma Pares: " + somaPar);
        System.out.println("Soma Impares: " + somaImpar);
    }
}
