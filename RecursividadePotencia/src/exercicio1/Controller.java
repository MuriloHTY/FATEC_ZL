package exercicio1;

public class Controller {

	public int multiplicao(int a, int b) {
		if(b < 1) {
			return 0;
		}
		return a + multiplicao(a, b-1);	
	}
}
