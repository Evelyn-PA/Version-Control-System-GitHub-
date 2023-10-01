import java.util.*;

public class Guessing_game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		String answer = "Anhnguyen";
		while (true) {
			System.out.println("Please, guess my name.");

			String guess = in.nextLine();
			i++;
			
			if (guess.equals(answer)) {
				System.out.println("Congratulations!");
				System.out.println("Guesses: " + i );
				break;
			}
			
			System.out.println("Do you want to quit (y/n) ?");
			String ans = in.nextLine();
			
			 if (ans.equals("y")) {
				
				System.out.println("Guesses: " + i );
				break;
			}

		}
	}

}
