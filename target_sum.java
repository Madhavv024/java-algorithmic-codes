//logic -  put elements in hashset and check if target-a[i] is present in hashset or not
//also check that second number is not repeating
package arrays;

import java.util.*;

public class target_sum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] a ={1,2,3,4,7,6,5};
        System.out.println("ENTER THE TARGET SUM");
        int target = sc.nextInt();
        System.out.println(check(a, target));
    }
    
    static boolean check(int a[],int n)
    {
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        boolean b=false;
        for (int i = 0; i < a.length; i++) 
        {
            if(hs.contains(n-a[i]) && a[i]!=n-a[i])
            {
                b= true;
                break;
            } 
            
        }
        return b;
    }
}
