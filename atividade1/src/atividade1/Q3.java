package atividade1;
import javax.swing.JOptionPane;
public class Q3 {

	public static void main(String[] args) {
		
		String str_horas = JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: ", "Horas Trabalhadas", JOptionPane.DEFAULT_OPTION);
		String str_valor = JOptionPane.showInputDialog(null, "Digite o valor recebido por hora: ", "Valor por Hora", JOptionPane.DEFAULT_OPTION);
		int horas = Integer.parseInt(str_horas), valor = Integer.parseInt(str_valor), salario;
				salario = horas * valor;
			JOptionPane.showMessageDialog(null, "O seu salario eh: "+salario, "Salario", JOptionPane.INFORMATION_MESSAGE);
	}

}
