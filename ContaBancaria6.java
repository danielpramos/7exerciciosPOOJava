package PacotePOOJava;

public class ContaBancaria6 
{
	/*6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
	 *  em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as 
	 *  informações deste objeto no console.
	 */
	
	private String nome;
	private String banco;
	private double agencia;
	private int conta;
	
	public ContaBancaria6(String nome, String banco, double agencia, int conta)
	{
		this.nome = nome;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
	}

	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getBanco() {
		return banco;
	}



	public void setBanco(String banco) {
		this.banco = banco;
	}



	public double getAgencia() {
		return agencia;
	}



	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}



	public int getConta() {
		return conta;
	}



	public void setConta(int conta) {
		this.conta = conta;
	}



	public void imprimirInfo()
	{
		System.out.println("\nNome: "+nome+"\nBanco: " +banco+ "\nAgencia: "+agencia+"\nConta: "+conta);
	}
	
	
	
}
