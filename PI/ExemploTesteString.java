package JapaPI;

import java.util.Scanner;

public class ExemploTesteString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome = "";
        String outroNome = "";

        System.out.println("Digite nome: ");
        nome = input.nextLine();
        System.out.println("Digite outro nome: ");

        outroNome = input.nextLine();

        boolean teste = nome.equals(outroNome);

        if (teste == true) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
