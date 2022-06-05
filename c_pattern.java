/*
HELLO
E
L
L
0LLEH
*/


package strings;

import java.util.Scanner;

public class c_pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word!");
        String s = sc.nextLine();
        pattern(s);
        
    }   
    
    static void pattern(String a)
    {
        int n = a.length();
        for (int i = 0; i <= n-1; i++) 
        {
            if(i==0)
                System.out.println(a);
            else if(i>0 && i<n-1)
            {
                System.out.println(a.charAt(i));
            }
            else{
                StringBuffer sb = new StringBuffer(a);                
                sb.reverse();
                System.out.println(sb);
            }
                
        }
        
    }
}