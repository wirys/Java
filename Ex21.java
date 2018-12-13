/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex21;

import java.util.*;

/**
 *
 * @author Wirys
 */
public class Ex21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Sexo;
        double pesoih,pesoim,a,pesoideal;
        System.out.println("Digite o sexo h/m");
        Sexo = input.nextLine();
        System.out.println("Digite a altura");
        a= input.nextDouble();
        pesoih =(72.7*a)-58;
        pesoim=(62.1*a)-44.7;
        if("m".equals(Sexo)){
        pesoideal=pesoim;
            System.out.printf("O seu peso ideal e %.2f kg",pesoideal);
        }else if("h".equals(Sexo)) {
            pesoideal=pesoih;
            System.out.printf("O seu peso ideal e %.2f kg",pesoideal);
        }
    }
    // TODO code application logic here
}


