package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountAcess {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da conta que deseja acessar:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular da conta:");
		String holder = sc.nextLine();

		System.out.println("Deseja adicionar saldo inicial(s/n)?");
		char resp = sc.next().charAt(0);
		Account account = new Account(number, holder);
		System.out.println(account);

		while (resp == 's') {
			System.out.println("Deseja adicionar ou remover (a/r)");
			resp = sc.next().charAt(0);

			if (resp == 'a') {
				System.out.println("Insira o valor do deposito:");
				double depositValue = sc.nextDouble();
				account.deposit(depositValue);
				System.out.println("Dados da conta:");
				System.out.println(account);
				System.out.println("Deseja fazer mais alguma coisa(s/n)?");
				resp = sc.next().charAt(0);
			} else if (resp == 'r') {
				System.out.println("Insira o valor do saque");
				double withdraw = sc.nextDouble();
				account.withdraw(withdraw);
				System.out.println("Dados da conta:");
				System.out.println(account);
				System.out.println("Deseja fazer mais alguma coisa(s/n)?");
				resp = sc.next().charAt(0);

			} else {
				System.out.println("Erro Condicional");
				System.out.println("Dados da conta:");
				System.out.println(account);
			}
		}
		System.out.println("Dados da conta:");
		System.out.println(account);
		sc.close();
	}

}
