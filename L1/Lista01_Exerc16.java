package Lista1;
import java.util.Scanner;
/*
16. Fazer um algoritmo que calcula a área de um quadrado de lado L.
*/
public class Lista01_Exerc16{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double lado; double area;
        
        System.out.println("Entre com o valor de L:");
        lado = input.nextDouble();
        
        area = Math.pow(lado,2);
        System.out.println("A área do quadrado é: "+area);
                
    }
}