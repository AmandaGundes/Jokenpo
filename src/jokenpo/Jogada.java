package jokenpo;

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

	public int validarJogada(int num) {
		int numero = num;
		while (numero != 0 && numero != 1 && numero != 2) {
			System.out.println("\nJogada inválida!");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Escolha entre 0, 1, 2\nSua escolha: ");
			numero = scanner.nextInt();
			continue;
			}
		
		return this.elemento = numero;
	}
	
	
}
