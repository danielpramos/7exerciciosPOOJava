package PacotePOOJava;

public class ProdutoEletronico3
{	
	
	/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
	 * em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as 
	 * informa��es deste objeto no console.
	 */
	
	private String marca;
	private String modelo;
	private String cor;
	
	
	public ProdutoEletronico3(String marca, String modelo, String cor)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	public void imprimirInfo()
	{
		System.out.println("\nMeu celular � da marca "+marca+", o modelo � o "+modelo+
                " e sua cor � "+cor+" .");
	}
}
