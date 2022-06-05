
package tcs_questions;

public class find_largest_and_smalles_num 
{
    public static void main(String[] args) 
    {
        int n = 108963;
        System.out.println(largest(n));
        System.out.println(smallest(n));
    }
    static int largest(int n)
    {
        int m = 0;
        while(n!=0)
        {
            int num = n % 10;
            if(m<num)
                m = num;
            n = n/10;
        }
        return m;
    }
    static int smallest(int n)
    {
        int m = 9;
        while(n!=0)
        {
            int num = n % 10;
            if(m>num)
                m = num;
            n = n/10;
        }
        return m;
    }
}