/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8oito;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class EX8oito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double apostador1; // Valor apostado jogador 1
        double apostador2; // Valor apostado jogador 2
        double apostador3; // Valor apostado jogador 3
        double valor1;//valor recebido j1
        double valor2;// valor recebido j2
        double valor3;// valor recebido j3
        double valort; // valor total obtido
        double p1; // porcentagem jog1
        double p2; //porcentagem jog2
        double p; //premio
         double p3; //porcentagem jog3
        System.out.print("Valor apostado Jogador 1: ");
        apostador1= input.nextDouble();
        System.out.print("Valor apostado Jogador 2: ");
        apostador2=input.nextDouble();
        System.out.print("Valor apostado Jogador 3: ");
        apostador3=input.nextDouble();
       // VALOR TOTAL RECEBE A SOMA DAS VARIAVEIS DOS JOGADORES 1 A 3
      valort=apostador1+apostador2+apostador3;
       // calcula a porcentagem no qual cada jogador investiu
       System.out.print("Valor do premio: ");
       p=input.nextDouble();
       p1=(apostador1*100)/valort;
       p2=(apostador2*100)/valort;
       p3=(apostador3*100)/valort;
       // Calcula o valor recebido por cada e o imprime
       valor1=(p1*p)/100;
       System.out.printf("O apostador 1 investiu R$ %.2f e ganhou R$ %.2f \n",apostador1,valor1);
       valor2=(p2*p)/100;
        System.out.printf("O apostador 2 investiu R$ %.2f e ganhou R$ %.2f \n",apostador2,valor2);
       valor3=(p3*p)/100;
        System.out.printf("O apostador 3 investiu R$ %.2f e ganhou R$ %.2f \n ",apostador3,valor3);
    
    }
    
}
