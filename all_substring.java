
package strings;

import java.util.Scanner;

public class all_substring 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the word");
        String s = sc.nextLine();
//        System.out.println("Enter the number");
        int k = sc.nextInt();
        allsubstring(s,k);
    }
    static void allsubstring(String s,int a)
    {
        int n = s.length();
        if(a>n)
        {
            System.out.println("Cutting cannot be more than number of words");
        }   
        else
        {
            for (int i = 0; i <= n-a; i++) 
            {
                String v = s.substring(i, i+a);
                System.out.println(v);
            }
        }
    }
}