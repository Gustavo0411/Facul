package JapaPI;

import java.util.Scanner;
/*
 Escrever um algoritmo que lê um conjunto de 4 valores i, a, b, c, onde i é um 
 valor inteiro e positivo e a, b, c, são quaisquer valores reais e os escreva.
 Se i=1 escrever os três valores a, b, c em ordem crescente.
 Se i=2 escrever os três valores a, b, c em ordem decrescente.
 Se i=3 escrever os três valores a, b, c de forma que o maior entre a, b, c 
 fique dentre os dois. 
 */

public class Ordenar03NumManeirasDiferentes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        double a;
        double b;
        double c;

        System.out.println("entre com um valor para i sendo de 1 a 3");
        i = input.nextInt();
        System.out.println("entre com um valor para a");
        a = input.nextInt();
        System.out.println("entre com um valor para b");
        b = input.nextInt();
        System.out.println("entre com um valor para c");
        c = input.nextInt();

    }

}
