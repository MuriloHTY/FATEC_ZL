package exercicio2;

public class Controller {

	public double divisao(double divisor, double dividendo) {
		if(divisor < dividendo) {
			return divisor;
		}
		return divisao(divisor-dividendo, dividendo);	
	}
	
}