
package ex4;

/**
 *
 * @author Wirys
 */
public class Ex4 {

    public static void main(String[] args) {
      int multiplos[] = new int [10];
      int resultado=7;
      for(int i=0; i < 10;i++){
          multiplos[i]= resultado;
          System.out.printf("\n Os  multiplos de 7 sao %d", multiplos[i]);
          resultado=multiplos[i]*7;
          
      }
    }
    
}
