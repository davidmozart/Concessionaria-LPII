package modelo;

public abstract class Automovel {
	private String marca;
	private String modelo;
	private String motorizacao;
	private String anoFabricacao;
	private String anoModelo;
	private float valorCompra;
	private float valorVenda;
	private float opcionais;
	private boolean ar;
	private boolean vidroEletrico;
	private boolean travaEletrica;
	private boolean alarme;
	private boolean som;
	private String chassi;
	
	public float getOpcionais() {
		return opcionais;
	}
	public void setOpcionais(float opcionais) {
		this.opcionais = opcionais;
	}	
	public boolean isAr() {
		return ar;
	}
	public void setAr(boolean ar) {
		this.ar = ar;
	}
	public boolean isVidroEletrico() {
		return vidroEletrico;
	}
	public boolean isTravaEletrica() {
		return travaEletrica;
	}
	public void setTravaEletrica(boolean travaEletrica) {
		this.travaEletrica = travaEletrica;
	}
	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}
	public boolean isAlarme() {
		return alarme;
	}
	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}
	public boolean isSom() {
		return som;
	}
	public void setSom(boolean som) {
		this.som = som;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}	
	public float calculaOpcionais() {
		return opcionais;
	}
}

