import java. util.*;
public class Memory_game {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int right_number = 0;
		List<Integer> numbers = new ArrayList<>(); //random number list
		List<Integer> userNumbers = new ArrayList<>(); //userNumbers list
		Scanner in = new Scanner(System.in); //To get the user number input
		
		System.out.println("Try to remember the following numbers. \nThe numbers will be shown for 4 seconds. ");
		
		// Make a list then add 7 random numbers in it
		for(int i = 1; i <=7; i++) {
			int ran = rand.nextInt(6);
			numbers.add(ran);
		}
		
		//print the list of 7 numbers 
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		
		//make the code that clear the screen by add 0 lines to feel likes clear the entire screen
		try {
			//The pause will last 1 second
			Thread.sleep(3000);
		}
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		
		//Inform that the screen is cleared
		for (int i = 0; i < 20; ++i) System.out.println();
		System.out.println("[The screen is cleared]");

		// make a loop to get the input of the user for 7 numbers then assign these numbers to a list called "userNumbers"
		for(int i =1; i<=7; i++) {
			System.out.println("Type number " + i + ":");
			int num = in.nextInt();
			userNumbers.add(num);
		}
		
		//Print out the 7 numbers 
		System.out.println("\nThe numbers were:");
		for (int num : numbers) { // The colon (:) here to iterate over the elements of the numbers list then assign it into num and print out to the console
			System.out.print(num + " "); // this is to avoid print out the the list with []
		}
		
		//Print out the user numbers 
		System.out.println("\nYour numbers were:");
		for(int usernum : userNumbers) {
			System.out.print(usernum + " ");
		}
		
		// check if the random list have same number in the user numbers 
		// if have, assign it into right number
		for (int i =0; i<7; i++) {
			if (numbers.get(i) == userNumbers.get(i)) {
				right_number++;
			}
		
		}
		
		// These code lines will calculate the percentage of right number that the user got
		double percentage_correct_answer = (double) right_number / 7 * 100;
		
		//Print the result to the console
		System.out.println("\nYou got " + right_number + " right number and " + percentage_correct_answer + "% of the correct answers.");


	}

}
