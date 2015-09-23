package JapaPI;
import java.util.Scanner;
/*
Elaborar um algoritmo que lê 2 valores numéricos a e b. Depois, seu algoritmo 
deve verificar se são múltiplos e escrever a mensagem: 
"São múltiplos" ou "Não são múltiplos".
*/
public class MultiplicidadeDeDoisNumeros{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int a; int b;
        
        System.out.println("entre com o valor de a");
        a = input.nextInt();
        System.out.println("entre com o valor de b");
        b = input.nextInt();
        
        if ((a>b)&&((a%b)==0))  {
            System.out.println("Sao multiplos");
        }
        else if ((b>a)&&((b%a)==0))  {
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }
        
    }
    
}