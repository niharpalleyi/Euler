/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/


//Ans:104743
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		int n = 10001,c=0;
        for(int i=2;i<=100000000;i++)
        {
            int mark=0;
            if(i<10)
            {
                if(i==2 || i==3 || i==5 || i==7)
                {
                    c=c+1;
                }
            }
            else
            {
                for(int j=i/4;j>1;j--)
                {
                    if(i%j==0)
                        {
                            mark=0;
                            break;
                        }
                    else
                        mark=1;
                }
                if(mark==1)
                    c=c+1;
             }
            if(c==n)
            {
                System.out.println(i);
                break;
            }
        }
	}   
}
