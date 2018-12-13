/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a idade do jogador: ");
                    int idade = input.nextInt();

                     System.out.print("-------------------------------\nCategoria: ");
                    if (idade >= 5 && idade <= 10){ System.out.println("INFANTIL."); }
                    else if(idade >= 11 && idade <= 15) { System.out.println("JUVENIL."); }
                    else if(idade >= 16 && idade <= 20) { System.out.println("JUNIOR."); }
                    else if(idade >= 21 && idade <= 25) { System.out.println("PROFICIONAL."); }
        // TODO code application logic here
    }
    
}
