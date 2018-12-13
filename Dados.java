
package dados;
import java.util.*;
public class Dados {

  
    public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
     String nome;
     int idade;
     double altura;
     System.out.println("digite seu nome");
    nome =input.nextLine();
    System.out.println("digite sua idade");
    idade = input.nextInt();
    System.out.println("digite sua altura");
    altura = input.nextDouble();
    System.out.println("Então seu nome é "+ nome+"\n Sua idade e"+ idade +" Anos \n E sua altura e " + altura + "M");
    }
    
}
