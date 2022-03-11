package bytebankalura;

public class Conta {
	private double saldo;
	private int agencia = 2587;
	private static int numeroGeral;
	private int numero = 1234;
	Cliente titular;
	
	public Conta (Cliente titular) {
		Conta.numeroGeral++;
		this.numero += Conta.numeroGeral;
		this.titular = titular;
		System.out.println("Conta criada! Titular: " + this.titular.getNome() + ", Agencia: "
		+ this.getAgencia() + ", Conta numero: "+ this.getNumero());
	}
	
	public void deposita(double valor) {
		this.saldo  += valor;
		System.out.println("Deposito realizado no valor de R$ " + valor + ". Saldo em conta é de R$ " + this.saldo);
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado no valor de R$ " + valor + ". Saldo em conta é de R$ " + this.saldo);
			return true;
		}else {
			System.out.println("Saque não efetuado. Saldo indisponivel em conta");
			return false;
			
		}	
	}
	
	public boolean transfere(double valor, Conta titular) {
		if(this.saca(valor)) {
			titular.deposita(valor);
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}	
	public void setAgencia(int agencia) {
		this.agencia = agencia;		
	}	
	public int getAgencia() {
		return this.agencia;
	}	
	public void setTitular(Cliente titular) {
		this.titular = titular;		
	}
	public String getTitularNome() {
		return this.titular.getNome();
	
	}
	public String getTitularCpf() {
		return this.titular.getCpf();
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static int getNumeroGeral() {
		return Conta.numeroGeral;
	}
}
