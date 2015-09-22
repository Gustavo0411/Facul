package Lista1;
import java.util.Scanner;
/*
25. Fazer um algoritmo que lê três números e verifica se esses números podem ser os lados de um
triângulo.(Dica: cada lado tem que ser menor do que a soma dos outros dois).
*/
public class Lista01_Exerc25{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int n1; int n2; int n3;
        int calc1; int calc2; int calc3; int calc4; int calc5 ; int calc6;
        
        System.out.println("Entre com o valor de N1:");
        n1 = input.nextInt();
        System.out.println("Entre com o valor de N2:");
        n2 = input.nextInt();
        System.out.println("Entre com o valor de N3:");
        n3 = input.nextInt();
        
        calc1=n1-n2;
        calc2=n1+n2;
        calc3=n1-n3;
        calc4=n1+n3;
        calc5=n3-n2;
        calc6=n3+n2;

        if ((calc1)<n3&&n3<(calc2) || (calc3)<n1&&n1<(calc4) || (calc5)<n2&&n2<(calc6)){
            System.out.println("É um triângulo");
        }
        else {
        System.out.println("Não é um triângulo");
        }
                
    }
}