/*
 Multiples of 3 or 5 between a value 't' .
 */

import java.util.*;


public class projectEuler1 {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long n1,n2,n3;
            n1 = (n-1)/3;
            n1 = 3 * n1 * (n1+1)/2;
            n2 = (n-1)/5;
            n2 = 5 * n2 * (n2+1)/2;
            n3 = (n-1)/15;
            n3 = 15 * n3 * (n3+1)/2;
            System.out.println(n1 + n2 - n3);
        }
    }
}
