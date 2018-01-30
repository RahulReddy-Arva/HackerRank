import java.util.*;

public class projectEuler10 {

	void sieveOfEratosthenes(int n)
	{
		boolean prime[] = new boolean[n+1];
		for( int  i = 0 ; i <= n ; i++ )
			prime[i] = true;
		
		for(int p = 2; p*p <=n; p++)
		{
			if(prime[p] == true)
			{
				for(int i = p*2; i <= n; i += p)
					prime[i] = false;
			}
		}
		long sum = 0;
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true)
				sum += i;
		}
		System.out.println(sum);
	}
	
    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            projectEuler10 pe10 = new projectEuler10(); // object for the class
            pe10.sieveOfEratosthenes(n); // using object to invoke the method in class.
        }
    }
	
	
}
