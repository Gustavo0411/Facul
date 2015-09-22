package Lista1;
import java.util.Scanner;
/*
15. Fazer um algoritmo que lê um número e verifica se ele é negativo.
*/
public class Lista01_Exerc15{
	public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double n1;
        
        System.out.println("Digite um número qualquer que seja negativo:");
        n1 = input.nextDouble();
        
        if (n1<0){
            System.out.println("OK, o número digitado é negativo");
        }
        else {
            System.out.println("O número é positivo, por favor, entre com um número negativo");
        }
        
    }
}