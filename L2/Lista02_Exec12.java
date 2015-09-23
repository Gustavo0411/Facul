package L2
import java.util.Scanner;
/*
12. Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73.
*/
public class Lista02_Exerc12{
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

        int n = 0, par = 0, soma = 0, media;

        for (int i = 13; i <= 73; i++) {
            if (i % 2 == 0) {
                par = i;
                n = n + 1;
                soma = soma + par;
                //System.out.println(par);
                //System.out.println(n);
                //System.out.println(soma);
            }
        }
        //System.out.println(soma);
        media = (soma / n);
        System.out.println(media);

    }
}
