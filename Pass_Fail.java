import java.util.Scanner;

public class Pass_Fail 
      {

	public static void main(String[] args) {
		int marks, passingMarks;
		 
	    passingMarks = 40;
	 
	    Scanner input = new Scanner(System.in);
	 
	    System.out.print("Input marks scored by you = ");
	 
	    marks  = input.nextInt();
	 
	    if (marks  >= passingMarks) 
	    {
	      System.out.println("You passed the exam.");
	    }
	    else 
	       {
	      System.out.println("Unfortunately, you failed to pass the exam.");


	       }
	    
}
      }
	

