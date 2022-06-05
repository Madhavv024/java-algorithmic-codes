
package tcs_questions;

public class binary_to_decimal 
{
    public static void main(String[] args) 
    {
        System.out.println(bin_to_dec("10011"));
    }
    static int bin_to_dec(String s)
    {
        long a = Long.parseLong(s);
        int sum = 0;
        int i =0;
        while(a!=0)
        {
            long n = a % 10;
            sum += n * Math.pow(2, i);
            i++;
            a = a / 10;            
        }
        return sum;
    }
    //in-build function --- Integer.toBinaryString
    //in-build bin to decimal--- Integer.parseInt("String",2)
}