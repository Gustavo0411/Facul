package JapaPI;
import java.util.Scanner;
/*
Faça um programa que lê dois pontos P1 = (x1, y1) e P2 = (x2, y2) e devolve a distância entre estes dois pontos, cujo valor é impresso no programa principal. 
Obs.: DIST = RAIZ ( QUADRADO (x1 - x2) + QUADRADO (y1 - y2) )
Onde QUADRADO significa o valor elevado ao quadrado e RAIZ significa raiz quadrada.
*/
public class DistanciaEntreDoisPontos{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double x1; double x2; double y1; double y2;
        double resultx; double resulty; double distancia;
        
        System.out.println("Entre com o valor de X1"); 
        x1 = input.nextDouble();
        System.out.println("Entre com o valor de X2");
        x2 = input.nextDouble();
        resultx = Math.pow((x1-x2),2);
        //System.out.println(resultx);
        System.out.println("Entre com o valor de Y1");
        y1 = input.nextDouble();
        System.out.println("Entre com o valor de Y2");
        y2 = input.nextDouble();
        resulty = Math.pow((y1-y2),2);
        //System.out.println(resulty);
        
        distancia = Math.sqrt((resultx+resulty));
        System.out.println("A distancia entre P1 e P2 é: "+distancia);
        
    }
}