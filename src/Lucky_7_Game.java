import java.util.*;
import java.util.Random;
public class Lucky_7_Game {
	public static void main(String[] args) {
		// Ask player how much wanna spend
		Scanner in = new Scanner(System.in);
		System.out.println("How much you want to spend money?");
		int money_have = in.nextInt();
		
		int money = 5;
		
		//add money to the game 

		while(money > 0) {
			Random ran = new Random();
			int num1 = ran.nextInt(10)+1;
			int num2 = ran.nextInt(10)+1;
			int num3 = ran.nextInt(10)+1;
			System.out.println("The three random numbers are: " + num1 + ", " + num2+", "+ num3);
			
			if(num1 == 7 || num2 ==7 || num3 ==7) {
				System.out.println("You won");
			}
				
			else {
				System.out.println("You lost");

			}
			
			if(num1 == 7|| num2 == 7 || num3 ==7) {
				money +=3;
				System.out.println("You won 3€");
			}
			if(num1==7 && num2==7 && num3==7) {
				money+=10;
				System.out.println("You won 10€");
			}
			if(num1==7 && num2 ==7 || (num1==7 && num3==7) || (num2==7 && num3==7)) {
				money+=5;
				System.out.println("You won 5€");
			}
			if(money==0) {
				System.out.println("You lost!");
				break;
			}
			Scanner play = new Scanner(System.in);
			System.out.println("Do you want to play again? (y/n)");
			String answer = play.nextLine();
			if (answer.equals("n")){
				System.out.println("Exit");
				break;
			}
		}
	}
}

	


