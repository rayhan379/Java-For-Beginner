import java.util.Scanner;

public class Vowel_Consonent_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		 char letter;
		 System.out.print("Enter the letter=");
		 letter=input.next().charAt(0);
		 if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') 
		 {
			 System.out.println("This letter is voewl" );
		 }
		 else 
		 {
			 System.out.println("This letter is Consonent"); 
		 }

	}

}
