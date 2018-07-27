import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		  int sum=0,num,r,temp;
		  System.out.print("Enter the number =");
		  num=input.nextInt();
		  temp=num;
		  while(temp != 0) 
		  {
			  r=temp%10;
			  sum= sum+r*r*r;    //r^3
			  temp=temp/10;
		  }
		  if(num==sum) 
		  {
			  System.out.print("Armstrong Number "+sum);
		  }
		  else
		  System.out.print("Not Armstrong Number  ="+sum);

	}

}
