/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/

//Ans:142913828922


import java.math.BigInteger;
import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		int n =2000000;
		   boolean prime[]=new boolean[n + 1];  
	        Arrays.fill(prime, true); 
	        for (int p = 2; p * p <= n; p++) { 
	            if (prime[p] == true) { 
	                for (int i = p * 2; i <= n; i += p) 
	                    prime[i] = false; 
	            } 
	        } 
	        
	        long sum = 0; 
	        for (int i = 2; i <= n; i++) 
	            if (prime[i])
	            	sum+=i;
	        System.out.println(sum);
    }

}
