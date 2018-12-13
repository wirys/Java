/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotacaodolar;
import java.util.*;

/**
 *
 * @author Wirys
 */
public class CotacaoDolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double real,cotacaoDolar,dolar;
        System.out.println("Digite a cotação do dolar");
        cotacaoDolar=input.nextDouble();
         System.out.println("Digite o valor em reais que voce quer converter"); 
         real=input.nextDouble();
         dolar= real/cotacaoDolar;
         System.out.println("Voce tem "+dolar+" dolares"); 
    }
    
}
