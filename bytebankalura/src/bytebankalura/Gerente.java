package bytebankalura;

public class Gerente extends Funcionario{
	
	private int senha;


	public double getBonificacao(){
		System.out.println("retornando bonigficação gerente");
		return super.getBonificacao() + super.getSalario();
	}
	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Senha correta");
			return true;
		}else {
			System.out.println("Senha errada");
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
