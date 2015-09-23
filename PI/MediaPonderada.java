package JapaPI;
import java.util.Scanner;
/*
Leia 3 valores, no caso variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, 
a nota B tem peso 3 e a nota C tem peso 5.
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/
public class MediaPonderada{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
                
        double n1; double n2; double n3; double media;
        
        System.out.println("Entre com a Nota 1 escolhendo de 0 a 10:");
        n1 = input.nextDouble();
        System.out.println("Entre com a Nota 2 escolhendo de 0 a 10:");
        n2 = input.nextDouble();
        System.out.println("Entre com a Nota 3 escolhendo de 0 a 10:");
        n3 = input.nextDouble();
        media = ((n1/10)*2)+((n2/10)*3)+((n3/10)*5);
        System.out.println("A media final é"+media);
        
    }
}