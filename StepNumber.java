import java.util.*;
/**
* <h1>Check the number is Stepnumber or not!</h1>
* The SteppingNumber program implements an application that
* simply checks the given input as an StepNumber(number 
* which has a digit which is either 1 more or 1 less than
* the previous digit )or not and 
* prints the output on the screen.
* <p>
* 
* Sample input : 1212343
* Sample output: yes
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-05
*/
public class StepNumber
{
   /**
   * This is the main method which makes use
   * @param args Unused.
   * @return Nothing.
   *
   */
    public static void main(String[] args)
	{
		String N,result="yes";
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		N=sc.next();
		n=N.length();
		char a[]=N.toCharArray();
		for(int i=n-1;i>0;i--)
		    if(Math.abs(a[i]-a[i-1])!=1)
		    {
		        result="no";
		        break;
		    }
		    System.out.print(result);
	}
}