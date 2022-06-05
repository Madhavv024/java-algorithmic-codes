
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotate_k_elements 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3; //rotate 3 elements from last
        System.out.println(Arrays.toString(rotation(a,k)));
    }
    static int[] rotation(int a[] , int k)
    {
        int n = a.length;
        int[] b = new int[k];
        for (int i = 0; i < k; i++) 
        {
            b[i] = a[i+n-k];  //small array b is created
        }
        //now shifiting        
        for (int i = n-k-1; i >=0 ; i--) 
        {
            a[k+i]=a[i];
        }
        // concat two arrays
        for (int i = 0; i < b.length; i++) 
        {
            a[i] = b[i];
        }
        return a;
    }
    
}