/*
finding missing numbers more than 1 in array
*/
package arrays;

import java.util.Arrays;

public class missing_numbers_more_than_1 
{
    public static void main(String[] args) 
    {
        int a[] = {2,4,5,3,7,1,8,11};
        int n = 11;
        missinf_nums(a, n);
        }
    static void missinf_nums(int a[] , int n)
    {
        boolean b[] = new boolean[n+1];

        //now loop in boolean array
        for (int i = 0; i < a.length; i++) 
        {
            int p = a[i];
            b[p] = true;
        }
        //getting missing numbers
        for (int i = 1; i < b.length; i++) 
        {
            if(b[i]==false)
                System.out.println(i);
        }
    }
}