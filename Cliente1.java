package PacotePOOJava;

public class Cliente1 
{
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	     em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
	     informações deste objeto no console.*/
	
	private String nomeCliente;
    private int idade;
    private double altura;

    public Cliente1 ( String nomeCliente, int idade, double altura)
    {
        this.nomeCliente = nomeCliente;
        this.idade = idade;
        this.altura = altura;
    }
    public void imprimirInfo()
    {
        System.out.println("\n"+nomeCliente+" tem "+idade+
                " anos e sua altura é de "+altura+".");
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }	
}
