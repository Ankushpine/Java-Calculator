package Basic;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		System.out.println("The Basic Claculator");

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first Number");
		double firstNum = s.nextInt();
		System.out.println("Select the operation (+, -, *, /):");
		char operation = s.next().charAt(0);
		System.out.println("Enter the Second Number");
		double secNum = s.nextInt();

		switch (operation) {
		case '+':
			System.out.println("The result is "+(firstNum+secNum)+".");
			break;
		case '-':
			System.out.println("The result is "+(firstNum-secNum)+".");
			break;	
		case '*':
			System.out.println("The result is "+(firstNum*secNum)+".");
			break;
		case '/':
			if(secNum!=0) {
				System.out.println("The result is "+(firstNum/secNum)+".");
			}
			else {
				System.out.println("Number cannot be divided by Zero.");
			}
			break;						
		default:
			System.out.println("Error: Invalid operator.");
			break;
		}
	}
}
