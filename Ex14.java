package ex14;

import java.util.*;

/**
 *
 * @author Wirys
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n[] = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.printf("digite o numero");
            n[i] = input.nextDouble();
        }
        if (n[0] >= n[1] & n[0] >= n[2]) {
            System.out.printf("%.1f e o maior", n[0]);
        } else {
            if (n[1] > n[2] & n[1] > n[3]) {
                System.out.printf("%.1f e o maior", n[1]);
            } else {
                if (n[2] > n[3]) {
                    System.out.printf("%.1f e o maior ", n[2]);
                } else {
                    System.out.printf("%.1f e o maior", n[3]);
                }
            }
        }
    }
}
