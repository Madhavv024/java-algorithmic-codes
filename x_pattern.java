/*0--H   H
  1-- E E
  2--  L
  3-- L L
  4--O   O
*/
package strings;

import java.util.Scanner;

public class x_pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the world");
        String s = sc.nextLine();
        x__pattern(s);
    }
    static void x__pattern(String s)
    {
        int n = s.length();
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(j==i || j==n-1-i)
                {
                    System.out.print(s.charAt(i));
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