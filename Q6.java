/*The sum of the squares of the first ten natural numbers is, 385
									
The square of the sum of the first ten natural numbers is, 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/


//Ans:25164150
import java.util.*;
public class Q6 {
	public static void main(String[] args)
	{
		int n=100;
		long s1=n*n*(n+1)*(n+1)/4,s2=n*(n+1)*(2*n+1)/6,s=0;
		s=s1-s2;
		System.out.println(s);
	}
}
