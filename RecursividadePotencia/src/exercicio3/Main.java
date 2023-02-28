package exercicio3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
				Controller c = new Controller();
				
				int n = 1;
				int i = 0;
				i = Integer.parseInt(JOptionPane.showInputDialog(null, "Dê o tamanho do vetor:"));
				int[] num = new int[i];
				
				JFrame popup = new JFrame();
				
				JOptionPane.showMessageDialog(popup,"Preencha as "+i+" posições do vetor, então este programa retornará a quantidade de números pares contidos dentro do vetor.");
				
				
				for (n = 1 ; n < i+1 ; n++) {
					num[n-1]= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a "+n+"° posição do vetor:"));
				}
				

				int length = num.length;

				JOptionPane.showMessageDialog(popup, c.par(num, length - 1));
			
	}

}
