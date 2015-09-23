package JapaPI;
import java.util.Scanner;
/*
Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo
*/
public class ParImparPositivoNegativo{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int n1;
        
        System.out.println("Digite um número inteiro:");
        n1 = input.nextInt();
        
        if ((n1%2==0)&&(n1>0)){
            System.out.println("Par e positivo");
        }
        else if ((n1%2!=0)&&(n1>0)){
            System.out.println("Impar e positivo");
        }
        else if ((n1%2==0)&&(n1<0)){
            System.out.println("Par e negativo");
        }
        else if ((n1%2!=0)&&(n1<0)){
            System.out.println("Impar e negativo");
        }
        else{
            System.out.println("O número informado é 0, par e positivo");
        }
        
    }
}