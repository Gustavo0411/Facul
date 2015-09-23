package JapaPI;
import java.util.Scanner;
/*
Faça um algoritmo que leia uma quantidade em horas, minutos e segundos e 
determine a quantidade em segundos.
*/
public class ConversaoParaSegundos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int horas;
        int minutos;
        int segundos;
        int totalSegundos;
        
        System.out.println("Entre o valor de hora");
        horas = input.nextInt();
        horas = (horas*60)*60;
        
        System.out.println("Entre com o calor dos minutos");
        minutos = input.nextInt();
        minutos = minutos*60;
        
        System.out.println("Entre com o valor dos segundos");
        segundos = input.nextInt();
        
        totalSegundos = horas+minutos+segundos;
        System.out.println("O valor total em segundos é: "+totalSegundos);
                  
    }
}