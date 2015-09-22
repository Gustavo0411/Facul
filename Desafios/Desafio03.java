package desafios;

import java.util.Scanner;

public class Desafio03 {

    public static void main(String args[]) {
        int Player = 0;
        int Player2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Jo-Ken-Po, como jogar? Pedra=0 Papel=1 Tesoura=2");

        for (int x = 0, usuario = 0, pc = 0; Player < 5 && Player2 < 5; x = x + 0) {
            System.out.println("Digite o numero da Pedra,Papel ou Tesoura: ");
            usuario = sc.nextInt();
            pc = (int) (Math.random() * 3);
            if (((usuario == 0) && ((int) pc == 0)) || ((usuario == 1) && ((int) pc == 1)) || ((usuario == 2) && ((int) pc == 2))) {
                System.out.println("Empate");
            } else if (((usuario == 0) && ((int) pc == 1)) || ((usuario == 1) && ((int) pc == 2)) || ((usuario == 2) && ((int) pc == 0))) {
                Player++;
                System.out.printf("Voce perdeu esse round %d \n", Player);

            } else if ((((int) pc == 0) && (usuario == 1)) || (((int) pc == 1) && (usuario == 2)) || (((int) pc == 2) && (usuario == 0))) {
                Player2++;
                System.out.printf("Voce ganhou esse round %d \n", Player2);
            }

        }
    }

}
