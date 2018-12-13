/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex25;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class Ex25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         int Ano;
                    System.out.println("digite o ano.");
                    Ano = input.nextInt();
                    if (Ano % 400 == 0){
                        System.out.println(" o ano de" + Ano + " e bissexto");
                    }else if ( Ano % 4 == 0 && Ano % 100 != 0){
                        System.out.println("o ano de" + Ano + "e bissexto");
                    } else {
                        System.out.println("o ano de " + Ano + " não e bissexto");
                    }
        // TODO code application logic here
    }
    
}
