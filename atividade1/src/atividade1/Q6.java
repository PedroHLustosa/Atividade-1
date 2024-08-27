package atividade1;

import javax.swing.JOptionPane;

public class Q6 {

	public static void main(String[] args) {
		String str_salario_atual = JOptionPane.showInputDialog(null, "Digite o salario atual: ", "Salario", JOptionPane.DEFAULT_OPTION);
		String str_aumento = JOptionPane.showInputDialog(null, "Digite o percentual de aumento(sem %. Ex: 15): ", "Aumento", JOptionPane.DEFAULT_OPTION);
		float salario_atual = Float.parseFloat(str_salario_atual), aumento = Float.parseFloat(str_aumento), novo_salario;
		novo_salario = salario_atual + (salario_atual * aumento / 100);
		String str_novo_salario = String.format("%.2f", novo_salario), str_salario_atual2 = String.format("%.2f", salario_atual);
		JOptionPane.showMessageDialog(null, "O salario atual eh: R$"+str_salario_atual2+"\nCom o ajuste de "+aumento+"%, o novo salario eh: R$"+str_novo_salario);
		
	}

}
