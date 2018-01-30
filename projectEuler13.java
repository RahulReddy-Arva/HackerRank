import java.math.BigInteger;
import java.util.Scanner;

public class projectEuler13 {
	
private static Scanner scanner;

public static void main(String[] args) {
	scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	BigInteger sum = BigInteger.ZERO  ;
	for( int i = 0 ; i < N ; i++ ) {
		BigInteger value = scanner.nextBigInteger();
		sum = value.add(sum);
	}
	String x = sum + "";
	System.out.println( x.substring(0, 10) );
	}
}