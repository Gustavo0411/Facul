package Estudar;
import java.util.Scanner;
/*
 */
public class Exerc03 {
/*
*/
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;

        Scanner lado = new Scanner(System.in);

        System.out.print("Qual o valor do lado 1");
        lado1 = lado.nextInt();
        System.out.print("Qual o valor do lado 2");
        lado2 = lado.nextInt();
        System.out.print("Qual o valor do lado 3");
        lado3 = lado.nextInt();

        if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
            System.out.println("Não é possivel executar a ação um dos lados foi definido como zero!");
            System.exit(0);
        }

        if ((lado1 + lado2) < lado3 || (lado1 + lado3) < lado2 || (lado3 + lado2) < lado1) {
            System.out.println("Não é possível executar a ação a soma de dois lados e maior que um lado!");
            System.exit(0);
        }

        if (lado1 == lado2 & lado1 == lado3 & lado2 == lado3) {
            System.out.println("Seu triangulo é Equilatero!");
            System.exit(0);
        }
        if (lado1 != lado2 & lado1 != lado3 & lado2 != lado3) {
            System.out.println("Seu triangulo é Escaleno!");
            System.exit(0);
        } else {
            System.out.println("Seu triangulo é Isóceles!");
            System.exit(0);

        }
    }

}