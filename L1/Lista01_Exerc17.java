package Lista1;
import java.util.Scanner;
/*
17. Fazer um algoritmo que calcula a área de um retângulo de base B e altura H.
*/
public class Lista01_Exerc17{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double base; double altura; double area;
        
        System.out.println("Digite o valor da Base:");
        base = input.nextDouble();
        System.out.println("Digite o valor da Altura");
        altura = input.nextDouble();
        
        area = base*altura;
        System.out.println("A area do Retângulo é: "+area);
        
    }
}