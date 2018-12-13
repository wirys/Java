/**
 * Este programa imprime um triangulo invertido
 
 *******
 ******
 *****
 ****
 ***
 **
 *
 
 * 
 */
public class TrianguloInvertido {
    public static void main(String[] args) {
        for(int i = 10; i >= 1; i-=1){
            for (int  j = i; j >= 1; j-=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}