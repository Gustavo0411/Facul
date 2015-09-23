package JapaPI;
import java.util.Scanner;
/*
Escreva um algoritmo que leia o peso e altura de uma pessoa, calcule e imprima o seu IMC. O IMC é dado pela seguinte fórmula:
IMC = peso / (altura * altura)
*/
public class IndiceDeMassaCorporal{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    double peso;
    double altura;
    double IMC;
    
    System.out.println("Digite seu peso:\n");
    peso = input.nextDouble();
    
    System.out.println("Digite sua altura:\n");
    altura = input.nextDouble();
    
    IMC = peso / (Math.pow(altura, 2));
    System.out.println("O IMC é: "+IMC);
    
}
}