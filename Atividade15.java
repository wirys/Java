/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade15;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class Atividade15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double a,b,c;
                    double auxMA = 0,auxME = 0,auxDM = 0;

                    System.out.print("Insira um valor para variavel a: ");
                    a = input.nextDouble();

                    System.out.print("insira um valor para a variavel b: ");
                    b = input.nextDouble();

                    System.out.print("insira um valor para variavel c: ");
                    c = input.nextDouble();

                    if (a < b && a < c){
                        auxME = a;
                    } else if(b < a && b < c){
                        auxME = b;
                    } else {
                        auxME = c;
                    }
                    if (a > b && a > c){
                        auxMA = a;
                    } else if(b > a && b > c){
                        auxMA = b;
                    } else {
                        auxMA = c;
                    }
                    if (a < b && a > c){
                        auxDM = a;
                    } else if(b < a && b > c){
                        auxDM = b;
                    } else if(c < a && c > b){
                        auxDM = c;
                    }
                    System.out.println("sequência\nA = " + auxME + "\nB = "+ auxDM + "\nC = " + auxMA);
        // TODO code application logic here
    }
    
}
