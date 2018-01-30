import java.io.IOException;
import java.util.Scanner;

public class Bonetrousle {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException {
		scanner = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = scanner.nextInt();
		for( int i = 0 ; i < t ; i++ ) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int b = scanner.nextInt();
			int min = b * ( b + 1 ) / 2 ;
			int max = b * ( 2*k -b + 1 ) / 2 ;
			if( n >= min && n <= max) {
				System.out.println("True");
			}
			else {
				System.out.println(-1);
			}
		}

	}

}
