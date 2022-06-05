
package codechef_probs;

import java.util.*;

public class recent_contest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            String a[] = new String[n];
            for (int i = 0; i < a.length; i++) 
            {
                a[i] = sc.next();
            }
            int count1=0 , count2=0;
            for (int i = 0; i < a.length; i++) 
            {
                if(a[i].equals("START38"))
                {
                    count1++;
                }
                else
                {
                    count2++;
                }
            }
            System.out.println(count1+" "+count2);
        }
    }
    
}