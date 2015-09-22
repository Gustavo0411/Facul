package Lista1;
import java.util.Scanner;
/*
12. Fazer um algoritmo que lê dois números inteiros e imprime os números 
consecutivos desses números. (exemplos: 3 é consecutivo de 2. –10 é 
consecutivo de –9.)
*/
public class Lista01_Exerc12{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int n1; int n2;
        int nc1; int nc2;
        
        System.out.println("Digite o primeiro número:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número");
        n2 = input.nextInt();
        
        if ((n1>=0)&&(n2>=0)){
            nc1 = n1+1;
            nc2 = n2+1;
            System.out.println("Consecutivo dos números digitados é:"+nc1+" e "+nc2);
        }
        else if ((n1<0)&&(n2<0)){
            nc1 = n1+(-1);
            nc2 = n2+(-1);
            System.out.println("Consecutivo dos números digitados é:"+nc1+" e "+nc2);
        }
        else {
            System.out.println("ação não previsto");
        }
    }

}