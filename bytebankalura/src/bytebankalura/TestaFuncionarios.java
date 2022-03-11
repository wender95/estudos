package bytebankalura;

public class TestaFuncionarios {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Wender");
		System.out.println(f1.getNome());
		Gerente g1 = new Gerente();
		g1.setSalario(1000);
		System.out.println(g1.getSalario());
		g1.setSenha(123);
		g1.autentica(123);
		
	}
}
