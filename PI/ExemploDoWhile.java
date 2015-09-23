package JapaPI;

import java.util.Scanner;
/*
 no foi usado o do
 */

public class ExemploDoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 10;
        int i = 1;

        while ((i <= n) && (i <= 5)) {
            System.out.println("i: " + i);
            i++;
        }

    }
}
