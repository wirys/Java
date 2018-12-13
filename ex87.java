/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex87;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class EX87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int segundos;
        int minuto;
        int hora;
        System.out.println("Digite a quantidade de segundos");
        segundos = input.nextInt();
        if(segundos >=60){
        minuto= segundos/60;
        if( minuto>=60){
            hora= minuto/60;
            System.out.printf("%d segundos equivale a %d minutos que equivale a %d horas",segundos,minuto,hora);
        }else {
        System.out.printf("%d segundos equivale a %d minutos",segundos,minuto);
        }
      } else {
        System.out.printf("%d segundos",segundos);
        }
    }
    
}
