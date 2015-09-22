package Lista1;
import java.util.Scanner;
/*
18. Fazer um algoritmo que calcula o perímetro 
de um retângulo de base B e altura H.
*/
public class Lista01_Exerc18{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double base; double altura; double perimetro;
        
        System.out.println("Digite o valor da base:");
        base = input.nextDouble();
        System.out.println("Digite o valor da altura:");
        altura = input.nextDouble();
        
        perimetro = 2*(base+altura);
        System.out.println("O pereimetro do retangulo é: "+perimetro);
        
    }
}