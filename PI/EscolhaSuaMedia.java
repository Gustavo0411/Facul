package JapaPI;
import java.util.Scanner;
/*
Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja 
calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção 
escolhida pelo usuário e calcule a média.
1 - aritmética
2 - ponderada, considerando os pesos: (3,3,4)
3 - harmônica (Não sabe o que é média harmônica? Google it!)
*/
public class EscolhaSuaMedia{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double n1; double n2; double n3;
        double mediaA; double mediaP; double mediaH;
        String media;
        
        System.out.println("Entre com o tipo de media que deseja: \nAritmetica = A\nPonderada = P\nHarmonica = H");
        media = input.next();
        //System.out.println(media);
        System.out.println("Entre com a Nota 1");
        n1 = input.nextDouble();
        System.out.println("Entre com a Nota 1");
        n2 = input.nextDouble();
        System.out.println("Entre com a Nota 1");
        n3 = input.nextDouble();

        switch (media){
            case "A":
                mediaA = (n1+n2+n3)/3;
                System.out.printf("A = %.2f", mediaA);
                break;
            case "P":
                mediaP = ((n1*3)/10)+((n2*3)/10)+((n3*4)/10);
                System.out.printf("P = %.2f", mediaP);
                break;
            case "H":    
                mediaH = (3/((1/(n1))+(1/(n2))+(1/(n3))));
                System.out.printf("H = %.2f", mediaH);
                break;
        }
    }
}