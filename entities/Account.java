package entities;

public class Account {
	private int number;
	private double balance;
	private String holder;

	public Account() {
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(String nameAcc, int numberAcc, double inicialDeposit) {
		this.holder = nameAcc;
		this.number = numberAcc;
		deposit(inicialDeposit);
	}

	public String getNameAcc() {
		return holder;
	}

	public void setNameAcc(String holder) {
		this.holder = holder;
	}

	public int getNumberAcc() {
		return number;
	}

	public double getSaldo() {
		return balance;
	}

	public double deposit(double amount) {
		return this.balance += amount;
	}

	public double withdraw(double amount) {
		return this.balance -= amount + 5.0;
	}

	public String toString() {
		return "Número da conta: " 
           	+ number 
        	+ ", Titular da conta: " 
	        + holder 
	        + ", Saldo atual: $ "	
        	+ String.format("%.2f%n", balance);
	}

}
