import java.util.ArrayList;
import java.util.Scanner;

public class weightedUniformStrings {

	private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        char [] charArray = s.toCharArray();
        int value = 1;
        int previous = 0;
        //Set<Integer> numList = new HashSet<Integer>();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for( int i=0 ;i< charArray.length; i++ ){
            int current = charArray[i] -'a'+1;
            if(current == previous){
                value++;
            }
            else{
                value = 1;
                previous = current;
            }
            int num = (current) * value;
            numList.add(num); 
        }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(numList.contains(x) ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }

}
