package bytebankalura;

public class ContaCorrente extends Conta {
	
	private double taxaSaque = 0.20;

	public ContaCorrente(Cliente titular) {
		super(titular);
	}
	
	public boolean saca(double valor)  {
		if(super.saca(valor += taxaSaque)) {		
			return true;
		}else {
			return false;
		}
	}
	
	

}
