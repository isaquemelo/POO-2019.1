import java.util.*;
import java.time.LocalDate;

class Lista01_02 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		int nascimento = user_input.nextInt();
		print("A idade eh " + Integer.toString(2019 - nascimento));

	}
}