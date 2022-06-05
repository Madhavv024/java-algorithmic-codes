
package strings;

public class String_pattern 
{
    public static void main(String[] args) 
    {
        String s = "COMPUTER";
        
        String v = ladderpattern(s);
        
        System.out.println(v);
    }
    
    static String ladderpattern(String s)
    {
        int n = s.length();
        String a = null;
        String b = null;
        for (int i = 0; i < n; i++) 
        {
            char v = s.charAt(i);
            for (int j = 1; j < n-1; j++) 
            {
                a = " ";
            }
            b = a+v;
        }
        return b;
    }
}