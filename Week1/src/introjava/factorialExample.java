package introjava;
import java.util.Scanner;

public class factorialExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("To find the factorial, p2lease enter a number: ");
		int numb = scan.nextInt();
		int i;
		int n=1;
		
		for(i=1; i<=numb; i++) {
			n = n * i;
		}
		System.out.print("Factorial of " + numb + " is " + n);
		
		scan.close();
	}
}
