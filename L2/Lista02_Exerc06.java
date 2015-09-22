package Lista2;

import java.util.Scanner;
/*
 Faça um programa que some os números de 1 a 10, apresentando as somas parciais 
 e, no final, o total. 
 A impressão deve seguir o padrão abaixo:
 3 (soma parcial de 1 + 2)
 6 (soma parcial de 1 + 2 + 3)
 ...
 55 (soma parcial dos anteriores com o número 10)
 Soma total: 55
 */

public class Lista02_Exerc06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        String resposta = "0";

        for (int i = 1; i <= 10; i++) {

            total = total + i;
            resposta = i + " + " + resposta;

            System.out.println(total + " Soma parcial de " + resposta);
        }

    }
}
