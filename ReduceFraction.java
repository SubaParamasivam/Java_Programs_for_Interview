import java.util.*;
/**
* <h1>Reduce the fraction in lowest form </h1>
* The ReduceFraction program implements an application that
* simply reduce the given fraction into lowest form and
* prints it as output on the screen.
* <p>
* 
* Sample input : 15 25
* Sample output: Lowest form of given fraction is 3/5
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-06
*/
public class ReduceFraction
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */	
    public static void main(String[] args)
    {
		int a,b,tmp,gcd=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter numerator:");
		a=sc.nextInt();
		System.out.println("Enter denominator:");
		b=sc.nextInt();
		tmp=a<b?a:b;
		for(int i=tmp;i>0;i--)
		 if(a%i==0&&b%i==0)
		    {
		        gcd=i;
		        break;
		    }
		    System.out.print("Lowest form of the given fraction is "+a/gcd+"/"+b/gcd);
		}
}