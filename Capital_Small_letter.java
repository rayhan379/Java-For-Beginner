 import java.util.Scanner;

public class Capital_Small_letter {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		 char letter;
		 System.out.print("Enter the letter=");
		 letter=input.next().charAt(0);
		 if(letter>='a' && letter<='z') 
		 {
			 System.out.println("This is small letter" );
		 }
		 else if(letter>='A' && letter<='Z') 
		 {
			 System.out.println("This is capital lettter  " );
		 }
		 else 
		 {
			 System.out.println("This is  not to be a lettter  " ); 
		 }
	}

}
