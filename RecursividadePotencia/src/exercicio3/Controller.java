package exercicio3;

public class Controller {


		public static int par(int num[], int lenght) {
			if (lenght < 0) {
				return 0;
			} else if (num[lenght] % 2 == 0) {
				return 1 + par(num, lenght - 1);
			}
			return par(num, lenght - 1);

		}
	

}
