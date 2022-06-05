
package strings;

import java.util.*;

public class weight_of_string 
{
    public static void main(String[] args) 
    {
        String s = "ABC";
        System.out.println(weightofeach(s));
    }
    static int weightofeach(String s)
    {
        s = s.toUpperCase();
        //one way
//        HashMap<Character , Integer> hm = new HashMap<>();
//        hm.put('A', 1);
//        hm.put('B', 2);
//        hm.put('C', 3);
//        hm.put('D', 4);
//        hm.put('E', 5);
//        hm.put('F', 6);
//        hm.put('G', 7);
//        hm.put('H', 8);
//        hm.put('I', 9);
//        hm.put('J', 10);
//        hm.put('K', 11);
//        hm.put('L', 12);
//        hm.put('M', 13);
//        hm.put('N', 14);
//        hm.put('O', 15);
//        hm.put('P', 16);
//        hm.put('Q', 17);
//        hm.put('R', 18);
//        hm.put('S', 19);
//        hm.put('T', 20);
//        hm.put('U', 21);
//        hm.put('V', 22);
//        hm.put('W', 23);
//        hm.put('X', 24);
//        hm.put('Y', 25);
//        hm.put('Z', 26);
        //second way
        int sum =0;
        for (int i = 0; i < s.length(); i++) 
        {
            int p = s.charAt(i)-64;
            sum = sum+p;
        }
        return sum;
    }
}