
package playing_with_numbers;

public class gold_bach_numbers 
{
    public static void main(String[] args) 
    {
        gold_bach(30);
    }
    static void gold_bach(int n)
    {
        for (int i = 2; i <=n/2; i++) //dont go more than half to remove repetition
        {
            if(isprime(i) && isprime(n-i))
            {
                System.out.println(i + "," +(n-i));
            }
        }
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