import java.util.*;
import java.time.LocalDate;

class Lista01_01 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		double vel = user_input.nextDouble();
		double vel_km = vel / 3.6;
		print(Double.toString(vel_km));

	}
}