
package strings;

public class string_ladder_pattern
{
    
    public static void main(String[] args) 
    {
        String s = "COMPUTER";
        int count=0;
        String space = "";
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        
        
        
        for (int i = 0; i < s.length(); i++) 
        {           
            
            if(count>0 && i>0)
            {
                space+=" ";
                count--;
            }
            System.out.println(space+s.charAt(i));
        }
        
    }
    
}