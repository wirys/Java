/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;
import java.lang.Math;
import java.util.*;


/**
 *
 * @author Wirys
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double raio;
        System.out.println("digite o raio");
        raio = input.nextDouble();
         if (raio < 0){
		System.out.println("Erro o  raio não pode ser negativo");
	   }
	   else{
             System.out.printf("A area do circulo e %.2f:", AreaCirculo(raio));
         }
        
    }
    public static double AreaCirculo(double Raio){
    double area;
    area= Math.PI * Math.pow(Raio,2);
    return area;
    }
    
}
