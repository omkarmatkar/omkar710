package anuprog29dec;

import java.util.Scanner;

public class ExceptionDivide
{
	
	 public static void main(String[] args)
	 {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter 1 number:");
	         int i = sc.nextInt();// nextInt() reads the next integer from the keyboard
	         
	        System.out.println("Enter 2 number:");
	        int j= sc.nextInt();// nextInt() reads the next integer from the keyboard
	 
	        try {
	            int result = i/j; //1 divide by 2
	            
	            System.out.println("Result = " + result);
	        }
	        catch (ArithmeticException e)
	        {
	            System.out.println("Exception: Division by zero! ");
	        }
}
}