/*
finding one number missing in array
*/
package arrays;

import java.util.Arrays;

public class one_missing 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,5};
        System.out.println("Missing number is: "+missing(a));
    }
    static int missing(int a[])
    {
        int n = a.length, sum=0;
        int total_sum = (n+2)*(n+1)/2;  // we will take n+1 numbers to find the total sum
        for (int i = 0; i < n; i++) {
            sum+=a[i];
        }
        return total_sum-sum;
    }
}