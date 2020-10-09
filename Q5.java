/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
//Ans:232792560

import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		int j=2,n=20;
		for(int i=3;i<=n;i++)
    	{
        	int lcm=(i>j)?i:j;
        	while(true)
        	{
            	if(lcm%i==0 && lcm%j==0)
            	{
                	j=lcm;
                	break;
            	}
            	lcm++;
        	}
    	}
    	System.out.println(j);
	}
}
