
package strings;

public class min_char_pallendrome_convert 
{
    public static void main(String[] args) 
    {
        String s = "ABB";
        
    }
    
    static boolean check_pallendrome(String s) //use stringbuffer
    {
        boolean check = false;
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) 
        {
            rev = rev + s.charAt(i);
        }
        
        if(s.equals(rev))
        {
            return check = true;
        }
        else
        {
            return check;
        }   
    }    
}