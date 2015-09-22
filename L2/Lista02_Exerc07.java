package Lista2;

import java.util.Scanner;
/*
 7. Faça um programa para ler e escrever dados de uma turma de 5 alunos. 
 O programa deve pedir dados como nome, idade e sexo. O programa deve imprimir 
 os dados do aluno mais velho.
 */

public class Lista02_Exerc07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        String sexo;
        String dados = "";
        String idade;
        int idadeAux = 0;
        
        for (int i = 1; i <= 2; i++) {

            System.out.println("Digite o nome:");
            nome = input.nextLine();
            System.out.println("Digite o Sexo M = masculino e F = feminino:");
            sexo = input.nextLine();
            System.out.println("Digite a idade:");
            idade = input.nextLine();

            if (idadeAux < Integer.parseInt(idade)) {
                dados = "Nome: " + nome + ", Sexo: " + sexo + ", Idade: " + idade;
                idadeAux = Integer.parseInt(idade);
            }

        }

        System.out.println(dados);

    }
}