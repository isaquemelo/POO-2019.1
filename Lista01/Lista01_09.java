import java.util.*;
import java.time.LocalDate;

class Lista01_09 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		double numA = user_input.nextDouble();
		double numB = user_input.nextDouble();

		int odd = 0;
		int even = 0;

		for (int i = (int) numA; i <= (int) numB; i++) {
			if (i % 2 == 0){
				even ++;
			} else {
				odd ++;
			}
		}


		print("odd: " + Integer.toString(odd));
		print("even: " + Integer.toString(even));

	}
}