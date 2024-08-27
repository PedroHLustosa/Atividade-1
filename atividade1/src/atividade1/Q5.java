package atividade1;

import javax.swing.JOptionPane;

public class Q5 {

	public static void main(String[] args) {
		String nome_produto = JOptionPane.showInputDialog(null, "Digite o nome do produto:", "Nome Produto", JOptionPane.DEFAULT_OPTION);
		String str_valorP = JOptionPane.showInputDialog(null, "Digite o valor do produto:","Valor do Produto",JOptionPane.DEFAULT_OPTION);
		String str_valordesconto = JOptionPane.showInputDialog(null, "Digite o valor do desconto(sem %):", "Desconto", JOptionPane.DEFAULT_OPTION);
		float valordesconto = Float.parseFloat(str_valordesconto), valorP = Float.parseFloat(str_valorP), valorfinal;
		valorfinal= valorP - (100 / valordesconto);
		String str_valorfinal = String.format("%.3f", valorfinal), str2_valorP = String.format("%.3f", valorP);
		JOptionPane.showMessageDialog(null, "Nome do Produto: "+nome_produto+"\nValor Antigo: R$"+str2_valorP+"\nValor com desconto aplicado: R$"+str_valorfinal, "Total", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
