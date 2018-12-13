/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex22;

import java.lang.Math;
import java.util.*;

/**
 *
 * @author Wirys
 */
public class Ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, x, delta, x1, x2;
        System.out.println("digite a");
        a = input.nextInt();
        System.out.println("digite b");
        b = input.nextInt();
        System.out.println("digite c");
        c = input.nextInt();
        if (a == 0) {
            System.out.println("Nao e equacao do 2 grau");
        }
        delta = ((b * b) - 4 * a * c);
        if (delta >= 0) {
            x1 = (int) ((-b + (Math.sqrt(delta))) / (2 * a));
            x2 = (int) ((-b - (Math.sqrt(delta))) / (2 * a));

            System.out.printf("X1 vale %f e X2 vale &f", x1, x2);
        } else {
            System.out.println("Nao existe raizes reais");
        }

        // TODO code application logic here
    }

}
