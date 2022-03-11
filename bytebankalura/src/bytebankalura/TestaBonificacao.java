package bytebankalura;

public class TestaBonificacao {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(5000);	
		System.out.println(f1.getBonificacao());
		Funcionario g1 = new Gerente();
		g1.setSalario(1000);
		g1.setNome("Pai");
		Gerente g2 = new Gerente();
		g2.autentica(123);
		System.out.println(g2.autentica(0));
		System.out.println(g1.getBonificacao());
		Funcionario v1 = new Vendedor();
		v1.setNome("Wender");
		v1.setSalario(1500);
		System.out.println(v1.getBonificacao());
		System.out.println(Funcionario.contador);
		
		
		
		
	}
	
}
