package dia4;

public class Cuenta {
	
	String numeroCuenta;
	String titularCuenta;
	double  saldoCuenta;
	double interesCuenta;
	public Cuenta(String numeroCuenta, String titularCuenta, double saldoCuenta, double interesCuenta) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titularCuenta = titularCuenta;
		this.saldoCuenta = saldoCuenta;
		this.interesCuenta = interesCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitularCuenta() {
		return titularCuenta;
	}
	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	public double getInteresCuenta() {
		return interesCuenta;
	}
	public void setInteresCuenta(double interesCuenta) {
		this.interesCuenta = interesCuenta;
	}
		
		

}
