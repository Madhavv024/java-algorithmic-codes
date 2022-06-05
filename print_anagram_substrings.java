
package strings;

import java.util.Arrays;

public class print_anagram_substrings 
{
    public static void main(String[] args) 
    {
        String s = "abcdefbachellocbaworldbca.java";
        String w = "abc";
        anagramsubstring(s, w.length(),w);
    }
    static void anagramsubstring(String s,int k,String w)
    {
        int n=s.length();
        for (int i = 0; i <= n-k; i++) 
            {
                String v = s.substring(i, i+k);
                if(isanagram(v,w))
                    System.out.println(v);
            }
    }
    static boolean isanagram(String s,String a)
    {   
        char b[] = s.toCharArray();
        char c[] = a.toCharArray();
        if(s.length()!= a.length())
            return false;
        else
        {
            Arrays.sort(b);
            Arrays.sort(c);
            return Arrays.equals(b, c);
        }    
    }
}
