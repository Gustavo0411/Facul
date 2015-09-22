package Lista1;
import java.util.Scanner;
/*
5. Fazer um algoritmo que lê dois números e imprime os dois números e a soma dos
dois números.
*/
public class Lista01_Exerc05{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num1; int num2; int soma;
        
        System.out.println("Digite o primeiro Nº:");
        num1 = input.nextInt();
        System.out.println("Digite o segundo Nº:");
        num2 = input.nextInt();
        
        soma = num1+num2;
        System.out.println("O primeiro Nº é "+num1+", o segundo Nº "+num2+"\nA soma entre os dois é "+soma);
               
    }
}