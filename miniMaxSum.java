import java.util.*;

public class miniMaxSum {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int[] arr = new int[5];
        long min = 0;
        long max = 0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];
        for( int i = 1 ; i < arr.length-1 ; i++ ) {
        		min += arr[i];
        		max += arr[i];
        }
        System.out.println(min + " " + max);
    }
}