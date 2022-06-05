
package strings;

import java.util.*;

/**
 *
 * @author hp
 */
public class numb_keypad 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string in lower case");
        String a = sc.nextLine();
        convert(a);
        
    }
    
    static void convert(String a)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('a', 1);
        hm.put('b', 1);
        hm.put('c', 1);
        
        hm.put('d', 2);
        hm.put('e', 2);
        hm.put('f', 2);
        
        hm.put('g', 3);
        hm.put('h', 3);
        hm.put('i', 3);
        
        hm.put('j', 4);
        hm.put('k', 4);
        hm.put('l', 4);
        
        hm.put('m', 5);
        hm.put('n', 5);
        hm.put('o', 5);
        
        hm.put('p', 6);
        hm.put('q', 6);
        hm.put('r', 6);
        
        hm.put('s', 7);
        hm.put('t', 7);
        hm.put('u', 7);
        
        hm.put('v', 8);
        hm.put('w', 8);
        hm.put('x', 8);
        hm.put('y', 9);
        hm.put('z', 9);
        hm.put(' ', 0);
        for (int i = 0; i < a.length(); i++) 
        {
            int v = hm.get(a.charAt(i));
            System.out.print(v);
        }
        
    }
    
}
