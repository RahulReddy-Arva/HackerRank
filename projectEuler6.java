/*
 To calculate the absolute difference between squares of sum of n numbers to the sum of squares of numbers.
 		diff = (1+2+3)pow2 - (1pow2 + 2pow2 + 3pow2) = 22
 
 */

import java.math.BigInteger;
import java.util.*;

public class projectEuler6 {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            BigInteger sumOfNumbers = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n+1)).divide(BigInteger.valueOf(2)); 
            sumOfNumbers = sumOfNumbers.pow(2);
            BigInteger sumOfSquares = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n+1)).multiply(BigInteger.valueOf(2*n+1)).divide(BigInteger.valueOf(6));
            System.out.println(sumOfNumbers.subtract(sumOfSquares));
        }
    }
}
