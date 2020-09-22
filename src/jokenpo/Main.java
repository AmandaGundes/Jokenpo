package jokenpo;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		System.out.println("..... JOGO JOKENPO .....");

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nDigite o nome do jogador: ");
		String nome1 = scanner.nextLine();
		Jogador jogador1 = new Jogador(nome1, 0);
		
		Jogador jogador2 = new Jogador("Computador", 0);
		
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println("\nEscolha entre 0, 1 e 2 , sendo: ");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println("\nPEDRA = 0");
		System.out.println("PAPEL = 1");
		System.out.println("TESOURA = 2");

		do {

			System.out.print("\nJogador " + jogador1.getNome() + ", digite sua jogada: ");
			int elemento1 = scanner.nextInt();
			Jogada jogada1 = new Jogada(elemento1);
			jogada1.validarJogada(elemento1);
			jogador1.retorno(elemento1);
			
			Random aleatorio = new Random();
			int elemento2 = aleatorio.nextInt(2);
			Jogada jogada2 = new Jogada(elemento2);
			jogador2.retorno(elemento2);

			switch (jogada1.getElemento()) {
			case 0:
				switch (jogada2.getElemento()) {
				case 0:
					System.out.println("Empate!");
					break;
				case 1:
					System.out.println();
					System.out.println("\n" + jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					break;
				case 2:
					System.out.println();
					System.out.println("\n" + jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					break;
				}
				break;
			case 1:
				switch (jogada2.getElemento()) {
				case 0:
					System.out.println("\n" + jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					break;
				case 1:
					System.out.println("Empatou!");
					break;
				case 2:
					System.out.println("\n" + jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					break;
				}
				break;
			case 2:
				switch (jogada2.getElemento()) {
				case 0:
					System.out.println("\n" + jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					break;
				case 1:
					System.out.println("\n" + jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					break;
				case 2:
					System.out.println("Empate!");
					break;
				}
				break;
			}

		} while (jogador1.getVitorias() < 3 && jogador2.getVitorias() < 3);
		if (jogador1.getVitorias() == 3) {
			System.out.println("\n" + jogador1.getNome() + " é o grande vencedor!");
		}
		if (jogador2.getVitorias() == 3) {
			System.out.println("\n" + jogador2.getNome() + " é o grande vencedor!");
		}
	}
}