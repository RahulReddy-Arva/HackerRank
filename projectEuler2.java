/*
 Sum of even elements of fibonacci series till a number.
 		1,2,3,5,8,13,21,34,55,89,.........
 
Sample Input 0
2
10
100

Sample Output 0
10 (2,8)
44 (2,8,34)
 */

import java.util.*;

public class projectEuler2 {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(fib(n));
        }
    }

	private static long fib(long n) {
		// TODO Auto-generated method stub
		long sum;
		long first = 1;
		long second = 2;
		long count = 0;
		if(first%2 == 0) {
			count += first;
		}
		while(second < n) {
			sum = 0 ;
			if(second %2 == 0) {
				count += second;
			}
			sum = first + second;
			first = second ;
			second = sum ;
		}
		return count;
	}
}
