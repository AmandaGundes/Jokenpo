package jokenpo;


public class Jogador {
	
	private String nome;
	private int vitorias;

	public Jogador(String nome, int vitorias) {
		this.nome = nome;
		this.vitorias = vitorias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public void retorno(int num) {
		if(num == 0) {
			System.out.println("\n" + this.nome +  " escolheu PEDRA");
		}
		else if(num == 1) {
			System.out.println("\n" + this.nome +  " escolheu PAPEL");
		}
		else {
			System.out.println("\n" + this.nome + " escolheu TESOURA");
		}
	}
	
}
