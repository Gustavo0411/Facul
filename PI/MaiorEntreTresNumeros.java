package JapaPI;

import java.util.Scanner;
/*
 Analisando qual numero é maior a partir de 3 entradas
 */

public class MaiorEntreTresNumeros {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero");
        int n3 = sc.nextInt();

        if ((n1 > n2) && (n2 > n3)) {
            System.out.println("O num " + n1 + " é o maior");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("O num " + n2 + " é o maior");
        } else if ((n3 > n1) && (n3 > n2)) {
            System.out.println("O num " + n3 + " é o maior");
        } else {
            System.out.println("Todos sao iguais");
        }
    }
}
