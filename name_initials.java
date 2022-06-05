
package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class name_initials 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String s = sc.nextLine();
        nameshort(s);
    }
    static void nameshort(String s)
    {
        String a = s.toUpperCase();
        StringTokenizer st = new StringTokenizer(a);
        int n = st.countTokens();
        
        for (int i = 1; i < n ; i++) 
        {
            String p = st.nextToken();
            System.out.print(p.charAt(0)+".");
        }
        String[] d = a.split(" ");
        System.out.println(d[d.length-1]);
    }    
}