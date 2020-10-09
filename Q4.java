/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/

//Ans:580085


import java.util.*;
public class Q4 {
	    public static void main(String[] args) {
	        int mark=0;    
	    	for(int i=999;i>=100;i=i-1)
	            {
	                for(int j=999;j>=100;j=j-1)
	                {
	                    int t1=i*j,t2=0,r=0;
	                    while(t1>0)
	                    {
	                        r=t1%10;
	                        t2=t2*10+r;
	                        t1=t1/10;
	                    }
	                    t1=i*j;
	                    if(t1==t2)
	                    {
	                        System.out.println(t1);
	                        mark=1;
	                        break;
	                    }
	                    else
	                        mark=0;
	                }
	                if(mark==1)
	                    break;
	            }
	     }
}
