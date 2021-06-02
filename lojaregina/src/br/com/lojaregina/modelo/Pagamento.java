package br.com.lojaregina.modelo;

public class Pagamento {

	private int id;
	private double valor;
	private String data;
	private String forma;
	
	
	
	public Pagamento() {
		super();
	}

	public Pagamento(int id, double valor, String data, String forma) {
		super();
		this.id = id;
		this.valor = valor;
		this.data = data;
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", valor=" + valor + ", data=" + data + ", forma=" + forma + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setDta(String data) {
		this.data = data;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	public void setAll(int id, double valor, String data, String forma)
	{
		this.id = id;
		this.valor = valor;
		this.data = data;
		this.forma = data;
	}
	
	
}
