package JapaPI;

import java.util.Scanner;

public class ExemploLacosAninhados {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, hora, min, seg;

        while (true) {
            System.out.println("Entre com a hora, minuto e segundo que deseja alarmar, formato 24hrs");
            hora = input.nextInt();
            min = input.nextInt();
            seg = input.nextInt();
            for (int h = 0; h <= 23; h++) {
                for (int m = 0; m <= 59; m++) {

                    for (int s = 0; s <= 59; s++) {
                        System.out.printf("%d:%d:%d \n", h, m, s);
                        if ((h == hora) && (m == min) && (s == seg)) {
                            System.out.println("ALARME!!!");
                            break;
                        }
                    }

                    if ((h == hora) && (m == min)) {
                        break;
                    }
                }

                if (h == hora) {
                    break;
                }
            }

            System.out.println("1-Continuar...");
            x = input.nextInt();
            if (x != 1) {
                break;
            }
        }
    }
}
