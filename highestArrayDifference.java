import java.util.Scanner;

public class highestArrayDifference {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array:");
		scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("ENter the array elements:");
		for( int i=0; i<size ; i++ ) {
			arr[i] = scanner.nextInt();
		}
		int max = 0 ;
		for ( int i=0; i< size-1 ; i++) {
			int diff =  Math.abs(arr[i] - arr[i+1]);
			if( diff > max) {
				max = diff ;
			}
		}
		System.out.println(max);
	}

}
