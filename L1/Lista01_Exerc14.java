package Lista1;
import java.util.Scanner;
/*
14. Fazer um algoritmo que lê dois números e imprime a divisão do maior pelo menor.
*/
public class Lista01_Exerc14{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int n1; int n2; int result;
        
        System.out.println("Digite o primeiro número:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = input.nextInt();
        
        if (n1>n2){
            result = n1/n2;
            System.out.println("A divisão do maior pelo menor é: "+result);
        }
        else if (n1<n2){
            result = n2/n1;
            System.out.println("A divisão do maior pelo menor é: "+result);
        }
        else {
            System.out.println("Os números são iguais");
        }
        
        
    }
}