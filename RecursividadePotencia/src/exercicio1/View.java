package exercicio1;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {
		Controller c = new Controller();
		
		JFrame popup = new JFrame ();

		JOptionPane.showMessageDialog(popup, "Digite 2 valores, então este programa retornará a multiplicação entre os dois valores através de somas por recursovidade.");
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1° numero: "));
		int mult = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2° numero: "));
	
		JOptionPane.showMessageDialog(popup, "A multiplicação entre "+num+" e "+mult+" é igual à: "+c.multiplicao(num, mult));

	}

}
