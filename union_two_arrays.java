//logic-add all the elements in in linkedhashset(to remove duplicates) and make array
package arrays;

import java.util.*;

public class union_two_arrays 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8,4};
        System.out.println(Arrays.toString(union(a,b)));
    }
    static int[] union(int a[] , int b[])
    {
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) 
        {
            lh.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) 
        {
            lh.add(b[i]);
        }
        int c[] = new int[lh.size()];
        int i =0;
        for (int p : lh) 
        {
            c[i] = p;
            i++;
        }
        return c;
    }
}