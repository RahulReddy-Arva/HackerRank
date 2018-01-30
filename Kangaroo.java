import java.util.*;


public class Kangaroo {

private static Scanner in;

static String kangaroo(int x1, int v1, int x2, int v2) {
	String yes = "YES";
	String no = "NO";
	if(x1==x2 && v1==v2) {
		return yes;
	}
	if (x1> x2 && v1>=v2) {
		return no;
	}
	if(x2>x1 && v2>=v1) {
		return no;
	}
	while(true) {
	if( x2>x1 && v1>v2 ) {
		x2+=v2;
		x1+=v1;
		if(x1==x2) {
			return yes;
		}
		else if(x1>x2) {
			return no;
		}
	}
	if( x1>x2 && v2>v1) {
		x2+=v2;
		x1+=v1;
		if(x1==x2) {
			return yes;
		}
		else if(x2>x1) {
			return no;
		}		
	}
	}
}

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
