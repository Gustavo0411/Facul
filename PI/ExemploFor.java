package JapaPI;

import java.util.Scanner;
/*
 */

public class ExemploFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.println("Inicio: ");
        inicio = input.nextInt();
        System.out.println("Fim: ");
        fim = input.nextInt();

        for (int i = inicio; i <= fim; i++) {
            System.out.println("i: " + i);
        }

    }
}
