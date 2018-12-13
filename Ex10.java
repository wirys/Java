/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;
import java.util.Scanner;

/**
 *
 * @author Wirys
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // TODO code application logic here
        double n1;
        double n2;
         System.out.println("Digite o n1 ");
          n1=input.nextDouble();
        System.out.println("Digite o n2 ");
        n2=input.nextDouble();
        if (n1>0&&n2>0){
        System.out.println("valores validos");
        } else {
         System.out.println("valores invalidos");
        }
    }
    
}
