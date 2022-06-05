
package playing_with_numbers;

public class next_prime 
{
    public static void main(String[] args) {
        next_prime(20);
    }
    static void next_prime(int n)
    {
        for (int i = n+1; ; i++) 
        {
            if(is_prime(i))
            {
                System.out.println(i);
                break;
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