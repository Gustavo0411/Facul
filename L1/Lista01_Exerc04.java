package Lista1;
import java.util.Scanner;
/*
Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a 
potência base elevada ao expoente.
*/
public class Lista01_Exerc04{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double base; double expo; double result;
        
        System.out.println("Digite o valor da base:");
        base = input.nextDouble();
        
        System.out.println("Entre com o valor do expoente:");
        expo = input.nextDouble();
        
        result = Math.pow(base,expo);
        
        System.out.println("O resultado potencia da bases pelo expoente é: "+result);
        
        
    }
}