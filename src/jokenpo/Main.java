package jokenpo;

import java.util.Scanner;

public class Main {

        public static void main (String args []){
        System.out.println("... JOGO JOKENPO ...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1 : ");
        String nome1 = scanner.nextLine();
		Jogador jogador1 = new Jogador(nome1, 0);
        System.out.println("Digite o nome do jogador 2 : ");
        String nome2 = scanner.nextLine();
		Jogador jogador2 = new Jogador(nome2, 0);
		
		do {
		
			System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
			System.out.println("Pedra = 0 ");
			System.out.println("Papel = 1  ");
			System.out.println("Tesoura = 2");
		
			System.out.println("Jogador " + jogador1.getNome() + ", digite sua jogada: ");
			int elemento1 = scanner.nextInt();
			Jogada jogada1 = new Jogada(elemento1);
		
			System.out.println("Jogador " + jogador2.getNome() + ", digite sua jogada: ");
			int elemento2 = scanner.nextInt();
			Jogada jogada2 = new Jogada(elemento2);
			
			switch (jogada1.getElemento()){
			case 0: 
				switch (jogada2.getElemento()){
				case 0:
					System.out.println("Empate!");
					break;
				case 1:
					System.out.println(jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					break;
				case 2:
					System.out.println(jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					break;
				default: 
					System.out.println ("Jogada inválida!");
				} break;
			case 1:
				switch(jogada2.getElemento()) {
				case 0: 
					System.out.println(jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					break;
				case 1:
					System.out.println("Empatou!");
					break;
				case 2:
					System.out.println(jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					break;
				default: 
					System.out.println ("Jogada inválida!");
				} break;
			case 2:
				switch(jogada2.getElemento()) {
				case 0:
					System.out.println(jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					break;
				case 1:
					System.out.println(jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vitórias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vitórias.");
					break;
				case 2:
					System.out.println("Empate!");
					break;
				default: 
					System.out.println ("Jogada inválida!");
				} break;
			default: 
				System.out.println ("Jogada inválida!");
			}
		}
		while (jogador1.getVitorias() < 3 && jogador2.getVitorias() < 3);
	if (jogador1.getVitorias() == 3) {
		System.out.println(jogador1.getNome() + " é o grande vencedor!");
	} if (jogador2.getVitorias() == 3) {
		System.out.println(jogador2.getNome() + " é o grande vencedor!");
	}
	}
}