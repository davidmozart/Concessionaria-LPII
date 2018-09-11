package view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;


import javax.swing.DefaultComboBoxModel;

public class PainelVenda extends JPanel{
	
	private JLabel lblNumeroDoChassi;
	private JComboBox<String> cmBoxNumeroChassi;
	private JLabel lbMarca;
	private JTextField tFMarca;
	private JLabel lbModelo;
	private JTextField tfModelo;
	private JLabel lbMotorizacao;
	private JTextField tfMotorizacao;
	private JLabel lbAnoFab;
	private JTextField tfAnoFab;
	private JLabel lblAnoModelo;
	private JTextField tfAnoModelo;
	private JLabel lbValorCompra;
	private JTextField tfValorCompra;
	private JLabel lLitragemPortamalas;
	private JTextField tLitragemPortamalas;
	private JLabel lNumPassageiros;
	private JTextField tNumPassageiros;
	private JLabel lTamanhoCarroceria;
	private JTextField tTamanhoCarroceria;
	private JLabel lPesoMaximoCarga;
	private JTextField tPesoMaximoCarga;
	private JLabel lPesoTotal;
	private JTextField tPesoTotal;
	private JLabel lAlturaCargaMaxima;
	private JTextField tAlturaCargaMaxima;
	private JLabel lOpicionais;
	private JCheckBox ar;
	private JCheckBox vidroEletrico;
	private JCheckBox travaEletrica;
	private JCheckBox alarme;
	private JCheckBox som;
	private JButton btSalvar;
	private JButton btVoltar;
	
	
	public PainelVenda() {
		this.setLayout(null);
		this.setSize(600, 600);
		//this.setVisible(true);
		
		lblNumeroDoChassi = new JLabel("Número do chassi:");
		lblNumeroDoChassi.setBounds(156, 49, 125, 14);
		add(lblNumeroDoChassi);
		
		cmBoxNumeroChassi = new JComboBox<String>();
		cmBoxNumeroChassi.setBounds(289, 46, 150, 20);
		add(cmBoxNumeroChassi);
		
		lbMarca = new JLabel("Marca:");
		lbMarca.setBounds(81, 133, 46, 14);
		add(lbMarca);
		
		tFMarca = new JTextField();
		tFMarca.setEditable(false);
		tFMarca.setBounds(133, 130, 130, 20);
		add(tFMarca);
		tFMarca.setColumns(20);
		
		lbModelo = new JLabel("Modelo: ");
		lbModelo.setBounds(77, 164, 50, 14);
		add(lbModelo);
		
		tfModelo = new JTextField();
		tfModelo.setEditable(false);
		tfModelo.setBounds(133, 161, 130, 20);
		add(tfModelo);
		tfModelo.setColumns(10);
		
		lbMotorizacao = new JLabel("Motorizacao: ");
		lbMotorizacao.setBounds(50, 195, 78, 14);
		add(lbMotorizacao);
		
		tfMotorizacao = new JTextField();
		tfMotorizacao.setEditable(false);
		tfMotorizacao.setBounds(133, 192, 130, 20);
		add(tfMotorizacao);
		tfMotorizacao.setColumns(10);
		
		lbAnoFab = new JLabel("Ano fabricacao: ");
		lbAnoFab.setBounds(35, 223, 98, 14);
		add(lbAnoFab);
		
		tfAnoFab = new JTextField();
		tfAnoFab.setEditable(false);
		tfAnoFab.setBounds(133, 220, 130, 20);
		add(tfAnoFab);
		tfAnoFab.setColumns(10);
		
		lblAnoModelo = new JLabel("Ano modelo: ");
		lblAnoModelo.setBounds(55, 254, 89, 14);
		add(lblAnoModelo);
		
		tfAnoModelo = new JTextField();
		tfAnoModelo.setEditable(false);
		tfAnoModelo.setBounds(133, 251, 130, 20);
		add(tfAnoModelo);
		tfAnoModelo.setColumns(10);
		
		lbValorCompra = new JLabel("Valor de compra: ");
		lbValorCompra.setBounds(25, 282, 114, 14);
		add(lbValorCompra);
		
		tfValorCompra = new JTextField();
		tfValorCompra.setEditable(false);
		tfValorCompra.setBounds(133, 279, 130, 20);
		add(tfValorCompra);
		tfValorCompra.setColumns(10);
		
		lLitragemPortamalas = new JLabel("Litragem porta malas:");
		lLitragemPortamalas.setBounds(280, 112, 125, 25);
		
		tLitragemPortamalas = new JTextField();
		tLitragemPortamalas.setEditable(false);
		tLitragemPortamalas.setBounds(420, 112, 100, 20);
		//passageiro
		lNumPassageiros = new JLabel("Numero de passageiros: ");
		lNumPassageiros.setBounds(270, 141, 145, 25);
		//passageiro
		tNumPassageiros = new JTextField();
		tNumPassageiros.setEditable(false);
		tNumPassageiros.setBounds(420, 141, 100, 20);
		//carga
		lTamanhoCarroceria = new JLabel("Tamanho carroceria: ");
		lTamanhoCarroceria.setBounds(286, 112, 125, 25);
		
		tTamanhoCarroceria = new JTextField();
		tTamanhoCarroceria.setEditable(false);
		tTamanhoCarroceria.setBounds(420, 112, 100, 20);
		
		lPesoMaximoCarga = new JLabel ("Peso maximo da carga: ");
		lPesoMaximoCarga.setBounds(270, 141, 145, 25);
		
		tPesoMaximoCarga = new JTextField();
		tPesoMaximoCarga.setEditable(false);
		tPesoMaximoCarga.setBounds(420, 141, 100, 20);
		
		lPesoTotal = new JLabel("Peso total do Carro: ");
		lPesoTotal.setBounds(292, 170, 125, 25);
		
		tPesoTotal = new JTextField();
		tPesoTotal.setEditable(false);
		tPesoTotal.setBounds(420, 170, 100, 20);
		
		lAlturaCargaMaxima = new JLabel ("Altura maxima da carga: ");
		lAlturaCargaMaxima.setBounds(270, 199, 145, 25);
		
		tAlturaCargaMaxima = new JTextField();
		tAlturaCargaMaxima.setEditable(false);
		tAlturaCargaMaxima.setBounds(420, 199, 100, 20);
		
		lOpicionais = new JLabel("Opicionais: ");
		lOpicionais.setBounds(25, 366, 100, 25);
		this.add(lOpicionais);
		
		ar = new JCheckBox("Ar Condicionado");
		ar.setBounds(25, 396, 125, 25);
		this.add(ar);
		
		vidroEletrico = new JCheckBox("Vidro Eletrico");
		vidroEletrico.setBounds(25, 416, 125, 25);
		this.add(vidroEletrico);
		
		travaEletrica = new JCheckBox("Trava Eletrica");
		travaEletrica.setBounds(25, 436, 125, 25);
		this.add(travaEletrica);
		
		alarme = new JCheckBox("Alarme");
		alarme.setBounds(190, 396, 125, 25);
		this.add(alarme);
		
		som = new JCheckBox("Som");
		som.setBounds(190, 416, 125, 25);
		this.add(som);
		
		btSalvar = new JButton("Salvar");
		btSalvar.setBounds(442, 503, 100, 35);
		this.add(btSalvar);
		
		btVoltar = new JButton("Voltar");
		btVoltar.setBounds(340, 503, 100, 35);
		this.add(btVoltar);
	}
	
	
	
