
package playing_with_numbers;

public class twin_prime 
{
    public static void main(String[] args) 
    {
        for (int i = 2; i <=100; i++) 
        {
            if(is_prime(i) && is_prime(i+2))
            {
                System.out.println(i+","+(i+2));
            
            }
        }
    }
    static boolean is_prime(int n)
    {
        int flag = 0;
        if(n==1)
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) 
        {
            if(n%i==0)
                flag = 1;
        }
        if(flag == 0) 
            return true;
        else
            return false;            
    }
}