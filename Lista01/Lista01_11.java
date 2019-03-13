import java.util.*;
import java.time.LocalDate;

class Lista01_11 {

	static void print(String info){
		System.out.println(info);
	}

	public static void main(String args[]){
		Scanner user_input = new Scanner(System.in);
		Hashtable<Integer, Double> cardapio = new Hashtable<Integer, Double>();
		cardapio.put(10, 1.50);
		cardapio.put(11, 1.80);
		cardapio.put(12, 1.90);
		cardapio.put(20, 10d);
		cardapio.put(30, 8d);
		cardapio.put(50, 2.5d);

		//Set s = cardapio.entrySet();

		double conta = 0;

		while (true){
			print("Deseja continuar? (s/n)");
			String user_status = user_input.nextLine();
			if (user_status.equals("n")) break;

			print("Digite o cod do produto: ");
			int cod = user_input.nextInt();
			print("Quantos produtos desse cod vc deseja?");
			int qnt = user_input.nextInt();

			conta += cardapio.get(cod) * qnt;

			print("Conta atual: " + Double.toString(conta) );

		}

		//print("" + cardapio.values());

	}
}