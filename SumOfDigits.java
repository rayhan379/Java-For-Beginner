import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		  int sum=0,num,r,temp;
		  System.out.print("Enter the number =");
		  num=input.nextInt();
		  temp=num;
		  while(temp != 0) 
		  {
			  r=temp%10;
			  sum= sum+r;
			  temp=temp/10;
		  }
		  System.out.print("Sum of digits ="+sum);

	}

}
