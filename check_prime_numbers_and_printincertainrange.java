package playing_with_numbers;

public class check_prime_numbers_and_printincertainrange 
{
    public static void main(String[] args) 
    {
        
    }
    static boolean isprime(int n)
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