import java.util.*;

public class Sherlock {

   
    private static Scanner in;

	static String check(int[] a){
        int sl = 0;
        int sr;
        String yes = "YES";
        String no  = "NO";
        int count = 0;
        int len =  a.length;
        for(int i=0 ; i<len ; i++) {
        	count += a[i];
        }
        for (int i=1; i<len; i++){
            sl += a[i-1];
            sr = count - sl- a[i];
            if(sl==sr)
            	return yes;
        }
        //System.out.print(count);
        //if(count>0)return yes;
        //else return no;
        return no;
         
    }
    
    static String solve(int[] a){
        // Complete this function
        String result;
        result = check(a);
        return result;
         
    } 

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){ 
            int n = in.nextInt(); 
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            } 
            String result = solve(a);
            System.out.println(result);
        } 
    }
}