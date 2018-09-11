package modelo;

import java.util.ArrayList;

public class Passeio extends Automovel {
	private float litragemPortaMala;
	private int numPassageiros;
	public static ArrayList<Passeio> cadpasseio = new ArrayList<Passeio>();
	
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
	
	
	public float getLitragemPortaMala() {
		return litragemPortaMala;
	}


	public void setLitragemPortaMala(float litragemPortaMala) {
		this.litragemPortaMala = litragemPortaMala;
	}


	public int getNumPassageiros() {
		return numPassageiros;
	}


	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}


	public static ArrayList<Passeio> getPasseio() {
		return cadpasseio;
	}
}

