
package tcs_questions;

import java.util.Scanner;

public class num_to_binary {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(dec_to_binary(n));
    }
    static String dec_to_binary(int n)
    {
        String s="";
        int m;
        while(n != 0)
        {
            m = n % 2;
            s = s+m; //if using stringbuffer-- s.append(m)
            n= n / 2;
        }
        s = new StringBuffer(s).reverse().toString();
        return s;
    }
}
