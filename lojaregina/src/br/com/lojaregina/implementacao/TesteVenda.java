package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Endereco enderecocliente = new Endereco();
		Endereco enderecocolaborador = new Endereco();
		Cliente cliente = new Cliente();		
		Colaborador vendedor = new Colaborador();
		Pagamento pagto = new Pagamento();
		
		
		produto.setAll(1, "TV Sony Bravia 55 polegadas", 3500, 4000, 10);
		enderecocliente.setAll("Rua valentino Cardoso", "41", "CASA", "Jardim Jaraguá", "São Paulo", "SP","05161-100");
		enderecocolaborador.setAll("Avenida Paulista", "10500", "Apartamento 411A", "Jardim Bela Vista", "São Paulo", "SP","06030-250");
		cliente.setAll(enderecocliente, 1, "Rafael Almeida", "rafael.rsal@gmail.com", "(11)972843872");
		vendedor.setAll(1212311, "Pedro Ventosa", enderecocolaborador , "Vendedor Senior", 4000);
		pagto.setAll(1, 4000, "02/06/2021", "Catão de Débito");
		
		venda.setId(1000);
		venda.setData("02/06/2021");
		venda.setProduto(produto);
		venda.setCliente(cliente);
		venda.setVendedor(vendedor);
		venda.setPagamento(pagto);
		
		
		//No final exiba: Nome Cliente, Cidade do Cliente, Nome do vendedor, Descrição do produto, Forma de pagamento
		System.out.printf("CLIENTE: %s\nCIDADE: %s\nVENDEDOR: %s\nDESCRIÇÃO_PRODUTO: %s\nFORMA PAGAMENTO: %s",venda.getCliente().getNome(),venda.getCliente().getEndereco().getCidade(),venda.getVendedor().getNome(),venda.getProduto().getDescricao(),venda.getPagamento().getForma());
		

	}

}
