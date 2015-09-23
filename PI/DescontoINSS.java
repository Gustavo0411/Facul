package JapaPI;
import java.util.Scanner;
/*
Faça um programa que entre com o salário de uma pessoa e imprima o seu desconto 
do INSS, de acordo com a tabela a seguir:
FAIXA - DESCONTO
menor ou igual a R$600 - isento;
maior que R$600 e menor ou igual a R$1.200 - 20%;
maior que R$1.200 e menor ou igual a R$2.000 - 25%;
maior que R$2.000 - 30%
*/
public class DescontoINSS{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double salario; double descINSS;
        
        System.out.println("Entre com o salario:");
        salario = input.nextDouble();
        
        if (salario<=600){
            descINSS = 0;
            System.out.printf("R$ %.2f", descINSS);
        }
        else if ((salario>600)&&(salario<=1200)){
            descINSS = salario*0.20;
            System.out.printf("R$ %.2f", descINSS);
        }
        else if ((salario>1200)&&(salario<=2000)){
            descINSS = salario*0.25;
            System.out.printf("R$ %.2f", descINSS);
        }
        else if (salario>2000){
            descINSS = salario*0.30;
            System.out.printf("R$ %.2f", descINSS);
        }
        
    }
}