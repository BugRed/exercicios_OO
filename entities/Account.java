package entities;

public class Account {
	private int numberAcc;
	private double saldo;
	private String nameAcc;
	public double deposito;

	public Account() {
	}

	public Account(String nameAcc, int numberAcc, double saldo, double deposito) {
		this.nameAcc = nameAcc;
		this.numberAcc = numberAcc;
		this.saldo = saldo;
		this.deposito = deposito;
	}

	public String getNameAcc() {
		return nameAcc;
	}

	public void setNameAcc(String nameAcc) {
		this.nameAcc = nameAcc;
	}

	public int getNumberAcc() {
		return numberAcc;
	}

	public double getSaldo() {
		return saldo;
	}

	public double addSaldo(double saldo) {
		return this.saldo += saldo;
	}

	public double removeSaldo(double saldo) {
		return this.saldo -= saldo + 5.0;
	}

	public String toString() {
		return "Número da conta: " + numberAcc + ", Titular da conta: " + nameAcc + ", Saldo atual: $ "
				+ String.format("%.2f%n", saldo);
	}

}
