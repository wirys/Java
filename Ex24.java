/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex24;

import java.util.*;

/**
 *
 * @author Wirys
 */
public class Ex24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int data, dia, dia2, mes, mes2, ano, ano2;
         System.out.println("Digite a dia ");
        dia = input.nextInt();
        System.out.println("Digite a mes");
        mes = input.nextInt();
        System.out.println("Digite a ano ");
        ano = input.nextInt();
          System.out.println("Digite a dia ");
        dia2 = input.nextInt();
        System.out.println("Digite a mes");
        mes2 = input.nextInt();
        System.out.println("Digite a ano ");
        ano2 = input.nextInt();
        if( dia > dia2 && mes > mes2 && ano > ano2){
                      System.out.println("cronologicamente a primeira data e a maoir= " +dia+"/"+mes+"/"+ano);
                    }else {
                     System.out.println("cronologicamente a segunda data e a maoir= " +dia2+"/"+mes2+"/"+ano2);
                    }
        }
    }


