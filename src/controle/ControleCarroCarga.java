package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Carga;
import view.PainelCarro;

public class ControleCarroCarga implements ActionListener{
	PainelCarro painel;
	ControlePrincipal controlePrincipal;
	Carga carga;
	public ControleCarroCarga(PainelCarro painel) {
		this.painel = painel;
		painel.add(painel.getlTamanhoCarroceria());
		painel.add(painel.gettTamanhoCarroceria());
		painel.add(painel.getlPesoMaximoCarga());
		painel.add(painel.gettPesoMaximoCarga());
		painel.add(painel.getlPesoTotal());
		painel.add(painel.gettPesoTotal());
		painel.add(painel.getlAlturaCargaMaxima());
		painel.add(painel.gettAlturaCargaMaxima());
		painel.getBtSalvar().addActionListener(this);
		painel.getBtInicio().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==painel.getBtSalvar()) {
			carga = new Carga();
			carga.setMarca(painel.getTmarca().getText());
			carga.setModelo(painel.getTmodel().getText());
			carga.setMotorizacao(painel.getTmotor().getText());
			carga.setAnoFabricacao(painel.getTageFab().getText());
			carga.setAnoModelo(painel.getTageModel().getText());
			carga.setChassi(painel.getTchassi().getText());
			carga.setValorCompra(Float.parseFloat(painel.getTvalComp().getText()));
			carga.setTamanhoCarroceria(Float.parseFloat(painel.gettTamanhoCarroceria().getText()));
			carga.setPesoMaximoCarga(Float.parseFloat(painel.gettPesoMaximoCarga().getText()));
			carga.setPesoTotal(Float.parseFloat(painel.gettPesoTotal().getText()));
			carga.setAlturaCargaMaxima(Float.parseFloat(painel.gettAlturaCargaMaxima().getText()));
			Carga.getCarga().add(carga);
		}else if (e.getSource()==painel.getBtInicio()) {
			
		}
	}
	

}
