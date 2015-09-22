package Estudar;

import java.util.Scanner;

/**2. Leia o nome de 5 alunos com nome, idade e sexo e verifique o percentual da 
 * quantidade de homens cadastrados e quam é o aluno mais velho.
 *
 * @author Primordial
 */
public class Exerc02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        String sexo;
        int idade;
        int percentualf = 0;
        int percentualm = 0;

        int idadeTeste = 0;
        String nomeTeste = "";
        String sexoTeste = "";

        Scanner leia = new Scanner(System.in);

        String teste = "F";

        for (int i = 0; i < 5; i++) {
            System.out.println("NOME: ");
            nome = leia.next();
            System.out.println("SEXO: (M = Masculino, F = Feminino)");
            sexo = leia.next();
            System.out.println("IDADE: ");
            idade = leia.nextInt();
            System.out.println("***********************************");
         

            if (sexo == teste) {
                percentualf++;
            } else {
                percentualm++;
            }

            if (idade > idadeTeste) {
                nomeTeste = nome;
                sexoTeste = sexo;
                idadeTeste = idade;
            }

        }

        System.out.println("Aluno mais velho:    Nome: " + nomeTeste + " | Sexo: " + sexoTeste + " | Idade: " + idadeTeste);
        System.out.println("% de Homens " + percentualm + "%");
        System.out.println("% de Mulheres " + percentualf + "%");

    }

}
