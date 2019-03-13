import java.util.*;
import java.time.LocalDate;

class Lista01_08 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		
		double media = 0;
		int max = 0;
		int min = 0;

		for (int i = 0; i < 10; i++){

			int valor = user_input.nextInt();
			media += valor;

			if (i == 0){
				max = valor;
				min = valor;
			}

			if (valor > max){
				max = valor;
			}

			if (valor < min){
				min = valor;
			}
		}


		print("Max: " + Integer.toString(max));
		print("Min: " + Integer.toString(min));
		print("Media: " + Double.toString(media / 10));

	}
}