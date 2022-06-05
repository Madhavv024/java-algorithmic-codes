/*
simple method-- arr[10]={6,2,5,5,4,5,6,3,7,6};
int a,b,NoOfSticks=0,sum=0,reminder;
	    take input-- a , b;
	    sum = a+b;
	    while(sum != 0){
	        reminder = sum % 10;
	        sum = sum / 10;
	        NoOfSticks = NoOfSticks + arr[reminder];
	    }
	    print noofsticks;
*/
package codechef_probs;

import java.util.*;

public class playing_with_matches 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(mapping(n, m));;
        }
    }
    static int mapping(int n , int m)
    {
        int z = n+m;
        String s = Integer.toString(z);
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('0', 6);
        hm.put('1', 2);
        hm.put('2', 5);
        hm.put('3', 5);
        hm.put('4', 4);
        hm.put('5', 5);
        hm.put('6', 6);
        hm.put('7', 3);
        hm.put('8', 7);
        hm.put('9', 6);
        int total = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            int val = hm.get(ch);
            total+=val;
        }
        return total;
    }
}