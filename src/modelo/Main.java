package modelo;

import controle.ControlePrincipal;

//import javax.swing.JOptionPane;

public class Main {
	//static ControlePrincipal controleprincipal;
	/*public static Boolean bol (int x) {
		if (x==0) {
			return true;
		} else {
			return false;
		}
	}*/
	


	public Main(){
		ControlePrincipal.getInstance();
		
	}
	

	public static void main(String[] args) {
		new Main();
		/*Passeio passeio = new Passeio();
		Carga carga = new Carga();
		int op=9;
		float totalVendaspasseio = 0, totalVendasCarga = 0, valorLiquidoP = 0, valorLiquidoC = 0;
		do {
			op= Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:\n"+
			"0 - Para encerrar\n"
			+ "1 - Para Carros de Passeio\n"
			+ "2 - Para Carros de Carga\n"));
			switch (op) {
			case 0:
				JOptionPane.showMessageDialog(null, "Fim do Programa\n");
				break;
			case 1:
				passeio.setMarca(JOptionPane.showInputDialog("Digite a Marca: \n"));
				passeio.setModelo(JOptionPane.showInputDialog("Digite o Modelo: \n"));
				passeio.setMotorizacao(JOptionPane.showInputDialog("Digite a Potência do Motor: \n"));
				passeio.setAnoFabricacao(JOptionPane.showInputDialog("Digite o Ano de Fabricação do carro: \n"));
				passeio.setAnoModelo(JOptionPane.showInputDialog("Digite o ano do Modelo \n"));
				passeio.setChassi(JOptionPane.showInputDialog("Digite o Numero do chassi: \n"));
				passeio.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da compra")));
				passeio.setAr(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir ar?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				passeio.setVidroEletrico(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Vidro Eletrico?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				passeio.setTravaEletrica(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Trava Eletrica?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				passeio.setAlarme(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Alarme\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				passeio.setSom(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Som\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				passeio.calculaOpcionais();			
				passeio.setValorVenda((float)(passeio.getValorCompra()+(passeio.getValorCompra()+passeio.getOpcionais()*0.32)));
				totalVendaspasseio = totalVendaspasseio+passeio.getValorVenda();
				valorLiquidoP = valorLiquidoP+totalVendaspasseio-passeio.getValorCompra();
				JOptionPane.showMessageDialog(null, "O valor da venda é\n" + passeio.getValorVenda());
				break;
			case 2:
				carga.setMarca(JOptionPane.showInputDialog("Digite a Marca: \n"));
				carga.setModelo(JOptionPane.showInputDialog("Digite o Modelo: \n"));
				carga.setMotorizacao(JOptionPane.showInputDialog("Digite a Potência do Motor: \n"));
				carga.setAnoFabricacao(JOptionPane.showInputDialog("Digite o Ano de Fabricação do carro: \n"));
				carga.setAnoModelo(JOptionPane.showInputDialog("Digite o ano do Modelo \n"));
				carga.setChassi(JOptionPane.showInputDialog("Digite o Numero do chassi: \n"));
				carga.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da compra:\n")));
				carga.setAr(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir ar?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				carga.setVidroEletrico(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Vidro Eletrico?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				carga.setTravaEletrica(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Trava Eletrica?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				carga.setAlarme(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Alarme?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				carga.setSom(bol(JOptionPane.showConfirmDialog(null, "Deseja incluir Som?\n", "sim ou não", JOptionPane.YES_NO_OPTION)));
				carga.calculaOpcionais();
				carga.setValorVenda((float)(carga.getValorCompra()+((carga.getValorCompra()+carga.getOpcionais())*0.226)));
				totalVendasCarga = totalVendasCarga+carga.getValorVenda();
				valorLiquidoC = valorLiquidoC+totalVendaspasseio-passeio.getValorCompra();
				JOptionPane.showMessageDialog(null, "O valor da venda é\n" + carga.getValorVenda());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				op= Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n"+
						"1 - Para Carros de Passeio\n 2 - Para Carros de Carga\n"));
			}
		} while (op!=0);*/
	}

}
