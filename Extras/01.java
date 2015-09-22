package Estudar;
import java.util.Scanner;

/*
 1)Escreva um programa que leia o valor de x, calcule e imprime valor de f(x) é dado por:
 
 F(x)

 x-25             se  (x =< -5)
 x²-3             se   -5 < x =< 7
 (1-x)*(5-x²)     se   7 < x < 9
 x(x-3)²²         se    x >= 9

 *
 * @author 
 */
public class Exerc01 {

    public static void main(String[] args) {
        int x;
        int f;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x = leia.nextInt();

        if (x <= -5) {
            f = x - 25;
            System.out.println("o valor de F é: " + f);
            System.exit(0);
        }
        if (x < -5 & x <= 7) {
            f = x * x - 3;
            System.out.println("o valor de F é: " + f);
            System.exit(0);
        }
        if (x < 7 & x < 9) {
            f = (1 - x) * (5 - (x * x));
            System.out.println("o valor de F é: " + f);
            System.exit(0);
        }
        if (x >= 9) {
            f = (x - 3) * 4;
            System.out.println("o valor de F é: " + f);
            System.exit(0);
        }
    }

}
