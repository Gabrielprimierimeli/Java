package projetoJava;

import java.util.Scanner;

public class NumerosInteiros {

	// Faça um programa que receba três inteiros e diz qual deles é o maior.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
		
		 int n1, n2, n3, maior ;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		
				
				if (n1>= n2)
					maior = n1;
				
				else
					maior = n2;
				
				if(maior <= n3)
					maior = n3;
				
				System.out.println("O maior número é: " + maior);
				
	}

}
