import java.util.*;

public class projectEuler9 {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(pythogorean(n));
            
        }
    }

	private static long pythogorean(int n) {
		long product = 0 ;
		long max = 0 ;
		for (int a = 1 ; a < n/2 ; a++) {
			for( int b = a+1 ; b< n/2 ; b++) {
				int c = n -a - b ;
				if( a<b && b<c && (a*a + b*b == c*c) ) {
					product = a*b*c;
				}
				if( max < product ) {
					max = product;
				}
			}
		}
		if( max > 0 ) {
			return max;
		}
		else {
			return -1;
		}
	}
}
