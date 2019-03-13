import java.util.*;
import java.time.LocalDate;

class Lista01_07 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		
		int valor = user_input.nextInt();

		if ( 0 <= valor && valor <= 49 ){
			print("Insuficiente");
		} else if ( 50 <= valor && valor <= 64 ){
			print("Regular");
		} else if ( 65 <= valor && valor <= 84 ){
			print("Bom");
		} else if ( 85 <= valor && valor <= 100 ){
			print("Otimo");
		}

	}
}