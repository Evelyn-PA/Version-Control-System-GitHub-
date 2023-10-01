import java.util.*;

public class Guessing_game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		String answer = "Anhnguyen";
		//Make a loop to ask the players guess the name
		while (true) {
			System.out.println("Please, guess my name.");

			String guess = in.nextLine();
			i++;
			//If the players guess the right answer -> print "Congratulations!" then exit the program
			if (guess.equals(answer)) { 
				System.out.println("Congratulations!");
				System.out.println("Guesses: " + i );
				break;
			}
			//Ask players to continue or exit the program
			System.out.println("Do you want to quit (y/n) ?");
			String ans = in.nextLine();
			//if the players exit the game -> print how many times they guess and exit
			 if (ans.equals("y")) {
				
				System.out.println("Guesses: " + i );
				break;
			}

		}
	}

}
