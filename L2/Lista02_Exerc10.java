package Lista2;

import java.util.Scanner;
/*
 Escreva um programa para encontrar o menor número inteiro ímpar divisível 
 por 3, cuja terceira potência (ou seja, o número elevado ao cubo) é maior 
 que 4000. Utilize apenas um laço no programa;
 O laço deve iniciar em 1 e parar quando o número for encontrado;
 Ao final, imprimir: “O número requerido é:” e imprimir o número.
 */

public class Lista02_Exerc10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 1;
        int x;

        while (true) {

            x = n;

            if ((x % 2 != 0) && (x % 3 == 0)) {
                System.out.println(x);
                x = (int) Math.pow((x / 3), 3);
                //System.out.println(x);
                if (x >= 4000) {
                    //System.out.println(x);
                    break;
                }
            }
            n++;
        }
    }

}
