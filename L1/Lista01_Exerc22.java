package Lista1;
import java.util.Scanner;
/*
22. Fazer um algoritmo que lê dois números e imprime a divisão do menor pelo maior.
*/
public class Lista01_Exerc22{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double n1; double n2; double divisao;
        
        System.out.println("Entre com o valor de N1:");
        n1 = input.nextDouble();
        System.out.println("Entre com o valor de N2:");
        n2 = input.nextDouble();
        
        if (n1<n2){
            divisao = n1/n2;
            System.out.println("A divisão do menor número pelo maior é: "+divisao);
        }
        else if (n1>n2){
            divisao = n2/n1;
            System.out.println("A divisao do menor número pelo maior é: "+divisao);
        }
        else
            System.out.println("Os números são iguais");
        
    }
}