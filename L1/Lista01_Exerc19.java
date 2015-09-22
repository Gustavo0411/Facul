package Lista1;
import java.util.Scanner;
/*
19. Fazer um algoritmo que calcula a área de um círculo de raio R.
*/
public class Lista01_Exerc19{
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    
    double raio; double area;
    
    System.out.println("Entre com o valor do raio:");
    raio = input.nextDouble();
    
    area = Math.pow(raio,2)*Math.PI;
    System.out.println("O raio do circulo é: "+area);
        
    }
}