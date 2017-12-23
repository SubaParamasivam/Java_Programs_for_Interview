import java.util.*;
public class DecimalToBinary
{
/**
* <h1>Convert Decimal to Binary!</h1>
* The DecimaltoBinary program implements an application that
* converts the given integer(decimal)into binary and Prints
* the output on the screen.
* <p>
*
* @author  SubaParamasivam
* @version 1.0
* @since   2017-12-23
*/
    public static void main(String[] args) throws IOException
	{
   /**
   * This is the main method which makes use 
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */
		int n,r;
		String tmp="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
		    r=n%2;
		    tmp=r+tmp;
		    n=n/2;
		}
		System.out.println(tmp);
	}
}