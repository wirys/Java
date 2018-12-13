/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        double n1;
        double n2;
        double resultado;
        System.out.println("Digite o n1");
        n1=input.nextDouble();
        System.out.println("Digite o n2");
        n2=input.nextDouble();
        if(n2<=0){
        System.out.println("o n2 nao pode ser menor ou igual a zero");
        }else {
        resultado = n1/n2;
        System.out.println(resultado);
        }
    }
    
}
