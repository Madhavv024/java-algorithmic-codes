
package codechef_probs;

import java.util.*;

public class problems_in_todo_list 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            int[] a = new int[l];
            for (int i = 0; i < l; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(check(a , n));
        }
    }
    static int check(int a[] , int n)
    {
        int count=0;
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i]>n)
                count++;
        }
        return count;
    }
}