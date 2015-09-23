package JapaPI;
import java.util.Scanner;
/*
Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que 
diga se ela poderá ou não votar este ano (não é necessário considerar o mês em
que a pessoa nasceu). Lembre-se que o voto é facultativo somente a partir de 16 anos.
*/
public class EssaPessoaPodeVotarV2{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        String nome; int ano; int nasc; int idade;
        
        //System.out.println("Digite o seu nome: ");
        //nome = input.nextLine();
        //nome = input.next();
        
        System.out.println("Digite seu nome:");
        nome = input.nextLine();
        System.out.println("Digite seu ano de nascimento:");
        nasc = input.nextInt();
        System.out.println("Digite o ano atual:");
        ano = input.nextInt();
        
        idade = ano-nasc;
        System.out.println("Sua idade é: "+idade);
       
        if ((idade<16)&&(idade>=0)){
            System.out.println(nome+" nao pode votar");
        }
        else if ((idade>15)&&(idade<18)||(idade>65)){
            System.out.println(nome+" seu voto eh facultativo");
        }
        else if (idade<0){
            System.out.println(nome+" Sua idade eh Invalida");
        }
        else{
            System.out.println(nome+", voce pode votar");
        }
        
    }
}