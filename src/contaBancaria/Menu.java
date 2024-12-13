package contaBancaria;

import java.util.Scanner;

import contaBancaria.util.Cores;
// import contaBancaria.model.Conta;
import contaBancaria.model.ContaCorrente;
import contaBancaria.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		int opcao;
		// float valor, valorx;

		Scanner leia = new Scanner(System.in);

		// Instaciamento | Classe -> Objeto Utilizavel
		/*
		 * Conta c1 = new Conta(123456, 0001, 1, "Maria das Neves", 500f);
		 * 
		 * // Alteração do Saldo da conta c1.setSaldo(5000f);
		 * 
		 * // Exibição dos Dados da Conta c1.visualizar();
		 * 
		 * // Entrada do Valor de Saque
		 * System.out.print("\n\nDigite o Valor que deseja Sacar: R$ "); valor =
		 * leia.nextFloat(); // Processamento do Saque conforme o metodo localizado na
		 * classe Conta c1.sacar(valor); c1.visualizar();
		 * 
		 * // Entrada do Valor do Deposito
		 * System.out.print("\n\nDigite o Valor que deseja Depositar: R$ "); valorx =
		 * leia.nextFloat(); // Processamento do Deposito conforme o metodo localizado
		 * na classe Conta c1.depositar(valorx); c1.visualizar();
		 */

		ContaCorrente cc2 = new ContaCorrente(1, 34, 1, "Francisco", 500f, 1000f);

		cc2.visualizar();

		ContaCorrente cc3 = new ContaCorrente(123456, 0001, 1, "Maria das Neves", 5000.0f);

		cc3.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(12536, 0001, 2, "Alberto", 1600.5f, 06);

		cp1.visualizar();

		ContaPoupanca cp2 = new ContaPoupanca(18649, 0001, 2, "Fulano", 4800.86f, 15);

		cp2.visualizar();

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Invalida\n");
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Caroliny Caproni - caroliny.caproni@hotmail.com");
		System.out.println("github.com/CarolinyCaproni");
		System.out.println("*********************************************************");
	}

}
