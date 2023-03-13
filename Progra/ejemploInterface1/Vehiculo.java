package ejemploInterface1;

public class Vehiculo implements Machine {
	private String matricula;
	private int cuentaKms;

	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.cuentaKms = 0;
	}

	public void recorrer(int kms) {
		cuentaKms += kms;
	}

	@Override
	public String suena() {
		return "Piiiii";
	}

	@Override
	public void reset() {
		cuentaKms = 0;

	}

	@Override
	public String toString() {
		return "Vehiculo [matr�cula=" + matricula + ", cuentaKms=" + cuentaKms + "]";
	}

}
