package br.com.lojaregina.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaregina.modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente objeto = new Cliente();
		
		objeto.setId(Integer.parseInt(JOptionPane.showInputDialog("ID:")));
		objeto.setNome(JOptionPane.showInputDialog("Nome:").toUpperCase());
		objeto.setEmail(JOptionPane.showInputDialog("Email:").toLowerCase());
		objeto.setTelefone(JOptionPane.showInputDialog("Telefone:"));
		
		System.out.println("ID: " + objeto.getId());
		System.out.println("Nome: "+objeto.getNome());
		System.out.println("Email: "+objeto.getEmail());
		System.out.println("Teleone: "+objeto.getTelefone());
		System.out.println("Usuario: "+objeto.getUsuario());

	}

}
