package Lista1;
import java.util.Scanner;
/*
11. Fazer um algoritmo que lê dois números e verifica se eles são iguais.
*/
public class Lista01_Exerc11{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int n1; int n2;
        
        System.out.println("Digite o primeiro número:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = input.nextInt();
        
        if (n1==n2){
            System.out.println("Os números são iguais");
        }
        else
            System.out.println("Os números são diferentes");
        
    }
}