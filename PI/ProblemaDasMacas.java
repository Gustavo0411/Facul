package JapaPI;
import java.util.Scanner;
//import java.text.DecimalFormat;

/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs 
compradas, calcule e escreva o custo total da compra
*/
public class ProblemaDasMacas{
    public static void main(String[]args){
        
        //DecimalFormat decimal = new DecimalFormat( "0.00" ); 
        Scanner input = new Scanner(System.in);
        /*
        double atacado; double varejo;
        System.out.println("Entre com o valor das macas no atacado");
        atacado = input.nextDouble();
        System.out.println("Entre com o valor das macas no varejo");
        varejo = input.nextDouble();
        */
        double atacado = 1.00; double varejo = 1.30;
        int macas; double valor;
        
        //System.out.println("Entre com o numero de Macas");
        macas = input.nextInt();
        
        if (macas>=12){
            valor = macas*atacado;
            //System.out.println("O valor total a ser pago e:");
            System.out.printf("R$ %.2f", valor);
        }
        else if ((macas<12)&&(macas>0)){
            valor = macas*varejo;
            //System.out.println("O valor total a ser ago e:");
            System.out.printf("R$ %.2f", valor);
        }
        else if (macas==0){
            valor = macas*0;
            System.out.printf("R$ %.2f", valor);
        }
        else{
            System.out.println("Quantidade invalida.");
        }
        
    }
}