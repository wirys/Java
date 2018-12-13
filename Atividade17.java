package atividade17;

import java.util.*;

public class Atividade17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        double l;
        double kml;
        System.out.println("Digite a quantidade e Km percorridos ");
        km = input.nextDouble();
        System.out.println("digite o consumo em litros");
        l = input.nextDouble();
        kml = km / l;
        if (kml < 8) {
            System.out.println("Venda esse carro logo");
        }
        if (kml > 8 & kml < 14) {
            System.out.println("O veiculo e economico ");
        }
        if (kml > 14) {
            System.out.println("O veiculo e super economico");
        }
        System.out.println(kml);
    }

}
