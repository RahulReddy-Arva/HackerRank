import java.util.Scanner;

public class arratLeftRotation {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list = new ArrayList<Integer>();
		
		scanner = new Scanner(System.in);
		System.out.print("Enter the size of arraylist:  ");
		int size = scanner.nextInt();
		int[] list = new int[5];
		System.out.print("Enter the shift number:  ");
		int number = scanner.nextInt();
		for (int i=0; i<size ; i++) {
			//list.add(scanner.nextInt());
			list[i] = scanner.nextInt();
		}
		//Collections.sort(list);
		for(int t = 0 ; t< number ; t++ ) {
		int temp = 0;
		int len = list.length;
		int first = list[0];
		while(temp < len-1) {
			list[temp] = list[temp+1];
			temp++;
		} 
		list[len-1] = first;
		}
		
		for(int i=0; i< list.length ; i++) {
			System.out.print(list[i]+ " ");
		}
	}

}
