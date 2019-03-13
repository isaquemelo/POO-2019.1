import java.util.*;
import java.time.LocalDate;

class Lista01_04 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();

		double media = 0;

		for (int i = 0; i < 4; i++) {
			notas.add(user_input.nextDouble());
			media += notas.get(i);
		}

		media = media / 4;

		if (media >= 7){
			print("Aprovado!");
		} else if (media < 7 && media >= 5){
			print("Final!");
		} else {
			print("Reprovado!");
		}

		print("A media eh " + Double.toString(media));

	}
}