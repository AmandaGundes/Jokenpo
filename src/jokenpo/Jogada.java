package jokenpo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogada {

	private int elemento;

	public Jogada(int elemento) {
		this.elemento = elemento;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
	public static int validarNum(Scanner num) {
		while(true) {
			try {
				return num.nextInt();
			}
			catch(InputMismatchException e) {
				num.next();
				System.out.println("\nJogada inválida!");
				System.out.print("Digite 0 para PEDRA, 1 para PAPEL ou 2 para TESOURA\nSua escolha: ");
				
			}
		}
	}
		
		
	public int validarJogada(int num) {
		int numero = num;
		while (numero != 0 && numero != 1 && numero != 2) {
			System.out.println("\nJogada inválida!");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Digite  0 para PEDRA, 1 para PAPEL ou 2 para TESOURA\nSua escolha: ");
			numero = validarNum(scanner);
			continue;
			}
		
		return this.elemento = numero;
	}
	
	
}
