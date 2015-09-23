package JapaPI;
import java.util.Scanner;
/*
Neste problema deve-se ler o código de uma peça 1, o número de peças 1, o valor
unitário de cada peça 1, o código de uma peça 2, o número de peças 2, o valor 
unitário de cada peça 2 e calcula e mostra o valor a ser pago.
*/
public class CalculoSimples{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int CodPeca1; int NumPeca1; double ValorUnitPeca1;
        int CodPeca2; int NumPeca2; double ValorUnitPeca2;
        double ValorPago;
        
        System.out.println("Entre com o cod da peça 1:");
        CodPeca1 = input.nextInt();
        System.out.println("Entre com o nº total de peças 1:");
        NumPeca1 = input.nextInt();
        System.out.println("Entre com o valor unitário da peça 1:");
        ValorUnitPeca1 = input.nextDouble();
        
        System.out.println("Entre com o cod da peça 2:");
        CodPeca2 = input.nextInt();
        System.out.println("Entre com o nº total de peças 2:");
        NumPeca2 = input.nextInt();
        System.out.println("Entre com o valor unitário da peca 2:");
        ValorUnitPeca2 = input.nextDouble();
        
        ValorPago = (NumPeca1*ValorUnitPeca1)+(NumPeca2*ValorUnitPeca2);
        System.out.println("O Total a ser pago é: R$"+ValorPago); 
        
    }
}