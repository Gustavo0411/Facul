package JapaPI;
import java.util.Scanner;
/*
Leia quatro valores inteiros A, B, C e D. A seguir,
calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).
*/
public class DiferencaProduto{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int valorA; int valorB; int valorC; int valorD; int p1; int p2; int diferenca;
        
        System.out.println("Entre com o Valor A:");
        valorA = input.nextInt();
        System.out.println("Entre com o Valor B:");
        valorB = input.nextInt();
        System.out.println("Entre com o Valor C:");
        valorC = input.nextInt();
        System.out.println("Entre com o Valor D:");
        valorD = input.nextInt();
        
        p1 = valorA*valorB;
        p2 = valorC*valorD;
        diferenca = p1-p2;
        //diferenca = (valorA*valorB)-(valorC*valorD);
        System.out.println("A diferença entere o produto AB para o CD é:"+diferenca);      
        
    }
}