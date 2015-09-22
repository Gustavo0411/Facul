package Lista1;
import java.util.Scanner;
/*
3. Fazer um algoritmo que lê dois números e imprime o produto dos dois números.
*/
public class Lista01_Exerc03{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num1; int num2; int produto;
        
        System.out.println("Digite o primeiro nº:");
        num1 = input.nextInt();
        System.out.println("Digite o segundo nº:");
        num2 = input.nextInt();
        
        produto = num1*num2;
        System.out.println("O produro dos dois Números é: "+produto);
        
    }
}