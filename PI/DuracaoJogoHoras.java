package JapaPI;
import java.util.Scanner;
/*
Escrever um algoritmo que lê a hora de início de um jogo e a hora do final do 
jogo (considerando apenas horas inteiras) e calcula a duração do jogo em horas, 
sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode 
iniciar em um dia e terminar no dia seguinte. 
 */
public class DuracaoJogoHoras {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int horaI; int horaF; int horaT;
        
        System.out.println("entre com a hora inteira de inicio ex 12");
        horaI = input.nextInt();
        System.out.println("entre com a hota inteira de dim ex 17");
        horaF = input.nextInt();
        
        if (horaI>horaF){
        horaT = 24-(horaI-horaF);
        System.out.println("Tempo total de jogo: "+horaT);
        }
        else if (horaI<horaF){
            horaT = ((24-horaI)-(24-horaF));
            System.out.println("Tempo total de jogo: "+horaT);
        }
        else{
            System.out.println("Nao teve uma hora cheia");
        }
    }
}
