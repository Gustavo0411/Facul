package JapaPI;
import java.util.Scanner;
/*
Faça um programa que leia o nome e uma idade e verifique a classe eleitoral da 
pessoa. Lembre-se que: até 16 anos não pode votar, entre 16 a 17 é facultativo e
maior que 65 é facultativo. O restante das idades é obrigatório.
*/
public class EssaPessoaPodeVotar{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        String nome; int idade;
        
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        //nome = input.next();
        
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();
        
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
            System.out.println(nome+" voce pode votar");
        }
        
    }
}