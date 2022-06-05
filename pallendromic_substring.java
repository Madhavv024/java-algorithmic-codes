
package strings;

import java.util.Scanner;

public class pallendromic_substring 
{
   public static void main(String[] args) 
    {
        String s = "abbabb";
        for (int i = 1; i <=s.length(); i++) {
            pallensubstring(s,i);
            
        }
        
    }
    static void pallensubstring(String s,int a)
    {
        int n = s.length();
//        if(a>n)
        {
//            System.out.println("Cutting cannot be more than number of words");
        }   
//        else
        {
            for (int i = 0; i <= n-a; i++) 
            {
                String v = s.substring(i, i+a);
                if(pallendrome(v))
                {
                    System.out.println(v);
                }
            }
        }
    }
    static boolean pallendrome(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if(s.equals(sb))
            return true;
        else
            return false;
    }
}