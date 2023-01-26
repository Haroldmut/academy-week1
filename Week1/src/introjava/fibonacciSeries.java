package introjava;
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = scan.nextInt();
		
		if(n>0) {
		int a=0, b=1, c, i;
		System.out.print(a + " " + b);
		
		for(i=2; i<n; ++i){
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		} else{
			System.out.println("Try a positive number");
		}	
	}

}
