/*
 Program to find the closest possible palindrome to the given number which is less than the input.
 */
import java.util.*;

public class projectEuler4 {

private static Scanner sc;

public static void main(String[] args) {
   sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
        int n=sc.nextInt();
        int prod = 0 , a = 0;
            for(int i = 100 ; i <= 999 ; i++){
                for(int j = 100 ; j <= 999 ; j++){
                    prod = i * j ;
                    int num = prod;
                    int reversenum = 0;
                    while( num != 0 ){
                    reversenum = reversenum * 10 ;
                    reversenum = reversenum + num % 10 ;
                    num = num / 10 ; 
                    }
                    if( prod == reversenum && prod<n)
                    if( prod>a )
                    a = prod ;
                }
            }
            System.out.println(a);
        t--;
        }
    }
}