package ex3;

import java.util.Scanner;

public class Ex3 {

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[40];
        int par = 0;
        for (int i = 0; i < 40; i++) {
           System.out.printf("Insira o Numero %d ",i );
           num[i]= input.nextInt();
           
           if (num[i] % 2 == 0) {
               par= par+1;
           }
        }
        System.out.print("A quantidade de Numeros Pares No programa são "+ par);
    } 
    

}
