package projetoJava;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        String sigla; 
        
        System.out.printIn("Insira a sigla do seu Estado: ");
        sigla = leia.nextLine();
        
        switch(sigla) {
        case "SP":
        	System.out.println("Voce é de Sao P");
        
	}

}
