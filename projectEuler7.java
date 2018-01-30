import java.util.*;

public class projectEuler7 {

    private static Scanner in;
	public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        int[] primes = calculateNPrimes(10000);
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(primes[n-1]);
        }
    }
    public static int[] calculateNPrimes(int n) {
        int tenThousandPrime = 104729;
        int[] primeNumber = new int[tenThousandPrime];
        int[] nPrimeNumbers = new int[n];
        int nPrimeCount = 0;
        for (int i = 2; i <= tenThousandPrime; i++) {
            if (primeNumber[i -1] == 1) {
                continue;
            } else {
                nPrimeNumbers[nPrimeCount] = i;
                nPrimeCount++;
                int index = 2*i;
                while (index < tenThousandPrime) {
                    primeNumber[index -1] = 1;
                    index += i;
                }
            }
        }
        return nPrimeNumbers;
    }
}
