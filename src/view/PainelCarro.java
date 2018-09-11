package view;


//import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PainelCarro extends JPanel{

	private JLabel lmarca;
	private JTextField tmarca;
	private JLabel lmodel;
	private JTextField tmodel;
	private JLabel lmotor;
	private JTextField tmotor;
	private JLabel lageFab;
	private JTextField tageFab;
	private JLabel lageModel;
	private JTextField tageModel;
	private JLabel lchassi;
	private JTextField tchassi;
	private JLabel lvalComp;
	private JTextField tvalComp;
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
	
	private JButton btSalvar;
	private JButton btVoltar;
	private JButton btInicio;
	
	public PainelCarro() {
				
		this.setLayout(null);
		this.setSize(600, 600);
		//this.setVisible(true);
		
		
		lmarca = new JLabel("Marca:");
		lmarca.setBounds(85, 50, 50, 25);
		this.add(lmarca);
		
		tmarca = new JTextField();
		tmarca.setBounds(145, 52, 100, 20);
		this.add(tmarca);
		
		lmodel = new JLabel("Modelo:");
		lmodel.setBounds(80, 86, 55, 25);
		this.add(lmodel);
		
		tmodel = new JTextField();
		tmodel.setBounds(145, 84, 100, 20);
		this.add(tmodel);

		lmotor = new JLabel("Motorização:");
		lmotor.setBounds(56, 112, 79, 25);
		this.add(lmotor);
		
		tmotor = new JTextField();
		tmotor.setBounds(145, 114, 100, 20);
		this.add(tmotor);
		
		lageFab = new JLabel("Ano de Fabricação:");
		lageFab.setBounds(23, 141, 110, 25);
		this.add(lageFab);
		
		tageFab = new JTextField();
		tageFab.setBounds(145, 143, 100, 20);
		this.add(tageFab);
		
		lageModel = new JLabel("Ano do Modelo:");
		lageModel.setBounds(43, 171, 92, 25);
		this.add(lageModel);
		
		tageModel = new JTextField();
		tageModel.setBounds(145, 173, 100, 20);
		this.add(tageModel);
		
		lchassi = new JLabel("Número do Chassi:");
		lchassi.setBounds(296, 50, 117, 25);
		this.add(lchassi);
		
		tchassi = new JTextField();
		tchassi.setBounds(420, 52, 100, 20);
		this.add(tchassi);
		
		lvalComp = new JLabel("Valor de Compra:");
		lvalComp.setBounds(306, 84, 100, 25);
		this.add(lvalComp);
		
		tvalComp = new JTextField();
		tvalComp.setBounds(420, 84, 100, 20);
		this.add(tvalComp);
		
		lLitragemPortamalas = new JLabel("Litragem porta malas:");
		lLitragemPortamalas.setBounds(280, 112, 125, 25);
		
		tLitragemPortamalas = new JTextField();
		tLitragemPortamalas.setBounds(420, 112, 100, 20);
		//passageiro
		lNumPassageiros = new JLabel("Numero de passageiros: ");
		lNumPassageiros.setBounds(270, 141, 145, 25);
		//passageiro
		tNumPassageiros = new JTextField();
		tNumPassageiros.setBounds(420, 141, 100, 20);
		//carga
		lTamanhoCarroceria = new JLabel("Tamanho carroceria: ");
		lTamanhoCarroceria.setBounds(286, 112, 125, 25);
		
		tTamanhoCarroceria = new JTextField();
		tTamanhoCarroceria.setBounds(420, 112, 100, 20);
		
		lPesoMaximoCarga = new JLabel ("Peso maximo da carga: ");
		lPesoMaximoCarga.setBounds(270, 141, 145, 25);
		
		tPesoMaximoCarga = new JTextField();
		tPesoMaximoCarga.setBounds(420, 141, 100, 20);
		
		lPesoTotal = new JLabel("Peso total do Carro: ");
		lPesoTotal.setBounds(292, 170, 125, 25);
		
		tPesoTotal = new JTextField();
		tPesoTotal.setBounds(420, 170, 100, 20);
		
		lAlturaCargaMaxima = new JLabel ("Altura maxima da carga: ");
		lAlturaCargaMaxima.setBounds(270, 199, 145, 25);
		
		tAlturaCargaMaxima = new JTextField();
		tAlturaCargaMaxima.setBounds(420, 199, 100, 20);
		
		btSalvar = new JButton("Salvar");
		btSalvar.setBounds(442, 503, 100, 35);
		this.add(btSalvar);
		
		btVoltar = new JButton("Voltar");
		btVoltar.setBounds(340, 503, 100, 35);
		this.add(btVoltar);
		
		btInicio = new JButton("Inicio");
		btInicio.setBounds(238, 503, 100, 35);
		this.add(btInicio);
	}


	public JLabel getLmarca() {
		return lmarca;
	}



	public JTextField getTmarca() {
		return tmarca;
	}


	public JLabel getLmodel() {
		return lmodel;
	}


	public JTextField getTmodel() {
		return tmodel;
	}


	public void setTmodel(JTextField tmodel) {
		this.tmodel = tmodel;
	}


	public JLabel getLmotor() {
		return lmotor;
	}


	public JTextField getTmotor() {
		return tmotor;
	}


	public JLabel getLageFab() {
		return lageFab;
	}


	public JTextField getTageFab() {
		return tageFab;
	}


	public JLabel getLageModel() {
		return lageModel;
	}


	public JTextField getTageModel() {
		return tageModel;
	}


	public JLabel getLchassi() {
		return lchassi;
	}


	public JTextField getTchassi() {
		return tchassi;
	}


	public JLabel getLvalComp() {
		return lvalComp;
	}


	public void setLvalComp(JLabel lvalComp) {
		this.lvalComp = lvalComp;
	}


	public JTextField getTvalComp() {
		return tvalComp;
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


	public JLabel getlPesoMaximoCarga() {
		return lPesoMaximoCarga;
	}


	public JTextField gettPesoMaximoCarga() {
		return tPesoMaximoCarga;
	}


	public JLabel getlPesoTotal() {
		return lPesoTotal;
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
	
	
	public JButton getBtSalvar() {
		return btSalvar;
	}


	public void setBtSalvar(JButton btSalvar) {
		this.btSalvar = btSalvar;
	}
	
	public JButton getBtVoltar() {
		return btVoltar;
	}
	
	public JButton getBtInicio() {
		return btInicio;
	}



	

}
