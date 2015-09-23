package L2
import java.util.Scanner;
/*
Escreva um programa que imprima a tabuada de um número inteiro positivo N.
*/
public class Lista02_Exerc11{
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String conta = "";
        int soma = 0;
        int n;
        System.out.println("Entre com o valor de N");
        n = input.nextInt();
        //System.out.println("A tabuada do número escolhido é:");

        for (int i = 1; i <= 10; i++) {
            if (n >= 0) {
                soma = (n * i);
                conta = n + " x " + i;
                System.out.println(conta + " = " + soma);
            } else {
                break;
            }
        }
        System.out.println("Entra com um numero positivo.");
    }
}
