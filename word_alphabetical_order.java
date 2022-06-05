
package strings;

import java.util.Arrays;

public class word_alphabetical_order 
{
    public static void main(String[] args) 
    {
        String s = "madhavv kashish devesh himanshu abhivansh saurav";
        
    }
    static void sort(String s)
    {
        String a[] = s.split(" ");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}