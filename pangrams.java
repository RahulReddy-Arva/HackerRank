import java.util.Scanner;

public class pangrams {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String s = scanner.nextLine().toLowerCase();
		String data = "abcdefghijklmnopqrstuvwxyz";
		int flag = 0 ;
		for(int i=0 ; i < data.length() ; i++) {
			//System.out.println(s.indexOf(data.charAt(i)));
			if( s.indexOf(data.charAt(i)) >= 0  )  {
				flag = 1;
			}
			else {
				flag = 0;
				System.out.println("not pangram");
				break;
			}
		}
		if(flag == 1) {
			System.out.println("pangram");
		}
	}
}