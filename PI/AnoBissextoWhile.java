package JapaPI;

import java.util.Scanner;
/*
 */

public class AnoBissextoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int anoInicio, anoFim, total = 0;

        System.out.println("Entre com o ano inicial:");
        anoInicio = input.nextInt();
        System.out.println("Entre com o ano final:");
        anoFim = input.nextInt();

        while (anoInicio <= anoFim) {
            //System.out.println("Ano Bissexto " + anoInicio);
            anoInicio = anoInicio + 4;
            total = total + 1;

        }
        System.out.println("O total de anos Bissexto é: " + total);
    }
}
