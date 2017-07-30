package cli;

import java.util.Scanner;

public class CommandLineHandler {
	private Scanner kb;
	
	public CommandLineHandler() {
		kb = new Scanner(System.in);
	}
	
	public void start() {
		String input = "";
		
		while(true) {
			System.out.print("> ");
			input = kb.nextLine();
			
			if(isExitCommand(input)) {
				break;
			}
			
			System.out.printf("Command Entered: %s\n", input);
		}
	}
	
	private boolean isExitCommand(String input) {
		return input.equalsIgnoreCase("exit");
	}
}
