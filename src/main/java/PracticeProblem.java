/**
	* File: Lesson 1.11 - Math
	* Author: Jacky Lui
	* Date Last Modified: March 3, 2026
	*/
import java.util.Scanner;
public class PracticeProblem {
	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number = input.nextDouble();
		System.out.println(Math.abs(number));

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number1 = input.nextDouble();
		System.out.print("Input another number: ");
		double number2 = input.nextDouble();
		System.out.println(Math.floor(number1 / number2));
		System.out.println(Math.ceil(number1 / number2));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number = input.nextDouble();
		System.out.println(Math.round(Math.sqrt(number)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number = input.nextDouble();
		System.out.print("Input another number: ");
		double number1 = input.nextDouble();
		System.out.println(Math.pow(number, number1));

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double number = input.nextDouble();
		System.out.print("Input another number: ");
		double number1 = input.nextDouble();
		System.out.print("Input one more number: ");
		double number2 = input.nextDouble();
		System.out.println(Math.max(number1, Math.max(number, number2)));
		System.out.println(Math.min(number1, Math.min(number, number2)));
	}

}
