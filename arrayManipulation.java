import java.util.*;

public class arrayManipulation {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        /* Save interval endpoint's "k" values in array */
        long [] array = new long[N + 1];
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            array[a-1] += k;
            array[b]   -= k;
            for(int i = 0; i<array.length; i++) {
            		System.out.print(array[i] + " ");
            }
            System.out.println("");
        }
        scan.close();
        
        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}
        



/*
 * for(int i=a; i<b ; i++){
	            		list[i] += k;
	            }
	        }
	        for(int i=0 ; i<list.length ; i++){
	        		if(max < list[i]) {
	        			max = list[i];
	        		}	
	        }
	        System.out.println(max);
	        in.close();
	    }
	}

 */