	public JLabel getLblNumeroDoChassi() {
		return lblNumeroDoChassi;
	}



	public JComboBox<String> getCmBoxNumeroChassi() {
		return cmBoxNumeroChassi;
	}



	public JLabel getLbMarca() {
		return lbMarca;
	}



	public JTextField gettFMarca() {
		return tFMarca;
	}


	public JLabel getLbModelo() {
		return lbModelo;
	}



	public JTextField getTfModelo() {
		return tfModelo;
	}



	public JLabel getLbMotorizacao() {
		return lbMotorizacao;
	}



	public JTextField getTfMotorizacao() {
		return tfMotorizacao;
	}



	public JLabel getLbAnoFab() {
		return lbAnoFab;
	}



	public JTextField getTfAnoFab() {
		return tfAnoFab;
	}



	public JLabel getLblAnoModelo() {
		return lblAnoModelo;
	}



	public JTextField getTfAnoModelo() {
		return tfAnoModelo;
	}



	public JLabel getLbValorCompra() {
		return lbValorCompra;
	}



	public JTextField getTfValorCompra() {
		return tfValorCompra;
	}
	
	

	public JLabel getlLitragemPortamalas() {
		return lLitragemPortamalas;
	}



	public JTextField gettLitragemPortamalas() {
		return tLitragemPortamalas;
	}



	public JLabel getlNumPassageiros() {
		return lNumPassageiros;
	}



	public JTextField gettNumPassageiros() {
		return tNumPassageiros;
	}



	public JLabel getlTamanhoCarroceria() {
		return lTamanhoCarroceria;
	}



	public JTextField gettTamanhoCarroceria() {
		return tTamanhoCarroceria;
	}



	public JTextField gettPesoMaximoCarga() {
		return tPesoMaximoCarga;
	}



	public JTextField gettPesoTotal() {
		return tPesoTotal;
	}



	public JLabel getlAlturaCargaMaxima() {
		return lAlturaCargaMaxima;
	}



	public JTextField gettAlturaCargaMaxima() {
		return tAlturaCargaMaxima;
	}



	public JLabel getlOpicionais() {
		return lOpicionais;
	}



	public JCheckBox getAr() {
		return ar;
	}


	public void setAr(JCheckBox ar) {
		this.ar = ar;
	}


	public JCheckBox getVidroEletrico() {
		return vidroEletrico;
	}


	public void setVidroEletrico(JCheckBox vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}


	public JCheckBox getTravaEletrica() {
		return travaEletrica;
	}


	public void setTravaEletrica(JCheckBox travaEletrica) {
		this.travaEletrica = travaEletrica;
	}


	public JCheckBox getAlarme() {
		return alarme;
	}


	public void setAlarme(JCheckBox alarme) {
		this.alarme = alarme;
	}


	public JCheckBox getSom() {
		return som;
	}


	public void setSom(JCheckBox som) {
		this.som = som;
	}


	public JButton getBtSalvar() {
		return btSalvar;
	}


	public JButton getBtVoltar() {
		return btVoltar;
	}
	
}
