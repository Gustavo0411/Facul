package JapaPI;

import java.util.Scanner;
/*
 */

public class ExemploWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 1, y = 5;

        while (x < y) {
            System.out.println(x + " é menor que " + y);
            x++;
        }
        System.out.println("Fim do programa");

    }
}
