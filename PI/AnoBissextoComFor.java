package JapaPI;
import java.util.Scanner;
/*
 */

public class AnoBissextoComFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int anoInicio;
        int anoFim;
        int total = 0;

        System.out.println("Entre com o ano inicial:");
        anoInicio = input.nextInt();
        System.out.println("Entre com o ano final:");
        anoFim = input.nextInt();

        for (int i = anoInicio; i <= anoFim; i = i + 4) {
            //System.out.println(i);
            total = total + 1;
        }
        System.out.println("O total de anos bissexto é: "+ total);
    }
}
