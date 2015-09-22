package Lista1;
import java.util.Scanner;
/*
9. Fazer um algoritmo que lê dois números e 
imprime a soma dos quadrados dos dois números.
*/
public class Lista01_Exerc09{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num1; double num2; double quadrado1; double quadrado2; double soma;
        
        System.out.println("Digite o primeiro nº:");
        num1 = input.nextInt();
        System.out.println("Digire o segundo nº:");
        num2 = input.nextInt();
        
        quadrado1 = Math.pow((num1),2);
        quadrado2 = Math.pow((num2),2);
        soma = quadrado1+quadrado2;
        
        System.out.println("A soma do quadrado dos dois números é: "+soma);
 
    }
}