import java.util.*;

public class projectEuler14 {

    private static Scanner in;
	public static void main(String[] args) {
        in = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int N = in.nextInt();
            // HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
            int max1 = 0 ;
            int value = 0 ;
            ar = collatz(N-1);
            for( int k = N-2; k > 1 ; k--) {
            		if( ar.contains(k)) {
            			continue;
            		}
            		else {
            			ar = collatz(k);
					if( ar.size() > max1) {
						max1 = ar.get(0);
            			}
            		}
            }
            System.out.println(value);
        }
    }
	private static ArrayList<Integer> collatz(int n) {
		// TODO Auto-generated method stub
		int starting = n; 
		int count = 1 ;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int max = 0 ;
		ar.add(starting);
		while( starting !=1 ) {
			if( starting % 2 == 0 ) {
				starting = starting / 2;
				//System.out.print(starting + " ");
				ar.add(starting);
				count++;
			}
			else {
				starting = 3 * starting + 1 ;
				//System.out.print(starting + " ");
				ar.add(starting);
				count++;
			}
		}
		if(max < count-1) {
			max = count-1;
		}
		return ar;
	}
}
