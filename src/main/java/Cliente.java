
public class Cliente {

private	int  Saque, SaldoE;


public int SaqueOp(int Saque,int SaldoE) {
	return SaldoE - Saque;
}


public int getSaldoE() {
	return SaldoE;
}

public void setSaldoE(int saldoE) {
	SaldoE = saldoE;
}

public int getSaque() {
	return Saque;
}

public void setSaque(int saque) {
	Saque = saque;
}

}
