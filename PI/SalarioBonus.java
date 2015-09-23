package JapaPI;
import java.util.Scanner;
/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
do mês, com duas casas decimais.
*/
public class SalarioBonus{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String nome; double salario; double vendasCash; double comissao; double salarioTotal;
        
        //System.out.println("Entre com o Nome do vendedor:");
        // nao consegui guardar essa entrada para o nome usando string
        System.out.println("Digite o valor do Salário:");
        salario = input.nextDouble();
        System.out.println("Digite o total de vendas realizadas pelo vendedor:");
        vendasCash = input.nextDouble();
        
        comissao = vendasCash*0.15;
        salarioTotal = salario+comissao;
        
        System.out.println("O Valor total a ser pago é de: "+salarioTotal);
        
    }
}