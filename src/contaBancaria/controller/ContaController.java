package contaBancaria.controller;

import java.util.ArrayList;

import contaBancaria.model.Conta;
import contaBancaria.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\n Conta número: " + numero + " não foi encontrada!");

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\n A conta número: " + conta.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if (buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\n A conta número: " + conta.getNumero() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\n A conta número: " + conta.getNumero() + " não foi encontrada!");
		}

	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (listaContas.remove(conta) == true) {
				System.out.println("\n A conta numero: " + numero + " foi deletada com sucesso!");
			} 
		} else
			System.out.println("\n A conta numero: " + numero + " não foi encontrada!");

	}

	@Override
	public void sacar(int numero, float valor) {
		var conta= buscarNaCollection(numero);
		
		if (conta != null) {
			if (conta.sacar(valor) == true) 
				System.out.println("\n O saque na conta numero: " + numero + " foi efetuado com sucesso!");
		} else 
			System.out.println("\n A conta numero: " + numero + " não foi encontrada!");

	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\nO Depósito na conta numero: " + numero + " Foi efetuado com sucesso");
		} else
			System.out.println("\nA conta numero: " + numero + " não foi encontrada ou a Conta de destino não é uma conta corrente!");

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);

		if(contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA Transferência foi efetuada com sucesso!");
			}
		} else
			System.out.println("\nA Conta de Origem e/ou Destino não foram encontradas!");
	}

	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

}
