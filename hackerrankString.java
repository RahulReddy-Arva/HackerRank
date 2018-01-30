import java.util.*;


public class hackerrankString {
	private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int q = in.nextInt();
        String h = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next().toLowerCase();
            // your code goes here
            int j = 0; // J denoted the bound of the string hackerrank; 10
            //int count = 0;
            
            int i = 0;
            while(i<s.length() && j<h.length())	
            {if(s.charAt(i) == h.charAt(j)) { i++; j++;}
            else {i++;}
            }
            if( j == h.length()) System.out.println("YES");
            else System.out.println("NO");
            	
            }
        }
        
    }