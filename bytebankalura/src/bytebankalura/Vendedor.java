package bytebankalura;

public class Vendedor extends Funcionario{

	@Override
	public double getBonificacao() {
		return super.getSalario()*0.03;
	}

	}


