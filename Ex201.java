package ex20.pkg1;

import java.util.*;
import java.lang.Math;

/**
 *
 * @author Wirys
 */
public class Ex201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double la;
        double lb;
        double lc;
        la = input.nextDouble();
        lb = input.nextDouble();
        lc = input.nextDouble();
        if (la >= lb + lc) {
            System.out.println("nenhum triangulo formado");
        } else {
            if (Math.pow(la, 2) == Math.pow(lb, 2) + Math.pow(lc, 2)) {
                System.out.println("Temos um triangulo retangulo");
            } else {
                if (Math.pow(la, 2) > Math.pow(lb, 2) + Math.pow(lc, 2)) {
                    System.out.println("Temos um triangulo Obtusangulo");
                }else{
                if (Math.pow(la, 2) < Math.pow(lb, 2) + Math.pow(lc, 2)) {
                    System.out.println("Temos um triangulo Acutangulo");
                }
                }
            }
        }
// TODO code application logic here
    }

}
