
package strings;

import java.util.*;

public class missing_chars_in_panagram 
{
    public static void main(String[] args) 
    {
        String s = "the quick bro fox jumps over the lazy dog";
        missing_chars(s);
    }
    static void missing_chars(String s)
    {
        
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i)>='a' && s.charAt(i)<='z') 
            {
                hs.add(s.charAt(i));
            }            
        }
        for (char i = 'a'; i <= 'z'; i++) 
        {
            if(!hs.contains(i))
            {
                System.out.println(i);        
            }
        }
    }
}