/*
 *
 * Programa que lê três números no teclado e imprime o maior deles
 *
 */
import java.util.Scanner;
public class MaiorTres{
   public static void main(String[] args){
      Scanner ler = new Scanner(System.in);
      int n1;
      int n2;
      int n3;
      System.out.print("Numero 1: ");
      n1 = ler.nextInt();
      System.out.print("Numero 2: ");
      n2 = ler.nextInt();
      System.out.print("Numero 3: ");
      n3 = ler.nextInt();
      if (n1 > n2){
         if (n1 > n3){
            System.out.println("n1 = " + n1 + " é o maior");
         } else {
             System.out.println("n3 = " + n3 + " é o maior");
         }
      } else if (( n2 == n3 )||( n1==n2)){
         System.out.println("Possui 2 valores iguais" + n2 );
	  
      } else if ( n2 > n3 ){
		  System.out.println("n2 = " + n2 + " é o maior");
	  } 
	  else {
         System.out.println("n3 = " + n3 + " é o maior");
      }
   }
}




