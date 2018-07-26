import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		 int number;
		 System.out.print("Enter an integer = ");
		 number=input.nextInt();
		 if( number%2 == 0 )
			     System.out.println("is an even integer" +number);
			else
				System.out.println("is an odd integer" +number);
	}

}
 