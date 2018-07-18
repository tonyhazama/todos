import java.util.Scanner;
public class ToDo{
	public static void main(String[] args){
		String todothing, answer;
		Scanner keypress = new Scanner(System.in);

		System.out.print("What you want to do ? ");
		todothing = keypress.nextLine();
		System.out.println("So, you want to "+todothing+" huh ?");

		System.out.print("Do you want to go with me ? ");
		answer = keypress.nextLine();
		System.out.println(answer+" ? okay than.");
	}
}