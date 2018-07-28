import java.util.Scanner;

public class Matrix_Array {

	     public static void main(String[] args) {
				   Scanner input=new Scanner(System.in);
				   
				   int [][] A = new int [2][3];
				   int [][] B = new int [2][3];
				    
				   //gatting input for A Matrix
						  for(int row=0;row<2;row++) 
						  {
							  for(int col=0;col<3;col++)
							  {
								  System.out.printf("A[%d][%d] = ", row,col);
								  A [row][col]=input.nextInt();
							  }
						  }
						  
					 //Printing A matrix
						  System.out.print("A =");
						  for(int row=0;row<2;row++) 
						  {
							  for(int col=0;col<3;col++)
							  {
								  System.out.print("\t  "+A[row][col]);
							  }
							  System.out.println();
						  }
						  
						  System.out.println();
						  
						//gatting input for B Matrix
						  for(int row=0;row<2;row++) 
						  {
							  for(int col=0;col<3;col++)
							  {
								  System.out.printf("B[%d][%d] = ", row,col);
								  B [row][col]=input.nextInt();
							  }
						  }
						  
						  
					 //Printing B matrix
						  
						  System.out.print("B =");
						  for(int row=0;row<2;row++) 
						  {
							  for(int col=0;col<3;col++)
							  {
								  System.out.print("\t  "+B[row][col]);
							  }
							  System.out.println();
						  }
						  
						  System.out.println();
						  
					//Add
						
						  System.out.print("A+B");
						  for(int row=0;row<2;row++) 
						  {
							  for(int col=0;col<3;col++)
							  {
								  System.out.print("\t  "+(A[row][col]+B[row][col]));
							  }
							  System.out.println();
						  }

			}

		

	}


