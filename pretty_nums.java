// any num having 2,3,9 in its last digit
package codechef_probs;

import java.util.*;

public class pretty_nums 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases!");
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nums(a,b);
        }
    }
    static void nums(int a , int b)
    {
        for (int i = a; i <= b; i++) 
        {
            //check ones place
            if(i%10==2 || i%10==3 || i%10==9) //% beacuse it tell the remainder
            {
                System.out.println(i);
            }
        }
    }
}