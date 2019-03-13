import java.util.*;
import java.time.LocalDate;

class Lista01_03 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();

		int[] pesos = {2, 3, 5};
		double media = 0;

		for (int i = 0; i < 3; i++) {
			notas.add(user_input.nextDouble());
			media += notas.get(i);
		}



		print("A media eh " + Double.toString(media / 10));

	}
}