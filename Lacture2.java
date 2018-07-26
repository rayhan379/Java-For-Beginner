import java.util.Scanner;

public class Lacture2 {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);
		 int a,b,c,d,e ;
		 double f;
		 
         System.out.print( "Enter the Value=");
         a=input.nextInt();
         System.out.print( "Enter the Value=");
         b=input.nextInt();
         c= a+b;
         d=a-b;
         e=a*b;
         f=a/b;
         System.out.println("The sumation value is = "+c);
         System.out.println("The  substruction value is = "+d);
         System.out.println("The  multipication value is = "+e);
         System.out.println("The  divitional value is = "+f);
 
	}

}
