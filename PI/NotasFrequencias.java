package JapaPI;
import java.util.Scanner;
/*
Analisando Notas e Frequencias de um aluno para determinar se este está aprrovado ou reprovado
*/
public class NotasFrequencias {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        
        float n1;
        float n2;
        float n3;
        float media;
        float freq;
        
        System.out.println("Entre com a nota 1");
        n1 = leia.nextInt();
        System.out.println("Entre com a nota 2");
        n2 = leia.nextInt();
        System.out.println("Entre com a nota 3");
        n3 = leia.nextInt();
        System.out.println("Entre com a Frequencia");
        freq = leia.nextInt();
        media = ((n1+n2+n3)/3);
               
        if ((media >=6) && (freq >=75)){
            System.out.println("Aprovado");
        }
        
        else if ((media <6) && (freq >=75)){
            System.out.println("Reprovado por Nota");
        }
        
        else if ((media >=6) && (freq <75)){
            System.out.println("Reprovado por Faltas");
        }
                else
            System.out.println("Reprovado por Nota e Falta");
        
        System.out.println("Media igual a " +media+ " e frequancia igual a " +freq);
    }
}
