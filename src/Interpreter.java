import java.util.Scanner;

public class Interpreter {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)) {
			while(true) {
				String str = in.nextLine();
				int accumulator = 0;
				
				for(int i = 0; i < str.length(); i++) {
					switch(Character.toUpperCase(str.charAt(i))) {
					case 'H':
						System.out.println("Hello, world!");
						break;
					case 'Q':
						System.out.println(str);
						break;
					case '9':
						for(int j = 99; j > 1; j--)
							System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer.\nTake one down pass it around, " + (j - 1) + " bottles of beer on the wall.\n");
						System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\nTake one down pass it around, no more bottles of beer on the wall.\n");
						System.out.println("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 more bottles of beer on the wall.");
						break;
					case '+':
						accumulator++;
					}
				}
			}
		}
	}
}
