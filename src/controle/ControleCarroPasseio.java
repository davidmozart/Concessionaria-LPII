package controle;

import modelo.Passeio;
import view.PainelCarro;
import view.PainelVenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;




public class ControleCarroPasseio implements ActionListener{
	PainelCarro painelCompraCarro;
	PainelVenda painelVenda;
	ControlePrincipal controlePrincipal;
	Passeio passeio;

	public ControleCarroPasseio() {
		// TODO Auto-generated constructor stub
		painelCompraCarro = new PainelCarro();
		painelVenda = new PainelVenda();
	} 
	public void controlePainelCompra(PainelCarro painelCompraCarro) {
		this.painelCompraCarro = painelCompraCarro;
		painelCompraCarro.add(painelCompraCarro.getlLitragemPortamalas());
		painelCompraCarro.add(painelCompraCarro.gettLitragemPortamalas());
		painelCompraCarro.add(painelCompraCarro.getlNumPassageiros());
		painelCompraCarro.add(painelCompraCarro.gettNumPassageiros());
		painelCompraCarro.getBtSalvar().addActionListener(this);
		painelCompraCarro.getBtInicio().addActionListener(this);
	}
	public void controlePainelVenda (PainelVenda painelVenda) {
		this.painelVenda = painelVenda;
		painelVenda.add(painelVenda.getlLitragemPortamalas());
		painelVenda.add(painelVenda.gettLitragemPortamalas());
		painelVenda.add(painelVenda.getlNumPassageiros());
		painelVenda.add(painelVenda.gettNumPassageiros());
		painelVenda.getCmBoxNumeroChassi().setModel(new DefaultComboBoxModel<>(new String [] {""}));
		for(Passeio chassi : Passeio.getPasseio()) {
			painelVenda.getCmBoxNumeroChassi().addItem(chassi.getChassi());
			painelVenda.getCmBoxNumeroChassi().getSelectedItem().toString();
		}
		painelVenda.getCmBoxNumeroChassi().addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==painelCompraCarro.getBtSalvar()) {
			passeio = new Passeio();
			passeio.setMarca(painelCompraCarro.getTmarca().getText());
			passeio.setModelo(painelCompraCarro.getTmodel().getText());
			passeio.setMotorizacao(painelCompraCarro.getTmotor().getText());
			passeio.setAnoFabricacao(painelCompraCarro.getTageFab().getText());
			passeio.setAnoModelo(painelCompraCarro.getTageModel().getText());
			passeio.setChassi(painelCompraCarro.getTchassi().getText());
			passeio.setValorCompra(Float.parseFloat(painelCompraCarro.getTvalComp().getText()));
			passeio.setLitragemPortaMala(Float.parseFloat(painelCompraCarro.gettLitragemPortamalas().getText()));
			passeio.setNumPassageiros(Integer.parseInt(painelCompraCarro.gettNumPassageiros().getText()));
			if(Passeio.getPasseio().size()!=0) {
				boolean flag = true;
				for(Passeio chassi : Passeio.getPasseio()) {
					if(chassi.getChassi().equals(painelCompraCarro.getTchassi().getText())) {
						JOptionPane.showMessageDialog(painelCompraCarro, "Chassi já inserido no sistema");
						flag=false;
					} 
				}
				if (flag==true) {
					Passeio.getPasseio().add(passeio);
				}
			} else {
				Passeio.getPasseio().add(passeio);
			}
			painelCompraCarro.getTmarca().setText("");
			JOptionPane.showMessageDialog(painelCompraCarro, "Quantidade: "+Passeio.getPasseio().size());
		} else if (e.getSource()==painelCompraCarro.getBtInicio()) {
			ControlePrincipal.getInstance().addEventos();
		} else if (e.getSource()==painelVenda.getCmBoxNumeroChassi()) {
			for(Passeio exibe : Passeio.getPasseio()) {
				if (painelVenda.getCmBoxNumeroChassi().getSelectedItem().toString() == exibe.getChassi()) {
					painelVenda.gettFMarca().setText(exibe.getMarca());
					painelVenda.getTfModelo().setText(exibe.getModelo());
					painelVenda.getTfMotorizacao().setText(exibe.getMotorizacao());
					painelVenda.getTfAnoFab().setText(exibe.getAnoFabricacao());
					painelVenda.getTfAnoModelo().setText(exibe.getAnoModelo());
					painelVenda.getTfValorCompra().setText(String.valueOf(exibe.getValorCompra()));
					painelVenda.gettLitragemPortamalas().setText(String.valueOf(exibe.getLitragemPortaMala()));
					painelVenda.gettNumPassageiros().setText(String.valueOf(exibe.getNumPassageiros()));
				}
			}
		}
	}
}
