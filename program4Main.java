//Jessica Hadwiger Program4 7/3/17
import java.util.Scanner;
public class program4Main
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double num1, num2;		
		int choice;
		
		choice = displayMenu();
		
		while (choice != 5)
		{			
			if (choice >=1 && choice <=5)
			{
				System.out.println("Enter an integer.");
				num1 = keyboard.nextDouble();
				System.out.println("Enter another integer.");
				num2 = keyboard.nextDouble();
				if (num1 < 0 || num2 < 0)
				{
					System.out.println("Do not enter any integers below zero. Please re-enter two postive integers.");
					System.out.println();
					choice = -1;
				}
				switch (choice)
				{
				case 1:
				{
					findLargest(num1, num2);
					break;
				}
				case 2:
				{
					findSmallest(num1, num2);
					break;
				}
				case 3:
				{
					findSum(num1,num2);
					break;
				}
				case 4:
				{
					findDifference(num1, num2);
					break;
				}
				case 5:
				{
					break;
				}
				}//end of switch
			}//end of if
			else
			{
				System.out.println("Please enter a value between 1-5.");
			}
			choice = displayMenu();
		}//end of while
	}//end of main
	public static int displayMenu()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 1 to find the largest number. ");
		System.out.println("Enter 2 to find the smallest number.");
		System.out.println("Enter 3 to find the sum.");
		System.out.println("Enter 4 to find the difference.");
		System.out.println("Enter 5 to exit.");
		int choice = keyboard.nextInt();
		return choice;
	}//end of displayMenu
	
	public static void findLargest(double n1, double n2)
	{
		double num1 = n1;
		double num2 = n2;
		if (num1 > num2)
		{
			 System.out.println(n1 + " > " + n2);
			 System.out.println("The largest integer is: " + n1);
			 System.out.println();
		}
		else if (num2 > num1)
		{
			System.out.println(n2 + " > " + n1);
			 System.out.println("The largest integer is: " + n2);
			 System.out.println();
		}
		else if (num2 == num1)
		{
			System.out.println(n1 + " = " + n2);
			System.out.println("There is not a larger integer for: " + n1 + " = " + n2);
			System.out.println();
		}
	}//end of findLargest
	public static void findSmallest (double n1, double n2)
	{
		double num1 = n1;
		double num2 = n2;
		if (num1 < num2)
		{
			System.out.println(n1 + " < " + n2);
			System.out.println("The smallest integer is: " + n1);
			System.out.println();
		}
		else if (num2 < num1)
		{
			System.out.println(n2 + " < " + n1);
			 System.out.println("The smallest integer is: " + n2);
			 System.out.println();
		}
		else if (num2 == num1)
		{
			System.out.println(n1 + " = " + n2);
			System.out.println("There is not a smaller integer for " + n1 + " = " + n2);
			System.out.println();
		}
	}//end of findSmallest
	public static void findSum(double n1, double n2)
	{
		double answer;
		double num1 = n1;
		double num2 = n2;
		answer = num1 + num2;
		System.out.println(n1 + " + " + n2 + " = " + answer);
		System.out.println("The sum of the two integers is: " + answer);
		System.out.println();
	}// end of findSum
	public static void findDifference(double n1, double n2)
	{
		double answer;
		double num1 = n1;
		double num2 = n2;
		answer = num1 - num2;
		System.out.println(n1 + " - " + n2 + " = " + answer);
		System.out.printf("The difference of the two integers is: " + answer);
		System.out.println();
	}//end of findDifference
}//end of prgrm
