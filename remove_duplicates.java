
package arrays;

import java.util.*;

public class remove_duplicates 
{
    public static void main(String[] args) 
    {
        int a[] = {1,1,2,4,2,4,5,2,3,6,2,2,5,8,9};
        System.out.println(Arrays.toString(removeduplicates(a)));        
    }
    static int[] removeduplicates(int a[])
    {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < a.length; i++) 
        {
            ts.add(a[i]);
        }
        int b[] = new int[ts.size()];
        int i =0;
        for (int p : ts) 
        {
            b[i] = p;
            i++;
        }
        return b;
    }
}