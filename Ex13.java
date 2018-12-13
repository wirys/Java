package ex13;

import java.util.*;

/**
 *
 * @author Wirys
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        System.out.println("digite o numero");
        n1 = input.nextDouble();
        System.out.println("digite o numero");
        n2 = input.nextDouble();
        System.out.println("digite o numero");
        n3 = input.nextDouble();
        if (n1 >= n2 & n1 >= n3) {
            System.out.printf("%.1f e o maior",n1);
        } else {  if(n2>n3){
            System.out.printf("%.1f e o maior",n2);
        } else {
            System.out.printf("%.1f e o maior",n3);
        }
        }
    }

}
