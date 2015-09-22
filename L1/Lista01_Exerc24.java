package Lista1;
import java.util.Scanner;
/*
Fazer um algoritmo para resolver a equação (no conjunto dos reais):
axˆ2+bx+c=0 a<>0 (bascara)
*/
public class Lista01_Exerc24{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int a, b, c; 
        double x1, x2;
        
        System.out.println("Escreva o valor de A que seja diferente de 0:");
        a = input.nextInt();
        
        System.out.println("Escreva o valor de B:");
        b = input.nextInt();
        
        System.out.println("Escreva o valor de C:");
        c = input.nextInt();
        
        switch (a) {
            case 0:                  
                System.out.println("Por favor, execute novamente e entre com um novo valor para A que seja diferente de 0");
                break;            
        }
     
        if (a != 0){
            x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);        
            System.out.println("O valor de x é: "+x1+" ou "+x2);
        }
    }
}