
package arrays;

import java.util.*;

public class sorting_without_inbuild_fxn 
{
    public static void main(String[] args) 
    {
        int[] a = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        System.out.println(Arrays.toString(sort(a)));
    }
    static int[] sort(int[] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            int temp =0;
            for (int j = i+1; j < a.length; j++) 
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}