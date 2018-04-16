import java.util.Scanner;
import hq9plus.Interpreter;

public class Main {
	public static void main(String[] args) {
		Interpreter i = new Interpreter("");
		
		try(Scanner in = new Scanner(System.in)) {
			while(true) {
				i.set(in.nextLine());
				System.out.println(i.interpret());
			}
		}
	}
}