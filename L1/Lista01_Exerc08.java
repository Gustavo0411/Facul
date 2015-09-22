package Lista1;
import java.util.Scanner;
/*
8. Fazer um algoritmo que lê um número e imprime o valor absoluto desse número.
*/
public class Lista01Exerc08{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num; double abs;
        
        System.out.println("Digite um nº:");
        num = input.nextDouble();
        
        //abs = Math.abs(num);
        //System.out.println("Resp: "+abs);
        if (num<0){
            abs = (num*(-1));
            System.out.println("Resp: "+abs);
        }
        else 
        System.out.println("Resp: "+num);
        
    }
}