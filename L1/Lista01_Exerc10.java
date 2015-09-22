package Lista1;
import java.util.Scanner;
/*
10. Fazer um algoritmo que lê dois números inteiros e imprime o resto da divisão
do maior número pelo menor.
*/
public class Lista01Exerc10{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int n1; 
        int n2; 
        int resto;
        
        System.out.println("Digite o primeiro número:");
        n1 = input.nextInt();
        
        System.out.println("Digite o segundo número:");
        n2 = input.nextInt();
        
        if (n1>n2){
            resto = n1%n2;
            System.out.println("O resto do maior número pelo menor é: "+resto);
        
        } else if (n1<n2){
            resto = n2%n1;
            System.out.println("O resto do maior número pelo menor é: "+resto);
        } else {
                System.out.println("Os números são iguais");
        }
    }
}