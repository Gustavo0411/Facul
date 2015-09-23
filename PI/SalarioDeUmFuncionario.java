package JapaPI;

import java.util.Scanner;
/*
 Escreva um programa que leia o número de um funcionário, seu número de horas
 trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
 A seguir, mostre o número e o salário do funcionário.
 */

public class SalarioDeUmFuncionario {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int CodFunc;
        double NumHoras;
        double ValorHora;
        double Salario;

        System.out.println("Digite o Código do Funcionário:");
        CodFunc = input.nextInt();
        System.out.println("Digite o Número de horas trabalhadas no mês:");
        NumHoras = input.nextDouble();
        System.out.println("Digite o valor/hora do funcionário:");
        ValorHora = input.nextDouble();

        Salario = NumHoras * ValorHora;
        System.out.println("O Valor total a ser pago no mês é: " + Salario);

    }
}
