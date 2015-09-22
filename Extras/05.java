package Estudar;


import java.util.Scanner;

public class Exercicio02 {
    
     public static void main(String args[]){
         Scanner leitor=new Scanner(System.in);
         System.out.println("Digite o valor de x;");
         int x=0;
         x=leitor.nextInt();
         int f=0;
         
         if(x>=8){
            f=x-1; 
         }
         else if(x>6&&x<8){
             f= (x*x)-1;
         }
         else if(x>-4&&x<=6){
             f=(1-x)*(2-(x*x));
         }
         else if(x<=-4){
             f= x*((x-1)*(x-1)*(x-1));
         }
         System.out.println("f(x)= "+ f);
     }
 }
