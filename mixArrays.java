import java.util.Scanner;

public class mixArrays {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanner = new Scanner(System.in);
		System.out.println("Enter first string:");
		String a = scanner.nextLine();
		System.out.println("Enter second string:");
		String b = scanner.nextLine();
		String value = "";
		int len;
		
		if ( a.length() >= b.length() ) {
			len = a.length();
		}
		else	
			len = b.length();
		
		for ( int i=0 ; i< len ; i++ ) {
			if( i< a.length()) {
				value += a.charAt(i);
			}
			if( i < b.length() ) {
				value += b.charAt(i);
			}
		}
		System.out.println(value);
	}
}
