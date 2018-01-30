import java.util.*;

public class projectEuler5 {

    private static Scanner in;



	public static int gcd (int a, int b) {
    	if(b == 0) {
    		return a;
    	}
    	else {
    		return (gcd(b, a%b));
    	}
    }
    
    public static int lcm(int[] a, int n) {
    	  int res = 1, i;
    	  for (i = 0; i < n; i++) {
    	    res = res*a[i]/gcd(res, a[i]);
    	  }
    	  return res;
    	}
	
	
	
	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int temp = n;
            int input[] = new int[n];
            for(int i = 0; i < n; i++) {
            	input[i] = temp;
            	temp--;
            }
            System.out.println(lcm(input, n));
        }
    }
}