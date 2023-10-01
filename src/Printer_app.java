
public class Printer_app {

	public static void main(String[] args) {
		double number_1 = 10;
		double number_2 = 5;
		
		System.out.println("Printer App");
		System.out.print("This app is made by: ");
		
		String creator = "Evelyn Nguyen";
		// print the creator of the app to the console
		System.out.print(creator);
		

		System.out.println(number_1);
		//Print the number 1 to the console
		//Done
		System.out.println("The value of number 1 is " + number_1); //Declare number 1
		System.out.println("The value of number 2 is " + number_2); //Declare number 2
		
		System.out.println(number_1 + " * " + number_2 + " = "+ (number_1*number_2)); //multiply 2 numbers 
		System.out.println(number_1 + " + " + number_2 + " = "+ (number_1+number_2)); // sum of 2 numbers
		System.out.println(number_1 + " - " + number_2 + " = "+ (number_1-number_2)); //minus 2 numbers
		System.out.println(number_1 + " : " + number_2 + " = "+ (number_1/number_2)); //divide 2 numbers
	}

}
