package controle;


 
import view.Frame;
import view.PainelPrincipal;
import view.PainelVenda;
import view.PainelCarro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import modelo.Passeio;

public class ControlePrincipal extends Frame implements ActionListener{
	
	private static ControlePrincipal instancia;
	PainelPrincipal painelPrincipal;
	ControleCarroPasseio controleCarroPasseio;
	ControleCarroCarga controleCarroCarga;
	PainelCarro painelCarro;
	PainelVenda painelVenda;
	Passeio passeio;
	JMenuBar barra;
	JMenu menu1;
	JMenuItem item1Menu1;
	JMenuItem item2Menu1;
	JMenuItem item3Menu1;
	JMenuItem item4Menu1;
	
	private ControlePrincipal() {
		addEventos();
	}
	public static synchronized ControlePrincipal getInstance() {
		if (instancia == null) {
			instancia = new ControlePrincipal();
		}
		return instancia;
	}
	public void addEventos() {
		painelPrincipal = new PainelPrincipal();
		this.setContentPane(painelPrincipal);
		painelPrincipal.getBtCadastro().addActionListener(this);
		painelPrincipal.getBtVenda().addActionListener(this);
	}
	public void inicio(PainelCarro painelCarro) {
		this.painelCarro = painelCarro;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==painelPrincipal.getBtCadastro()) {
			painelPrincipal.setVisible(false);
			barra = new JMenuBar();
			menu1 = new JMenu("Tipo de carro");
			item1Menu1 = new JMenuItem("Carro de passeio");
			item2Menu1 = new JMenuItem("Carro de carga");
			this.setJMenuBar(barra);
			barra.add(menu1);
			menu1.add(item1Menu1);
			menu1.add(item2Menu1);
			item1Menu1.addActionListener(this);
			item2Menu1.addActionListener(this);
		}else if (e.getSource()==this.item1Menu1) {
			this.setJMenuBar(null);
			painelCarro = new PainelCarro();
			controleCarroPasseio = new ControleCarroPasseio();
			controleCarroPasseio.controlePainelCompra(painelCarro);
			this.setContentPane(painelCarro);
		} else if (e.getSource()==this.item2Menu1) {
			this.setJMenuBar(null);
			painelCarro = new PainelCarro();
			controleCarroCarga = new ControleCarroCarga(painelCarro);
			this.setContentPane(painelCarro);
		}
		if (e.getSource()==painelPrincipal.getBtVenda()) {
			painelPrincipal.setVisible(false);
			barra = new JMenuBar();
			menu1 = new JMenu("Tipo de carro");
			item3Menu1 = new JMenuItem("Carro de passeio");
			item4Menu1 = new JMenuItem("Carro de carga");
			this.setJMenuBar(barra);
			barra.add(menu1);
			menu1.add(item3Menu1);
			menu1.add(item4Menu1);
			item3Menu1.addActionListener(this);
			item4Menu1.addActionListener(this);
		}else if (e.getSource()==this.item3Menu1) {
			this.setJMenuBar(null);
			painelCarro = new PainelCarro();
			painelVenda = new PainelVenda();
			controleCarroPasseio.controlePainelVenda(painelVenda);
			this.setContentPane(painelVenda);
		} else if (e.getSource()==this.item4Menu1) {
			this.setJMenuBar(null);
			painelCarro = new PainelCarro();
			controleCarroCarga = new ControleCarroCarga(painelCarro);
			this.setContentPane(painelCarro);
		}
	
	}
	
}
