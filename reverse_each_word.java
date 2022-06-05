
package strings;

import java.util.StringTokenizer;

public class reverse_each_word 
{
    public static void main(String[] args) 
    {
        String s = "Hello how are you";
        reverse(s);
    }
    static void reverse(String s)
    {
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) 
        {
            StringBuffer sb = new StringBuffer(a[i]);
            sb.reverse();
            String m = sb.toString();
            System.out.print(m + " ");
        }
        
    }
}