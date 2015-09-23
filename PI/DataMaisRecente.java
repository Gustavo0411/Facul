package JapaPI;
import java.util.Scanner;
/*
aça um programa que receba do usuário o dia, o mês e o ano da primeira data e o 
dia, o mês e o ano da segunda data. Então, o programa deverá imprimir na tela a 
data mais recente dentre as duas.
*/
public class DataMaisRecente{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int dia1; int mes1; int ano1;
        int dia2; int mes2; int ano2;
        
        System.out.println("Entre com a primeira data:");
        System.out.print("Dia: ");
        dia1 = input.nextInt();
        System.out.print("Mes: ");
        mes1 = input.nextInt();
        System.out.print("Ano: ");
        ano1 = input.nextInt();
        
        System.out.println("Entre com a segunda data:");
        System.out.print("Dia: ");
        dia2 = input.nextInt();
        System.out.print("Mes: ");
        mes2 = input.nextInt();
        System.out.print("Ano: ");
        ano2 = input.nextInt();
        
        if (ano1>ano2){
            System.out.println("A data "+dia1+"/"+mes1+"/"+ano1+" eh a mais recente");
        }
        else if (ano1<ano2){
            System.out.println("A data "+dia2+"/"+mes2+"/"+ano2+" eh a mais recente");
        }
        else if ((ano1==ano2)&&(mes1>mes2)){
            System.out.println("A data "+dia1+"/"+mes1+"/"+ano1+" eh a mais recente");
        }    
        else if ((ano1==ano2)&&(mes1<mes2)){
            System.out.println("A data "+dia2+"/"+mes2+"/"+ano2+" eh a mais recente");
        } 
        else if ((ano1==ano2)&&(mes1==mes2)&&(dia1>dia2)){
            System.out.println("A data "+dia1+"/"+mes1+"/"+ano1+" eh a mais recente");
        }
        else if ((ano1==ano2)&&(mes1==mes2)&&(dia1<dia2)){
            System.out.println("A data "+dia2+"/"+mes2+"/"+ano2+" eh a mais recente");
        }
        else{
            System.out.println("As datas sao iguais");
        }
            
    }
}