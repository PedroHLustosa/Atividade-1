package atividade1;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
			 int x=0;
		     Scanner sc = new Scanner(System.in);
		     for(int i = 0;i < 5;i++){
		         System.out.println("Digite o " + (i+1) + " numero a ser calculado:");
		         int leitura = sc.nextInt();
		         x+=leitura;    
		     }
		     System.out.println("A media aritmetica desses numeros eh: " + ((float)x/5));
		}
	}