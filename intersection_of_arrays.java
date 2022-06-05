//make a third array in which only common elements of both arrays are present
package arrays;
//logic- make arraylist of both arrays and use retainall function

import java.util.*;

public class intersection_of_arrays 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,7};
        int b[] = {2,3,5,6,7,8};
        System.out.println(Arrays.toString(intersection(a, b)));
    }
    static int[] intersection(int a[] , int b[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        for (int i = 0; i < a.length; i++) 
        {
            al.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) 
        {
            bl.add(b[i]);
        }
        al.retainAll(bl);//removes the elements which are not present in both arrays
        int c[] = new int[al.size()];
        for (int i = 0; i < c.length; i++) 
        {
            c[i] = al.get(i);
        }
        return c;
    }
}