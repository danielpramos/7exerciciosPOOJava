package PacotePOOJava;

public class Funcionario4 
{
	/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
	 * em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as 
	 * informa��es deste objeto no console.
	 */
	
	private String nome;
	private String empresa;
	private String cargo;
	private String registro;
	private double salario;
	
	
	public Funcionario4(String nome, String empresa, String cargo, String registro, double salario)
	{
		this.nome = nome;
		this.empresa = empresa;
		this.cargo = cargo;
		this.registro =registro;
		this.salario =salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getRegistro() {
		return registro;
	}


	public void setRegistro(String registro) {
		this.registro = registro;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void imprimirInfo()
	{
		System.out.println("\n"+nome+" trabalha na empresa "+empresa+ " no cargo de "+cargo+", ");
		System.out.println("sua matricula � "+registro+ " e seu sal�rio � de "+salario);
	}
}
