package entities;

public class Employee {

	private String name;
	private Integer id;
	private Double grossSalary;
	private Double tax;

	public Employee() {

	}

	public Employee(String name, Integer id, Double grossSalary) {
		this.name = name;
		this.id = id;
		this.grossSalary = grossSalary;
	}

	public Employee(String name, Integer id, Double grossSalary, Double tax) {
		this.name = name;
		this.id = id;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public Double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(Double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}

	public void toDecreaseSalary(Double percentage) {
		grossSalary -= grossSalary * percentage / 100.0;
	}

	public String toString2() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}

	public String toString() {
		return "id: " + id + " Nome: " + name + " Salário: " + String.format("%.3f%n", netSalary());
	}

}
