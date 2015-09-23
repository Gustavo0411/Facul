package JapaPI;
import java.util.Scanner;
/*
Escreva um algoritmo que leia 3 números inteiros do usuário e mostre o MENOR deles. 
Vamos supor que o seu usuário digite a seguinte entrada (ele poderá digitar outros números):
9 5 2 - Nesse caso, seu programa deverá imprimir: 2
*/
public class MenorEntreTresNumeros{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int n1; int n2; int n3;
        
        System.out.println("Digite 3 numeros: ");
        
        System.out.println("Número 1: ");
        n1 = input.nextInt();
        System.out.println("Número 2: ");
        n2 = input.nextInt();
        System.out.println("Número 3: ");
        n3 = input.nextInt();
        
        if ((n1<n2)&&(n1<n3)){
            System.out.println(n1+" É o menor");
        }
        else if ((n2<n1)&&(n2<n3)){
            System.out.println(n2+" É o menor");
        }
        else if ((n3<n1)&&(n3<n2)){
            System.out.println(n3+" É o menor");
        }
        else if ((n1==n2)&&(n2==n3)){
            System.out.println("Os números são iguais");
        }
        else{
            System.out.println("Dados Inválidos");
        }
    }
}