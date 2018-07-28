import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
		 
		 int A[][]=new int [3][3];
		 int dio=0;                  // sum of diagonal elements
		 int uper=0;                  // sum of  upper triangle elements
		 int lower=0;                  //sum of  lower triangle  elements
		 //Matrix Input
		 
		 for(int row=0;row<3;row++) 
		 {
			 for(int col=0;col<3;col++)
				 A[row][col]=input.nextInt();
		 }
		 
		 //diagonal, upper triangle and lower triangle 
		 
		 for(int row=0;row<3;row++) 
		 {
			 for(int col=0;col<3;col++)
			 {
				  if(row==col) 
				  {
					  dio=dio+A[row][col];
				  }
			 
			 
			      if(  row<col) 
			      {
				  uper=uper+A[row][col];
			       }
			
			      if(row>col) 
			       {
				   lower=lower+A[row][col];
			       }
			 
			 
			  
		 }
		 
		 
		}
		 
		 System.out.println("sum of diagonal elements ="+dio);
		 System.out.println("sum of   upper triangle elements ="+uper);
		 System.out.println("sum of   lower triangle elements ="+lower);
	 

	}

}
