package PacotePOOJava;


public class Aviao2 
{
	/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
    em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as 
    informa��es deste objeto no console.*/
	
	private String nome;
	private double tamanho;
	private int capacidade;
	
	
	public Aviao2(String nome, double tamanho, int capacidade)
	{
		this.nome = nome;
		this.tamanho = tamanho;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public void setligar()
	{
		System.out.println("\n Avi�o ligado...");
	}
	public void imprimirInfo()
	{
		System.out.println("\nO avi�o � da marca "+nome+", seu tamanho � de "+tamanho+
                " e sua capacidade � de "+capacidade+" pessoas.");
	}
	
}
