/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex23;

import java.util.*;

/**
 *
 * @author Wirys
 */
public class Ex23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, valor, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        n = input.nextInt();
        valor = n;
        n100 = n / 100;
        n %= 100;
        n50 = n / 50;
        n %= 50;
        n20 = n / 20;
        n %= 20;
        n10 = n / 10;
        n %= 10;
        n5 = n / 5;
        n %= 5;
        n2 = n / 2;
        n %= 2;
        n1 = n;
        System.out.println(valor);
        System.out.println(n100 + " notas de R$100,00 ");
        System.out.println(n50 + " notas de R$50,00 ");
        System.out.println(n20 + " notas de R$20,00 ");
        System.out.println(n10 + " notas de R$10,00 ");
        System.out.println(n5 + " notas de R$5,00 ");
        System.out.println(n2 + " notas de R$2,00 ");
        System.out.println(n1 + " notas de R$1,00 ");
        // TODO code application logic here
    }

}
