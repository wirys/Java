/*
* Programa fala qual e o menor numero informado
* Depois o imprime mostrando o valor menor
*/
import java.util.*;

public class MenorDois {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int n1;
    int n2;
    System.out.print("Número 1: ");
    n1 = input.nextInt();
    System.out.print ("Número 2: ");
    n2 = input.nextInt();
    if (n1 < n2 ){
        System.out.println("Menor: n1= "+ n1);
        
    } else if (n1==n2) {
        System.out.print("n1 = n2 " + n2);
    }
	else {
		System.out.print("Menor : n2 " + n2);
	}
    }
    
}
