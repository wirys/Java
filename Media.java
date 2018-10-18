import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Media {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome;
		int media, n1,n2;
		FileWriter arq = new FileWriter ("C:\\Users\\20172in032\\Documents\\Nome.txt");
		PrintWriter impressaoArq = new PrintWriter(arq);
		System.out.println("Digite o nome do aluno \n ");
		nome = input.next();
		System.out.println("Digite a primeira nota \n");
		n1 = input.nextInt();
		System.out.println("digite a segunda nota");
		n2 = input.nextInt();
		media = n1 + n2 /2;
		impressaoArq.printf("+----------------------------------------------------+ %n"
				+           "|                                                    |%n"
				+           "|                  BOLETIM ESCOLAR                   |%n"
				+           "+----------------------------------------------------+%n");
		impressaoArq.printf("Nome do aluno: %S %n Nota1: %d %n Nota2: %d %n media: %d ",nome,n1,n2,media);
		arq.close();
		System.out.println("Boletim gravado");
	}
	}


