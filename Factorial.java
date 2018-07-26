import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int c, n, fact = 1;
		System.out.print("Enter a number to calculate its factorial = ");
		n=input.nextInt();

		    for (c = 1; c <= n; c++)
		    fact = fact * c;
		    System.out.println("Factorial of " +fact);

		  
	}
}
