package Lista2;

import java.util.Scanner;
/*
 Faça um programa que receba um número e realize as seguintes operações:
 Caso o número seja maior do que 5, some 100 a este número;
 Caso o número seja menor do que 5, multiplique 50 a esse número;
 Caso o número seja igual a 5, diminua 5 deste número;
 As operações anteriores devem ser repetidas 5 vezes, acumulando os valores 
 das iterações anteriores.
 */

public class Lista02_Exerc08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String resp = "";
        int result;
        int num;
        int total = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um valor inteiro qualquer:");
            num = input.nextInt();

            if (num < 5) {
                result = num * 50;
                resp = num + " * " + 50;
            } else if (num == 5) {
                result = num - 5;
                resp = num + " - " + 5;
            } else {
                result = num + 100;
                resp = num + " + " + 100;
            }

            total = total + result; // total += result; 
            System.out.println("Resposta: " + resp + " = " + result + "\n");

        }

        System.out.println("\nToral geral:  " + total);

    }
}
