package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountAcess {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da conta que deseja acessar:");
		int numberAcc = sc.nextInt();
		System.out.println("Digite o nome do titular da conta:");
		String nameAcc = sc.next();

		Account acc = new Account(nameAcc, numberAcc, 0, 0);

		System.out.println("Deseja adicionar ou remover saldo inicial(s/n)?");
		char resp = sc.next().charAt(0);

		while (resp == 's') {
			System.out.println("Deseja adicionar ou remover (a/r)");
			resp = sc.next().charAt(0);

			if (resp == 'a') {
				System.out.println("Insira o valor do deposito:");
				double deposito = sc.nextDouble();
				acc.addSaldo(deposito);
				System.out.println("Dados da conta:");
				System.out.println(acc);
				System.out.println("Deseja fazer mais alguma coisa(s/n)?");
				resp = sc.next().charAt(0);
			} else if (resp == 'r') {
				System.out.println("Insira o valor do saque");
				double saque = sc.nextDouble();
				acc.removeSaldo(saque);
				System.out.println("Dados da conta:");
				System.out.println(acc);
				System.out.println("Deseja fazer mais alguma coisa(s/n)?");
				resp = sc.next().charAt(0);

			} else {
				System.out.println("Erro Condicional");
				System.out.println("Dados da conta:");
				System.out.println(acc);
			}
		}
		System.out.println("Dados da conta:");
		System.out.println(acc);
		sc.close();
	}

}
