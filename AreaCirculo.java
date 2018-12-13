
package areacirculo;
import java.lang.Math;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double raio = input.nextInt();
       System.out.println("A area do circulo e:"+ Circulo(raio));
    }
    private static double Circulo( double Raio){
        double area;
        area = Math.PI * Math.pow(Raio,2);
    // Retornar o valor da area
    return area;
    
    }
}
