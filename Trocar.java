/* 
 * 
 */
package trocar;
public class Trocar{
    public static void main(String[] args){
      int[] a = {10, 20, 30, 40, 50,60,70,80,90,100};
      int guarda;
      int ultimo = a.length - 1;
      int meio = a.length / 2 - 1; // É o tamanho do vetor
      for(int i = 0; i <= meio ;i++){  
          System.out.printf("\n Antes: a[%d] = %d", i, a[i]);   
          System.out.printf("\n Antes: a[%d] = %d", ultimo -  i, a[ultimo - i] );   
          guarda = a[i];
          a[i] = a[ultimo - i];
          a[ultimo - i] = guarda;
          System.out.printf("\n Depois: a[%d] = %d", i, a[i]);   
          System.out.printf("\n Depois: a[%d] = %d", ultimo -  i, a[ultimo - i] );   
      } 
      for(int i = 0; i < ultimo; i++){        
          System.out.printf("\n a[%d] = %d ", i, a[i] );   
      }
   }
}
