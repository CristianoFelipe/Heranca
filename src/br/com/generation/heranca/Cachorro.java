package br.com.generation.heranca;

public class Cachorro extends Animal{
	
	private String nome;
	private String corre;
	private String som;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorre() {
		return corre;
	}
	public void setCorre(String corre) {
		this.corre = corre;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
