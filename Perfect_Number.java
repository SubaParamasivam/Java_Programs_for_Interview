/**
* <h1>Check Perfect Number</h1>
* The Perfect_Number program implements an application that
* simply checks the given integer number and Prints
* the output on the screen.
*
* @author  SubaParamasivam
* @version 1.0
* @since   2017-10-06
*/
import java.util.*;
public class Perfect_Number
{
   /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */
    public static void main(String args[])throws IOException 
	{
        int i, Number, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\nEnter an Number: ");
		Number = sc.nextInt();
 		  for(i = 1 ; i < Number ; i++)
		   {
			  if(Number % i == 0)  
			  {
				Sum = Sum + i;
			  }
		   }
		  if (Sum == Number) 
		  {
			System.out.println(Number +" is a Perfect Number");
		  }
		  else 
		  {
			System.out.format(Number +" is NOT a Perfect Number");
		  }
    }
}
