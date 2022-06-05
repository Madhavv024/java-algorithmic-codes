/*
0--HELLO
1--   L
2--  L
3-- E
4--HELLO
*/
package strings;

import java.util.*;

public class z_pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        z__pattern(s);
    }
    static void z__pattern(String a)
    {
        int n = a.length();
        for (int i = 0; i <=n-1; i++) 
        {
            if(i==0)
            {
                System.out.println(a);
            }
            else if(i==n-1)
            {
                System.out.println(a);
            }
            else
            {
                for (int j = 0; j <=n-1 ; j++) 
                {
                    if(i+j==n-1)
                    {
                        System.out.print(a.charAt(j));
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }    
}