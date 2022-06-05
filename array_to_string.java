
package codechef_probs;

import java.util.*;

public class array_to_string 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(pallendrome(s));
        
    }
    static int pallendrome(String s)
	{
	    if(new StringBuffer(s).reverse().toString().equals(s))
	    {
	        return 1;
	    }
	    else
	    {
	        return 0;
	    }
	}
}
