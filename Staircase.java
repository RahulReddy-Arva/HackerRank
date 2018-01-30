import java.util.Scanner;

public class Staircase {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for( int i = 1; i <= n ; i++) {
			for( int j = n-i ; j > 0 ; j-- ) {
				System.out.print(" ");
			}
			for( int k = i ; k > 0 ; k--) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}

}
