
package ex1;

import java.util.Scanner;
public class Ex1 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int vetor[] = new int[12];
        int valor1;
        int valor2;
        int soma = 0;
        for(int i = 0; i <= 11; i++){
            System.out.printf("Digite o valor %d ", i);
            vetor[i] = input.nextInt();
        }
        System.out.printf("Digite valor1 ");
        valor1 = input.nextInt();
        System.out.printf("Digite valor2 ");
        valor2 = input.nextInt();
        for(int i = valor1; i <= valor2; i++){
           soma = soma + vetor[i];
        }
        System.out.printf("\n\nValores somados");
        System.out.printf("soma %d \n", soma);    
    
    }
    
    
    
}
