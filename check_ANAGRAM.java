//ANAGRAM strigs have same length and same characters
package strings;

import java.util.Arrays;

public class check_ANAGRAM 
{
    public static void main(String[] args) 
    {  
        String a = "abc";
        String b = "cab";
        System.out.println(check_anagram(a, b));
    }
    static boolean check_anagram(String a , String b)
    {
        char c[] = a.toCharArray();
        char d[] = b.toCharArray();
        if(a.length()!= b.length())
            return false;
        else
        {
            Arrays.sort(c);
            Arrays.sort(d);
            return Arrays.equals(c, d); //tells if elements are same in array or not
        }
    }
}