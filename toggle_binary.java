// 19--->10011--->11001--->dec
package tcs_questions;
import java.util.*;
public class toggle_binary 
{
    public static void main(String[] args) 
    {
        System.out.println(rev_bin(19));
    }
    static int rev_bin(int n)
    {
        String s = Integer.toBinaryString(n);
        String a = new StringBuffer(s).reverse().toString();
        int b = Integer.parseInt(a, 2);
        return b;
    }
}
