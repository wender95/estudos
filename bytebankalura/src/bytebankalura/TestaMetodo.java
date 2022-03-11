package bytebankalura;

public class TestaMetodo {
	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Wender", "090.250.839-35");
		Conta cc1 = new ContaCorrente(cliente1);
		cc1.deposita(150);
		Cliente cliente2 = new Cliente("izabela", "074.885.978-55");
		ContaPoupanca cp1 = new ContaPoupanca(cliente2);
		cp1.deposita(500);
		cp1.transfere(150, cc1);
		System.out.println(cc1.getSaldo());
		cc1.saca(100);
		System.out.println(cc1.getSaldo());
		cc1.transfere(100, cp1);
		System.out.println(cc1.getSaldo());
	}

}
