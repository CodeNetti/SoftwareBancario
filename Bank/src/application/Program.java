package application;

import java.util.Locale;
import java.util.Scanner;

import bankaccount.Myaccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Myaccount myac = new Myaccount();
		System.out.println("Olá Bem vindo(a) ao Banco Simonetti, qual é o seu nome?");
		// Aqui criamos uma variável temporária para apenas guardar o valor momentâneo
		// do nome;//
		String Tempname = sc.nextLine();
		System.out.println(Tempname + " deseja abrir uma conta no nosso banco?  Digite Sim ou Não");

		boolean verification = false;

		// Aqui começa as verificações de input

		while (verification != true) {
			String confirmation = sc.nextLine();

			if (confirmation.equalsIgnoreCase("Sim")) {

				// Como o usuario digitou SIM a conta bancaria começa a ser criada

				myac.setName(Tempname);
				System.out.println("Que otímo " + myac.getName()
						+ ", por favor digite o Número do seu CPF de 11 digítos para começarmos");
				verification = true;
			} else if (confirmation.equalsIgnoreCase("Não")) {
				System.out.println("Muito obrigado, volte sempre!");
				verification = true;
			} else {
				// Enquanto o usuario não digitar sim ou não ele continua no loop
				System.out.println("Por favor, Digite Sim ou Não.");
			}

			verification = false;
			while (verification != true) {
				String CPF = sc.nextLine();
				if (CPF.length() == 11) {

					Myaccount.setCPF(CPF);
					verification = true;
				} else {
					// Enquanto o usuario não digitar o Cpf corretamente ele continua no loop
					System.out.println("Por favor, o CPF deve conter 11 dígitos");
				}
				System.out.println(myac.getName() + " obrigado por confiar em nós, este é o seu número de conta: "
						+ Myaccount.getNumberAcount());

				System.out.println("Dados da conta:");
				// Exibindo os dados da conta recém criada
				System.out.println("Conta: " + Myaccount.getNumberAcount() + " Portador: " + myac.getName() + " CPF: "
						+ Myaccount.getCPF() + " Saldo: " + myac.getBalance());
				System.out.println("Deseja fazer um depósito inicial? Digite Sim ou Não");

				// Verificação para o método de depósito
				verification = false;
				while (verification != true) {
					confirmation = sc.nextLine();
					if (confirmation.equalsIgnoreCase("Sim")) {
						// Iniciando o Procedimento de depósito
						System.out.println("Otímo, qual é o valor que deseja depositar?");
						double deposit = sc.nextDouble();
						// Chamando o método para inserir o valor depositado na conta
						myac.accountDeposit(deposit);
						// Mostrando o updated na conta
						System.out.println("Saldo atualizado");
						System.out.println("Conta: " + Myaccount.getNumberAcount() + " Portador: " + myac.getName()
								+ " CPF: " + Myaccount.getCPF() + " Saldo: " + myac.getBalance());
						verification = true;

					} else if (confirmation.equalsIgnoreCase("Não")) {
						System.out.println("Ok, " + myac.getName() + " tenha um bom dia");
						verification = true;
					} else {
						System.out.println("Por favor, digite Sim ou Não");
					}
				
				}
				System.out.println("Deseja fazer um saque com uma taxa de R$5.00? Digite Sim ou Não");

				// Verificação para o método de Saque
				verification = false;
				while (verification != true) {
					confirmation = sc.nextLine();
					if (confirmation.equalsIgnoreCase("Sim")) {
						// Iniciando o Procedimento de Saque
						System.out.println("Otímo, qual é o valor que deseja sacar?");
						double withdrewa = sc.nextDouble();
						// Chamando o método para sacar o valor na conta
						myac.accountWithdrawa(withdrewa);
						// Mostrando o updated na conta
						System.out.println("Saldo atualizado");
						System.out.println("Conta: " + Myaccount.getNumberAcount() + " Portador: " + myac.getName()
								+ " CPF: " + Myaccount.getCPF() + " Saldo: " + myac.getBalance());
						verification = true;

					} else if (confirmation.equalsIgnoreCase("Não")) {
						System.out.println("Ok, " + myac.getName() + " tenha um bom dia");
						verification = true;
					} else {
						System.out.println("Por favor, digite Sim ou Não");
					}
					if(myac.getBalance() < 0) 
					{
						System.out.println(myac.getName() + ", o seu saldo ficou negativo deposite para resolver a situação.");
					}
				
				}

			}
		}

	}
}
