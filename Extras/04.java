package Estudar;


import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String args[]){
        Scanner leitor=new Scanner(System.in);
        int contador=0;
        int eeletric=0,emec=0,equim=0,eprod=0;
        
        while(contador<10){
            System.out.println("Digite seu nome:");
            String nome=leitor.next();
            System.out.println("Digite o código do seu curso:\n 01-Eng. Elétrica \n 02-Eng.Mecânica \n 03-Eng.Química \n 04-Eng.Produção");
            int curso=leitor.nextInt();
            contador++;
            
            if(curso==01){
               eeletric++;
            }
            else if(curso==02){
                emec++;
            }
            else if(curso==03){
                equim++;
            }
            else if(curso==04){
                eprod++;
            }
         }
        if(eeletric>emec&&eeletric>equim&&eeletric>eprod){
            System.out.println("Eng. Elétrica possui "+eeletric+" aluno(s)");
        }
        else if (emec>eeletric&&emec>equim&&emec>eprod){
            System.out.println("Eng. Mêcanica possui "+emec+" aluno(s)");
        }
        else if(equim>emec&&eeletric<equim&&equim>eprod){
            System.out.println("Eng. Química possui "+equim+" aluno(s)");
        }
        else if(eprod>emec&&eprod>equim&&eeletric<eprod){
            System.out.println("Eng. Produção possui "+eprod+" alunos");
        }
        
        System.out.println("O curso de Eng. Elétrica possui "+(eeletric*100)/10+"% das matriculas");
        System.out.println("O curso de Eng. Mêcanica possui "+(emec*100)/10+"% das matriculas");
        System.out.println("O curso de Eng. Química possui "+(equim*100)/10+"% das matriculas");
        System.out.println("O curso de Eng. Produção possui "+(eprod*100)/10+"% das matriculas");
    }
    
}
