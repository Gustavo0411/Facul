package Lista1;
import java.util.Scanner;
/*
21. Fazer um algoritmo que lê três números e imprime o maior deles.
*/
public class Lista01_Exerc21{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int n1; int n2; int n3;
        
        System.out.println("Entre com o valor do primeiro número:");
        n1 = input.nextInt();
        System.out.println("Entre com o valor do segundo número:");
        n2 = input.nextInt();
        System.out.println("Entre com o valor do terceiro número");
        n3 = input.nextInt();
        
        if ((n1>n2)&&(n1>n3)){
            System.out.println("O número maior é o N1, que é: "+n1);
        }
        else if ((n2>n1)&&(n2>n3)){
            System.out.println("O número maior é o N2, que é: "+n2);
        }
        else if ((n3>n1)&&(n3>n2)){
            System.out.println("O número maior é o N3, que é: "+n3);
        }
        else
            System.out.println("Os números são todos iguais");
    }
}