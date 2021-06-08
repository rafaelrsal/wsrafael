package br.com.projetofinal.modelo;

public class Equipamento {

	private int id;
	private String hostname;
	private String ip;
	
	
	public Equipamento() {
		super();
	}


	public Equipamento(int id, String hostname, String ip) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.ip = ip;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHostname() {
		return hostname;
	}


	public void setHostname(String hostname) {
		this.hostname = hostname;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
