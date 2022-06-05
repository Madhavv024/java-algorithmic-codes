
package playing_with_numbers;

public class super_prime 
{
    public static void main(String[] args) {
        System.out.println(check_super(43));
        
    }
    static boolean check_super(int n)
    {
        boolean check = false;
        int sum = 0;
        for (int i = 0; i < n/2; i++) 
        {
            if(isprime(i))
            {
                sum=sum+i;
                if(sum == n)
                {
                    check = true;
                }
            }
        }
        return check;
        
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
