
package arrays;

import java.util.*;

public class remove_duplicates_without_datastructure 
{
    public static void main(String[] args) 
    {
        int[] a = {1,2,2,3,4,5,6,5,6,7,8,9};
        System.out.println(Arrays.toString(duplicates(a)));
    }
    static int[] duplicates(int a[])
    {
        //copy elements in array list
        int c[];
        Arrays.sort(a);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) 
        {
            al.add(a[i]);
        }
        //removing duplicates
        for (int i = 0; i < al.size()-1; i++) 
        {
            if(al.get(i) == al.get(i+1))
            {
                al.remove(i);
                i--;
            }
        }
        c = new int[al.size()];
        for (int i = 0; i < c.length; i++) 
        {
            c[i] = al.get(i);
        }
 
        return c;
    }
}