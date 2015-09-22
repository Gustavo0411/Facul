package Estudar;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String args[]){
        Scanner leitor=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("Digite : \n 1 para gasolina \n 2 para álcool \n 3 para gasolina e álcool");
        int opcao=leitor.nextInt();
        double lg=0,la=0;
        double precog=0,precoa=0;
                
        if (opcao==1){
            System.out.println("Digite quantos litros irá comprar:");
            lg=leitor.nextDouble();
           
            
            if(lg>10){
                precog=lg*3.00;
                precog=precog-((precog*15)/100);
                System.out.println("Você recebeu 15% de desconto.O valor á pagar é R$"+df.format(precog));
            }
            else if(lg<=10){
                precog=lg*3.00;
                System.out.println("O valor á pagar é R$"+precog);
            }
        }
        else if(opcao==2){
            System.out.println("Digite quantos litros irá comprar:");
            la=leitor.nextDouble();
            precoa=la*2.60;
            
            if(la<=15){
                precoa=la*2.60;
                precoa=precoa-((precoa*5)/100);
                System.out.println("Você recebeu 5% de desconto.O valor á pagar é R$"+df.format(precoa));
            }
            else if(la>15){
                precoa=la*2.60;
                precoa=precoa-((precog*10)/100);
                System.out.println("Você recebeu 10% de desconto.O valor á pagar é R$"+df.format(precoa));
            }
        }
        else if(opcao==3){
            System.out.println("Digite quantos litros de gasolina irá comprar:");
            lg=leitor.nextDouble();
            
            
            if(lg>10){
                precog=lg*3.00;
                precog=precog-((precog*15)/100);
                System.out.println("Você recebeu 15% de desconto.O valor que irá pagar na gasolina é R$"+df.format(precog));
            }
            else if(lg<=10){
                precog=lg*3.00;
                System.out.println("O valor que irá pagar na gasolina é R$"+df.format(precog));
            }
            
            
            System.out.println("Digite quantos litros de álcool irá comprar:");
            la=leitor.nextDouble();
            
            
            if(la<=15){
                precoa=la*2.60;
                precoa=precoa-((precoa*5)/100);
                System.out.println("Você recebeu 5% de desconto.O valor que irá pagar no álcool é R$"+df.format(precoa));
            }
            else if(la>15){
                precoa=la*2.60;
                precoa=precoa-((precoa*10)/100);
                System.out.println("Você recebeu 10% de desconto.O valor que irá pagar no álcool é R$"+df.format(precoa));
            }
            
        }
        
        
    }
}
