import java.util.Scanner;

public class projectEuler12 {
	
private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for( int i = 0 ; i < T ; i++) {
			int N = scanner.nextInt();
			triangularNumber(N);
		}
	}

	public static void triangularNumber(int n) {
		int value = 0; 
		for( int i = 1; ; i++) {
			value  += i ;
			int factor = factors(value);
			if( factor-1 == n ) {
				System.out.println(value);
				break;
			}
		}
	}

	public static int factors(int value) {
		int count = 0 ;
		for( int i = 1 ; i <= value ; i++ ) {
			if( value % i == 0 ) {
				count++;
			}
		}
		return count;
	}
	
}