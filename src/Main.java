import java.util.Scanner;
import hq9plus.Interpreter;

public class Main {
	public static void main(String[] args) {
		Interpreter i;
		
		try(Scanner in = new Scanner(System.in)) {
			while(true) {
				i = new Interpreter(in.nextLine());
				System.out.println(i.interpret());
			}
		}
	}
}