import java.util.*;
import java.time.LocalDate;

class Lista01_10 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		double num = user_input.nextDouble();
		int count = 0;

		while (!(num / 2  < 1)){
			num /= 2;
			count ++;
		}

		print("Num: " + Double.toString(num));
		print("Qnt: " + Integer.toString(count));

	}
}
