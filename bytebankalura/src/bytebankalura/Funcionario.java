package bytebankalura;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private double bonificacao;
	static int contador;
	
	public Funcionario() {
		contador++;
		
	}
	
	public double getBonificacao() {
		return this.bonificacao += this.salario * 0.1;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
