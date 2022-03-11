package controleclientes;

public class Main {
	public static void main(String[] args) {
		
		Cliente wender = new Cliente();
		wender.nome = "Wender de Oliveira";
		wender.cpf = "090.250.839-35";
		wender.rg = "12.750.112-2";
		Endereco enderecowender = new Endereco();
		
		
		System.out.println(wender.nome);
	}
}
