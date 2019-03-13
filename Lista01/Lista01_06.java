import java.util.*;
import java.time.LocalDate;

class Lista01_06 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		String nome = user_input.nextLine();
		int num_diarias = user_input.nextInt();

		if (num_diarias > 15){
			print(nome);
			print(Double.toString(5.50 * num_diarias));
		} else if (num_diarias == 15){
			print(nome);
			print(Double.toString(6 * num_diarias));
		} else if (num_diarias < 15){
			print(nome);
			print(Double.toString(8 * num_diarias));
		}


	}
}