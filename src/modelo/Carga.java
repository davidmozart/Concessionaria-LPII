package modelo;

import java.util.ArrayList;

public class Carga extends Automovel {
	private float tamanhoCarroceria;
	private float pesoMaximoCarga;
	private float pesoTotal;
	private float alturaCargaMaxima;
	private static ArrayList<Carga> carga = new ArrayList<>();
	public float calculaOpcionais() {
		if (this.isAr() == true) {
			this.setOpcionais(1500);
		}
		if (this.isVidroEletrico() == true) {
			this.setOpcionais(this.getOpcionais()+435);
		}
		if (this.isTravaEletrica() == true) {
			this.setOpcionais(this.getOpcionais()+292);
		}
		if (this.isAlarme() == true) {
			this.setOpcionais(this.getOpcionais()+527);
		}
		if (this.isSom() == true) {
			this.setOpcionais(this.getOpcionais()+1200);
		}
		return this.getOpcionais();
	}
	
	public float getTamanhoCarroceria() {
		return tamanhoCarroceria;
	}
	public void setTamanhoCarroceria(float tamanhoCarroceria) {
		this.tamanhoCarroceria = tamanhoCarroceria;
	}
	public float getPesoMaximoCarga() {
		return pesoMaximoCarga;
	}
	public void setPesoMaximoCarga(float pesoMaximoCarga) {
		this.pesoMaximoCarga = pesoMaximoCarga;
	}
	public float getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(float pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public float getAlturaCargaMaxima() {
		return alturaCargaMaxima;
	}
	public void setAlturaCargaMaxima(float alturaCargaMaxima) {
		this.alturaCargaMaxima = alturaCargaMaxima;
	}
	public static ArrayList<Carga> getCarga() {
		return carga;
	}
}
