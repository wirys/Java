
package notavetor;
import java.util.*;
public class NotaVetor {
 public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
      int nota[]= new int [10];
      int menor;
      for(int i = 0; i <= 9; i++){
        System.out.printf("Insira a nota %d ",i );
        nota[i]= input.nextInt();
      }
      for(int i = 9; i >= 0; i--){
        System.out.printf("Nota[%d] = %d \n",i,nota[i]);
        }
    // buscar a maior nota;
    menor = 0;
    for (int i = 1 ; i <= 9; i++){
        if (nota[i] < nota[menor]) {
            menor = i; 
        }
    }
    System.out.printf("\n A menor nota é %d e na posição %d ", nota[menor], menor);
  }
}

