/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
//Ans.6857


import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		long n=600851475143L,l=0l;
				//long n=21L;
				boolean r=false;
		for(long i=2;i*i<n;i++)
		{
			int mark=0;
			if(n%i==0)
			{
				r=isprime(i);
				if(r)
				{
					if(i>l)
					l=i;
				}
			}
		}
		System.out.println(l);
    }
	static boolean isprime(Long n)
	{
		int mark=1;
		for(long j=2L;j*j<n;j=j+1)
		{
			if(n%j==0)
			{
				mark=1;
				break;
			}
			else
				mark=0;
			
		}
		if(mark==0)
			return true;
		else
			return false;
	}
}
