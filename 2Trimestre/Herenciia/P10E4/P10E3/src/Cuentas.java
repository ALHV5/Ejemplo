package Herenciia.P10E4.P10E3.src;

public class Cuentas {
    private String numcuenta, nif, tipo;
    private double cantini;
    private String titular[];

    public Cuentas(String[] titular, String nif, String tipo, double cantini) {
        this.titular = titular;
        this.nif = nif;
        this.tipo = tipo;
        this.cantini = cantini;

    }

    public String getTipo() {
        return tipo;
    }

    public String getNif() {
        return nif;
    }

    public double getCantini() {
        return cantini;
    }

}
