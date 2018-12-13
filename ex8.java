package ex8;
import java.lang.Math;
import java.util.*;
public class ex8 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int funcao;
      double Valor;
      double valorpg;
      System.out.println("Escolha uma funcao \n 1------Desconto \n 2------Parcelamento");
      funcao= input.nextInt();
      System.out.println("Digite o valor a pagar");
      Valor = input.nextInt();
      if(funcao==1){
       valorpg= Valor-(Valor*10)/100;
       System.out.println("valor total a pagar R$ "+ valorpg);
       double comissao;
       comissao= valorpg-(valorpg*5)/100;
       comissao=valorpg-comissao;
       System.out.printf("valor total de comissao R$ %.2f", comissao);
      }
      else{
          if(funcao==2){
            double comissao;
            int parcela = 3; 
            comissao= Valor-(Valor*5)/100;
            comissao=Valor-comissao;
            valorpg= Valor/parcela;
            System.out.printf("O cliente ira pagar 3X de R$ %.2f ",valorpg);
            System.out.printf("valor total de comissao R$ %.2f", comissao);
            }
        }
      
    }
    
}
