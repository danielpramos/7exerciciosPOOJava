package PacotePOOJava;

public class Patinete5 
{
	/*5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as 
	 * informações deste objeto no console.
	 */
	
	private String marca;
	private String modelo;
	private String tipo;
	
	public Patinete5(String marca, String modelo, String tipo)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nMeu amigo tem um patinete da marca "+marca+" , modelo " +modelo+ " do tipo "+tipo+".");
	}
}
