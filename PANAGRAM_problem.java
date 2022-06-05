//a string that contains all the alphabest, alphabets can repeat- called as panagram
package strings;

import java.util.HashSet;

public class PANAGRAM_problem 
{
    public static void main(String[] args) 
    {
        String s = "the quick brown fox jumps over the lazy dog";
        System.out.println(panagram(s));
    }
    static boolean panagram(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i)>='a' && s.charAt(i)<='z') 
            {
                hs.add(s.charAt(i));
            }
            
        }
        if (hs.size()==26)
            return true;
        else
            return false;
    }
}