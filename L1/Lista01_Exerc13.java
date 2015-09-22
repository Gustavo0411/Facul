package Lista1;
import java.util.Scanner;
/*
13. Fazer um algoritmo que lê os dois lados de um triângulo retângulo e calcula 
a hipotenusa do triângulo.
ladoA=leia.nextDouble();
ladoB=leia.nextDouble();
resultadoA=(ladoA*ladoA)+(ladoB*ladoB);
hipotenusa=Math.sqrt(resultadoA);
*/
public class Lista01_Exerc13{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double la; double lb; double result; double hipt;
        
        System.out.println("Entre com o lado A:");
            la = input.nextDouble();
        System.out.println("Entre com o lado B:");
            lb = input.nextDouble();
        
        result = (la*la)+(lb*lb);
        hipt = Math.sqrt(result);
        
        System.out.println("A hipotenusa é: "+hipt);
              
        
    }
}