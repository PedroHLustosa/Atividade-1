package atividade1;
import javax.swing.JOptionPane;
public class Q2 {

	public static void main(String[] args) {
		String raio = JOptionPane.showInputDialog(null, "Digite o raio do circulo:", "Entrada de Dados", JOptionPane.DEFAULT_OPTION);
		double r = Double.parseDouble(raio);
		
		double A = 3.141592653 * (r * r);
		
		String N = String.format("%.4f", A);
				
		JOptionPane.showMessageDialog(null, "A area do cirulo de raio "+ raio +" eh = "+ N, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
