package Lista1;
import java.util.Scanner;
/*
23. Fazer um algoritmo que lê quatro números e imprime a média dos quatro números.
*/
public class Lista01_Exerc23{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double n1; double n2; double n3; double n4; double media;
        
        System.out.println("Didite abaixo quatro números sendo um de cada vez:");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();
        
        media = (n1+n2+n3+n4)/4;
        
        System.out.println("A média entre os quatros números é: "+media);        
        
    }
}