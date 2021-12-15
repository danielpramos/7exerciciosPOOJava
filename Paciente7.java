package PacotePOOJava;

public class Paciente7 
{
	/*7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as 
	 * informações deste objeto no console.
	 */
	
	private String nome;
	private int registro;
	private String doenca;
	private long  cpf;
	
	public Paciente7(String nome, int registro, String doenca, long cpf )
	{
		this.nome = nome;
		this.registro = registro;
		this.doenca = doenca;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome: "+nome+"\nNumero de identificação: " +registro+ "\nDoença: "+doenca+"\nCPF: "+cpf);
	}
	
	
}
