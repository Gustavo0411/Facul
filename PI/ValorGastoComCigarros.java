package JapaPI;

import java.util.Scanner;
/*
 Faça um algoritmo que calcule a quantidade de dinheiro gasto por um fumante com 
 cigarros durante X anos. Para isso, é necessária a quantidade de cigarros 
 fumados por dia, a quantidade X de anos que ele fuma e o preço médio de uma 
 carteira de cigarros. 
 Observação 1: Cada carteira de cigarros contém 20 cigarros.
 Observação 2: Considere cada ano com 365 dias.
 */

public class ValorGastoComCigarros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double CigDia;
        double NumAnos;
        double PrecoMedio;
        double ValorGasto;

        System.out.println("Digite o nº de cigarros consumios durante 1 dia:");
        CigDia = input.nextDouble();
        System.out.println("Digite o nº de anos que fuma:");
        NumAnos = input.nextDouble();
        System.out.println("Digite o valor médio pago em cada carteira de cigarros");
        PrecoMedio = input.nextDouble();

        ValorGasto = ((CigDia / 20) * (NumAnos * 365)) * PrecoMedio;

        System.out.println("O valor médio gasto até o momento com cigarros é: R$" + ValorGasto);

    }
}
