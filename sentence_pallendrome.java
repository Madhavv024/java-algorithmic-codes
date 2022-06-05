
package strings;

import java.util.*;

public class sentence_pallendrome 
{
    public static void main(String[] args) 
    {
        String s = "hello madam java pop malayalam dad world";
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        String ans="";
//        for (int i = 1; i < n; i++) 
//        {
//            String p = st.nextToken();
//            p = generate_pallen(p);
//            ans = ans + p + " ";
//        }
//        System.out.println(ans);
        while(st.hasMoreTokens())
        {
            ans = ans + generate_pallen(st.nextToken()) + " ";
        }
        System.out.println(ans);
    }
    static String generate_pallen(String s)
    {
        if(ispallen(s))
        {
            return s;
        }
        else
        {
            String ans = "";
            for (int i = 1; i <= s.length(); i++) 
            {
                String sub = s.substring(0,i);
                sub = new StringBuffer(sub).reverse().toString();
                if(ispallen(s+sub))
                {
                    ans = s+sub;
                    break;
                }
            }
            return ans;
        }
    }
    static boolean ispallen(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}