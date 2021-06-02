package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto prod = new Produto();
		
		prod.setAll(1, "iPhone 11 128GB", 5000, 6000, 10);
		
		System.out.println("Com desconto: R$"+prod.getDesconto());
		
		System.out.println("Valor Total venda do estoque: R$"+prod.getTotalVenda());
		
		System.out.println("Desconto customizado (20%): R$"+prod.getDesconto(20));
		
		System.out.println("STATUS do estoque: " + prod.getVerificarEstoque());
		
		prod.setAtualizarValores(50);
		
		System.out.println("Resumo final: " + prod.toString());

	}

}
