
package codechef_probs;

import java.util.Scanner;

public class dploy_may222d 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
                    int m = 0;
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for (int i =0; i<n ;i++ )
		    {
		        a[i] = sc.nextInt();
		        
		    }
		    for (int i =0; i<n ;i++ )
		    {
		        if(a[i]>m)
		        {
                            m = i;		            
		        }
		    }
		    System.out.println(m);
		}
    }
}
