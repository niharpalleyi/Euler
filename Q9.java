/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
//Ans:31875000

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=1000,a=0,b=0,c=0,mark=1;
         for(a=n/2;a>=1;a--)
         {
             for(b=n;b>=a;b--)
             {
                 c=n-a-b;
                 if(c*c==(a*a+b*b))
                 {
                     mark=0;
                     break;
                 }
                 else
                 {
                     mark=1;
                 }
             }
             if(mark==0)
                 break;
         }
         if(mark==0)
             System.out.println(a*b*c);
         else
             System.out.println("-1");
     }
}
