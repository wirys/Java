/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex16;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         double eX, eY;
                    System.out.print("entre com as coordenandas dos eixos X e Y:\neixo X: ");
                    eX = input.nextDouble();
                    System.out.print("eixo Y: ");
                    eY = input.nextDouble();

                    if(eY > 0 && eX > 0){
                        System.out.println("Este ponto esta no 1º quadrante.");
                    } else if(eY < 0 && eX < 0){
                        System.out.println("Este ponto esta no 3º quadrante.");
                    } else if(eY < 0 && eX > 0){
                        System.out.println("Este ponto esta no 4º quadrante.");
                    } else if (eY > 0 && eX < 0){
                        System.out.println("Este ponto esta no 2º quadrante.");
                    } else if (eY == 0 && eX != 0){
                        System.out.println("Este ponto esta sobre o eixo X.");
                    } else if (eX == 0 && eY != 0){
                        System.out.println("Este ponto esta sobre o eixo Y.");
                    }
        // TODO code application logic here
    }
    
}
