package hq9plus;

public class Interpreter {
	@SuppressWarnings("unused")
	private int accumulator;
	private String source;
	
	public Interpreter(String s) {
		source = s;
	}
	
	public String interpret() {
		String output = "";
		accumulator = 0;
		
		for(int i = 0; i < source.length(); i++) {
			switch(Character.toUpperCase(source.charAt(i))) {
			case 'H':
				output += "Hello, world!\n";
				break;
			case 'Q':
				output += source + "\n";
				break;
			case '9':
				for(int j = 99; j > 1; j--)
					output += j + " bottles of beer on the wall, " + j + " bottles of beer.\nTake one down pass it around, " + (j - 1) + " bottles of beer on the wall.\n\n";
				output += "1 bottle of beer on the wall, 1 bottle of beer.\nTake one down pass it around, no more bottles of beer on the wall.\n\n";
				output += "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 more bottles of beer on the wall.\n";
				break;
			case '+':
				accumulator++;
			}
		}
		
		return output;
	}
	
	public void set(String s) {
		source = s;
	}
}
