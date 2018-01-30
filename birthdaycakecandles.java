import java.util.*;

public class birthdaycakecandles {

    private static Scanner in;

	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
    		Arrays.sort(ar);
    		int max = ar[n-1];
    		int count = 0;
    		for( int i = 0; i < n ; i++){
                if(ar[i] == max){
                    count++;
                }
            }
    		return count;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
