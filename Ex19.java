/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex19;
import java.util.*;
/**
 *
 * @author Wirys
 */
public class Ex19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
         double nota;
                    int faltas;

                    System.out.print("Insira os dados do aluno.\nnota: ");
                    nota = input.nextDouble();

                    System.out.print("faltas: ");
                    faltas = input.nextInt();

                    if (nota <= 3.9){
                        if (faltas <= 20){ System.out.println("Conceito: E");
                        } else { System.out.println("Redução de conceito por falta: E -> E");
                        }

                    } else if (nota >= 4.0 && nota <= 4.9){
                        if (faltas < 10){ System.out.println("Conceito: D");
                        } else if (faltas > 10 && faltas <= 20){ System.out.println("Redução de conceito por falta: D -> E");
                        }

                    } else if (nota >= 5.0 && nota <= 7.4){
                        if (faltas < 10){ System.out.println("Conceito: C");
                        } else if (faltas > 10 && faltas <= 20){ System.out.println("Redução de conceito por falta: C -> D");
                        } else { System.out.println("Redução de conceito por falta: C -> D -> E");
                        }

                    } else if (nota >= 7.5 && nota <= 8.9){
                        if (faltas < 10){ System.out.println("Conceito: B");
                        } else if (faltas > 10 && faltas <=20){ System.out.println("Redução de conceito por falta: B -> C");
                        } else { System.out.println("Redução de conceito por falta: B -> C -> D");
                        }

                    } else if (nota >= 9.0 && nota <= 10.0){
                        if (faltas < 10){ System.out.println("Conceito: A");
                        } else if (faltas > 10 && faltas <= 20){ System.out.println("Redução de conceito por falta: A -> B");
                        } else { System.out.println("Redução de conceito por falta: A -> B -> C");
                        }
                    }
        // TODO code application logic here
    }
    
}
