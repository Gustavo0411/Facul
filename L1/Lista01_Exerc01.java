package Lista1;
import java.util.Scanner;
/*
1. Fazer um algoritmo que lê um número e imprime o número.
*/
public class Lista01_Exerc01 {
    public static void main(String args[]){
        
        Scanner var = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite qualquer numero");
        num = var.nextInt();
        System.out.println("Seu numero é: "+num);
                
    }
}
