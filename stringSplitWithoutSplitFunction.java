import java.io.*;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
class stringSplitWithoutSplitFunction
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		ArrayList<String> arraylist = new ArrayList<String>();
		String data = "";
		if(str.length() == 0) {
			System.out.println("Empty String");
		}
		for(int i=0 ; i< str.length() ; i++) {
			if(str.charAt(i) != '*') {	// Splits at *. Change it if you want to change at any other character.
				data += str.charAt(i);
			}
			else {
				arraylist.add(data);
				data = "";
			}
		}
		if(data.length() >0) {
			arraylist.add(data);
		}
		System.out.println(arraylist);
	}
}