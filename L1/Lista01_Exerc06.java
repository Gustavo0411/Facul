package Lista1;
import java.util.Scanner;
/*
6. Fazer um algoritmo que lê dois números e imprime
a divisão do primeiro número pelo segundo.
*/
public class Lista01_Exerc06{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num1; int num2; int divisao;
        
        System.out.println("Digite o primeiro nº:");
        num1 = input.nextInt();
        System.out.println("Digite o segundo nº:");
        num2 = input.nextInt();
        
        divisao = num1/num2;
        
        System.out.println("O resultado da divisão do primeiro nº para o segundo é: "+divisao);
        
    }
}