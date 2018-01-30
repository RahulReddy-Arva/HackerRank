import java.util.*;


public class projectEuler8 {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int k = in.nextInt();
            int max = 0;
            String num = in.next();
            for( int i =0 ; i<= num.length()-k ; i++ ) {
            		String temp = num.substring(i, i+k);
            		int value = largeProduct(temp);
            		if(max < value) {
            			max = value;
            		}
            }
            System.out.println(max);
        }
    }

	private static int largeProduct(String temp) {
		// TODO Auto-generated method stub
		int value = 1;
		for(int i = 0; i < temp.length() ; i++ ) {
			int value1 = temp.charAt(i) - 48;
			value = value * value1;
		}
		return value;
	}
}
