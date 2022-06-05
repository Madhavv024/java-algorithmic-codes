package strings;

import java.util.StringTokenizer;

public class string_short_form {

    public static void main(String[] args) 
    {
        String s = "last in first out";
        shortform(s);
    }
    
    static void shortform(String s)
    {
        String a = s.toUpperCase();
        System.out.println(a); 
        StringTokenizer st = new StringTokenizer(a);
        int n = st.countTokens();
//        System.out.println(st.countTokens());
        for (int i = 1; i <= n; i++) 
        {
            String p = st.nextToken();
            System.out.println(p.charAt(0));
        }
        
    }
}
