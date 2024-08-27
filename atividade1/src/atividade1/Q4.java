package atividade1;

import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", "Nome", JOptionPane.DEFAULT_OPTION);
		String str_nascimento = JOptionPane.showInputDialog(null, "Digite o ano que voce nasceu: ", "Idade", JOptionPane.DEFAULT_OPTION);
		int nascimento = Integer.parseInt(str_nascimento), idade;
		idade = 2024 - nascimento;
		JOptionPane.showMessageDialog(null,"Você se chama "+nome+" e possui "+idade+" anos de idade!", "Final", JOptionPane.INFORMATION_MESSAGE);
	}

}
