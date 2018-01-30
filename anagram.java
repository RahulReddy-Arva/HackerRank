
import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	private static boolean isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if( a.length() == b.length() ) {
			char[] c1 = a.toLowerCase().toCharArray();
			char[] c2 = b.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			for ( int i = 0; i < a.length() ; i++ ) {
				//System.out.println(c1[i] + " " + c2[i] + " "+ i );
				if(c1[i] == c2[i]) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			
			
				
		}
	return flag;
	}

}
