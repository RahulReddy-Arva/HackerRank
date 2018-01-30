/*
 finding out the largest prime factor of a number.
 */

import java.util.*;

public class projectEuler3 {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            for (long j = 2;j <= Math.floor(Math.sqrt(n));) {
                if (n % j == 0) {
                    n /= j;
                } else {
                    j++;
                }
            }
            System.out.println(n);
            
	}
	}
}


