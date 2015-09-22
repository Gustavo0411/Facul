package Lista1;
import java.util.Scanner;
/*
20. Fazer um algoritmo que verifica a maior área entre 
um quadrado de lado L e um círculo de raio R.
*/
public class Lista01_Exerc20{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double lado; double raio; double areaq; double areac; double divisao;
        
        System.out.println("Entre com o valor L do quadrado");
        lado = input.nextDouble();
        
        System.out.println("Entre com o valor do raio: ");
        raio = input.nextDouble();
        
        areaq = Math.pow(lado,2);
        areac = Math.pow(raio,2)*Math.PI;
        
        if (areaq>areac){
            divisao = areaq/areac;
            System.out.println("Neste caso área é maior que o raio, e divindo o maior pelo menor o resultado é: "+divisao);
        }
        else if (areaq<areac){
            divisao = areac/areaq;
            System.out.println("Neste caso raio é maior que a área, e divindo o maior pelo menor o resultado é: "+divisao);
        }
        else
        System.out.println("O resultado da área do quadrado é igual ao raio do circulo");
        
    }
    
}