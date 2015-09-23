package JapaPI;
import java.util.Scanner;
/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total 
percorrida (em Km) e o total de combustível gasto (em litros).
*/
public class ConsumoCombustivel{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double km; double litros; double consumo;
        
        System.out.println("Entre com o total de Km percorrido:");
        km = input.nextDouble();
        System.out.println("Entre com o toal de litros utilizado durante a distância percorrida");
        litros = input.nextDouble();
        
        consumo = litros/km;
        System.out.println("O consumo médio foi de: "+consumo+" litros");
        
    }
}