package Desafios;
/*
 Desafio do numero sorteado
 */

import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sorteado = (int) (Math.random() * 100);
        int numero = -1;

        while (numero != sorteado) {
            System.out.println("Digite o numero: ");
            numero = sc.nextInt();

            if (numero < (int) sorteado) {
                System.out.println("O numero digitado é menor que o sorteado");
            } else if (numero > (int) sorteado) {
                System.out.println("O numero digitado é maior que o sorteado");
            } else {
                System.out.println("O numero digitado é o sorteado!!");
                break;
            }
        }

    }

}
