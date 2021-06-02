package br.com.lojaregina.modelo;

public class Venda {

	private int id;
	private String data;
	private Produto produto;
	private Cliente cliente;
	private Colaborador vendedor;
	private Pagamento pagamento;
	
	
	
	public Venda() {
		super();
	}

	public Venda(int id, String data, Produto produto, Cliente cliente, Colaborador vendedor, Pagamento pagamento) {
		super();
		this.id = id;
		this.data = data;
		this.produto = produto;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.pagamento = pagamento;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", data=" + data + ", produto=" + produto + ", cliente=" + cliente + ", vendedor="
				+ vendedor + ", pagamento=" + pagamento + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Colaborador getVendedor() {
		return vendedor;
	}

	public void setVendedor(Colaborador vendedor) {
		this.vendedor = vendedor;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
}
