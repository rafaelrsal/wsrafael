package br.com.bankofoz.implementacao;

import br.com.bankofoz.modelo.Agencia;
import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;
import util.MsgJoption;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int escolha = 0;
		
		while (escolha != 1 && escolha != 2)
		{
			escolha = MsgJoption.i("Digite '1' para Conta Corrente ou '2' para Conta Popupança:");
		}
		
		Conta conta;
		
		if (escolha == 1)
		{
			//CONTA CORRENTE
			conta = new Corrente(
					MsgJoption.i("Digite o numero da conta:"),
					MsgJoption.d("Digite o saldo da conta:"),
					new Cliente(
							MsgJoption.i("ID do Cliente:"),
							MsgJoption.s("Nome do Cliente:"),
							MsgJoption.s("CPF do Cliente:")
							),				
					new Agencia(
							MsgJoption.i("Numero da Agência:"),
							MsgJoption.s("Nome da Agência: "),
							MsgJoption.s("Telefone da Agência:")
							),
					MsgJoption.d("Limite da Conta:"),
					MsgJoption.d("Taxa:")
					);			
		}
		else
		{
			//CONTA POUPANÇA
			conta = new Poupanca(
					MsgJoption.i("Digite o numero da conta:"),
					MsgJoption.d("Digite o saldo da conta:"),
					new Cliente(
							MsgJoption.i("ID do Cliente:"),
							MsgJoption.s("Nome do Cliente:"),
							MsgJoption.s("CPF do Cliente:")
							),				
					new Agencia(
							MsgJoption.i("Numero da Agência:"),
							MsgJoption.s("Nome da Agência: "),
							MsgJoption.s("Telefone da Agência:")
							),
					MsgJoption.d("Rendimento:"),
					MsgJoption.i("Aniversario:")
					);
		}
		
		
				
		
		System.out.println(conta.getResumo());
		System.out.println(conta.toString());

	}

}
