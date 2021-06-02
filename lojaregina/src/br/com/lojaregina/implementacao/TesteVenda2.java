package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Venda venda = new Venda(
				1,
				"02/06/2021",
				new Produto(
						100,
						"iPhone 7 64GB",
						4500,
						6000,
						10						
						),
				new Cliente(
						10,
						"Rafael",
						"rafael.rsal@hotmail.com",
						"(11)972843872",
						new Endereco(
								"Av Jornalista Paulo Zing",
								"10010",
								"",
								"Jardim Jaragua",
								"São Paulo",
								"SP",
								"05161-000"
								)
						),
				new Colaborador(
						987311913,
						"Henrique Pedrosa",
						new Endereco(
								"Rua Maria Marta",
								"45B",
								"Apartamento 2",
								"Centro",
								"Osasco",
								"SP",
								"06050-715"
								),
						"Analista de Vendas Pl",
						4500),
				new Pagamento(
						10020,
						6100,
						"02/06/2021",
						"Cartão de Credito 10x")				
				);		
		
		System.out.println(venda.toString());
	}

}
