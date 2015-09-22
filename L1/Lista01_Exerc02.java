package Lista1;
import java.util.Scanner;
/*
2. Fazer um algoritmo que lê um número e imprime o quadrado desse número.
*/
public class Lista01_Exerc02{
	
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num; double quadrado;
        
        System.out.println("Digite um Nº:");
        num = input.nextDouble();
        
        quadrado = Math.pow((num),2);
        System.out.println("A Quadrado do Nº digitado é: "+quadrado);
        
    }
    
}