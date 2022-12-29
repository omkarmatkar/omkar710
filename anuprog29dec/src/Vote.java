package omkarprog;
import java.util.Scanner;
public class Vote {


	
		
		public static void main(String args[])
		{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("What is your age?");
		age=sc.nextInt();
		if(age>=18)
		System.out.println("You are eligible to vote."); //if the age is 18yrs and above
		else
		System.out.println("You are not eligible to vote.");//if the age is below 18yrs

		}

		}
	
