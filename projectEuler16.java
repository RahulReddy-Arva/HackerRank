import java.util.Scanner;

public class projectEuler16 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter number of testcases: " );
		int T = in.nextInt();
		System.out.println("Enter the values: ");
		for( int i = 0 ; i < T ; i++ ) {
			int N = in.nextInt();
			long power =  (long) Math.pow(2, N);
			long sum = 0 ; 
			while(power > 0 ) {
				sum = sum + power%10 ;
				power = power/10 ;
			}
			System.out.println(sum);
		}
		in.close();
	}
}