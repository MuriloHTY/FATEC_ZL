package exercicio2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class view2 {

	public static void main(String[] args) {
		
		Controller c =new Controller();
		
		JFrame popup = new JFrame();
		
		JOptionPane.showMessageDialog(popup, "Entre com o Dividendo e o Divisor, então este programa retornará o resto da divisão através de subtrações por recursividade.");
		
		double divisor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o Dividendo?"));
		double dividendo= Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o Divisor?"));

		JOptionPane.showMessageDialog(popup, c.divisao(divisor, dividendo));
	}
	
}
