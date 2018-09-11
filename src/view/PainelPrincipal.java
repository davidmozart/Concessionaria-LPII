package view;


import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelPrincipal extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JButton btVenda;
	private JButton btCadastro;
	
	public PainelPrincipal() {
		this.setLayout(null);
		this.setSize(600, 600);
		this.setVisible(true);
		btCadastro = new JButton("Cadastrar Carro");
		this.add(btCadastro);
		btCadastro.setBounds(180, 240, 128, 35);
		btVenda = new JButton("Vender Carro");
		this.add(btVenda);
		btVenda.setBounds(315, 240, 128, 35);
	}

	public JButton getBtVenda() {
		return btVenda;
	}

	public void setBtVenda(JButton btVenda) {
		this.btVenda = btVenda;
	}

	public JButton getBtCadastro() {
		return btCadastro;
	}

	public void setBtCadastro(JButton btCadastro) {
		this.btCadastro = btCadastro;
	}
	
	
}
