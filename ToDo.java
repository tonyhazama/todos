import java.util.Scanner;
public class ToDo{
	public static void main(String[] args){
		String todothing = "";
		Scanner keypress = new Scanner(System.in);

		System.out.print("What you want to do ? ");
		todothing = keypress.nextLine();
		System.out.println("So, you want to "+todothing+" huh ?");

	}
}