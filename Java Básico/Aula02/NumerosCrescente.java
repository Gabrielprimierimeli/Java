package projetoJava;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosCrescente {

	public static void main(String[] args) {
	
		//Faça um programa que entre com três números e coloque em ordem crescente.

		
	        double[] vetorDeNumeros = new double[3];
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < vetorDeNumeros.length; i++) {
	            System.out.print("Digite " + (i + 1) + "° numero: ");

	            vetorDeNumeros[i] = (scanner.nextDouble());
	        }

	        Arrays.sort(vetorDeNumeros);

	        System.out.print("Ordem crescente: ");
	        for (double listaDeNumeros : vetorDeNumeros) {
	            System.out.print(listaDeNumeros + "  ");
	        }

	    }
	}
		
		
		