package basic;

import java.util.Scanner;

public class UserInput 
{

	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter some number:");
			int num=scan.nextInt();
			System.out.println("The Stored value is:");
			System.out.println(num);
		}
		try (Scanner scan1 = new Scanner(System.in)) {
			System.out.println("Enter some number:");
			double num1=scan1.nextDouble();
			System.out.println("The Stored value is:");
			System.out.println(num1);
		}
		try (Scanner scan2 = new Scanner(System.in)) {
			System.out.println("Enter some character:");
			String input=scan2.nextLine();
			System.out.println("The Stored value is:");
			System.out.println(input);
		}
	}
}
