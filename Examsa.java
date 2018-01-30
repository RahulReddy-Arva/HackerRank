/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examsa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rahulreddyarva
 */
public class Examsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           //System.out.println("DEmo");
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the number of testcases: ");
           int testcases = sc.nextInt();
           ArrayList<String> al = new ArrayList<>();
          for (int i =0 ; i < testcases ; i++){
                String value = splittedPixels();
                al.add(value);
          }
    
    }

    private static String splittedPixels() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Enter the binary value: ");
        Scanner sc = new Scanner(System.in);
           String binary = sc.next();
           String one = binary.substring(0,8);
           String two = binary.substring(8,16);
           String three = binary.substring(16,24);
           int v1 = Integer.parseInt(one);
           int v2 = Integer.parseInt(two);
           int v3 = Integer.parseInt(three);
           
           
           
           
        return null;    
    }
    
}
