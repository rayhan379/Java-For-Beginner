import java.util.Scanner;
//www.Java Math Class....
public class MathClass {

	public static void main(String[] args) {
		 
		Scanner input= new Scanner(System.in);
		
		  int x,y;
		  System.out.print("Enter the two value is=");
		  x=input.nextInt();
		  y=input.nextInt();
		  
		  int max= Math.max(x,y);
		  System.out.println("Maximum Value is = "+max);    //max
		  
		  int min= Math.min(x,y);
		  System.out.println("Minimum Value is = "+min);          //min
		  
		  double power= Math.pow(x, y);
		  System.out.println(" X to the power of y = "+power);      //power
				  



	}

}
