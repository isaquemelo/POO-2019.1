import java.util.*;
import java.time.LocalDate;

class Lista01_05 {

	static void print(String info){
		System.out.println(info);
	}

	static void monthName(int month){
		Hashtable<Integer, String> months = new Hashtable<>();
		months.put(1, "jan");
		months.put(2, "feb");
		months.put(3, "mar");
		months.put(4, "abr");
		months.put(5, "mai");
		months.put(6, "jun");
		months.put(7, "jul");
		months.put(8, "ago");
		months.put(9, "set");
		months.put(10, "out");
		months.put(11, "nov");
		months.put(12, "dez");

		print(months.get(month));
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		int month = user_input.nextInt();

		monthName(month);

	}
}