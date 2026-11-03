package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Contribuinte;
import Entidades.Empresa;
import Entidades.Individuo;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int N = ler.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char op = ler.next().toUpperCase().charAt(0);
			ler.nextLine();
			System.out.print("Name: ");
			String nome = ler.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = ler.nextDouble();

			if (op == 'I') {
				System.out.print("Health expenditures: ");
				Double gastoComSaude = ler.nextDouble();
				list.add(new Individuo(nome, rendaAnual, gastoComSaude));
			} else {
				System.out.print("Number of employees: ");
				int numeroDeFuncionarios = ler.nextInt();
				list.add(new Empresa(nome, rendaAnual, numeroDeFuncionarios));
			}
		}

		System.out.println("\nTAXES PAID:");
		double total = 0.0;
		for (Contribuinte c : list) {
			System.out.println(c.toString());
			total += c.imposto();
		}

		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", total));

		ler.close();
	}
}