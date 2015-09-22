package Lista1;
import java.util.Scanner;
/*
7. Fazer um algoritmo que lê dois números inteiros e imprime a soma dos dois 
números com o resto da divisão do maior número pelo menor.
*/
public class Lista01_Exerc07{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num1; int num2; int soma; int divisao;
        
        System.out.println("Digite o primeiro nº:");
        num1 = input.nextInt();
        System.out.println("Digite o segundo nº:");
        num2 = input.nextInt();
        soma = num1+num2;
        
        if (num1 > num2){
            divisao = num1%num2;
            System.out.println("A soma dos dois nº digitados é "+soma+" e o resto da divisão do maior pelo menor é "+divisao);
        }
        else if (num1 < num2){
            divisao = num2%num1;
            System.out.println("A soma dos dois nº digitados é "+soma+" e o resto da divisão do maior pelo menor é "+divisao);
        }
        else
            System.out.println("A soma dos dois nº digitados é "+soma+" e não estamos dividindo números iguais neste código");     
        
    }
}