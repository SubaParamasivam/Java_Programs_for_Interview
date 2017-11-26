/**
* <h1>Printing N Integers without for loop</h1>
* The PrintIntegers program implements an application that
* simply get an  integer 'n' and prints the number from 0 to 
* N as the output on the screen.
* @author  Suba Paramasivam
* @since   2017-10-02
*/
import java.util.*;
public class PrintIntegers
{   
   /**
   * This is the recursivefun method performs recursively
   * @param n and i as an integer.
   * @return Nothing.
   */

    public static void recursivefun(int n,int i) 
    {  
	   
      if(i<=n)
		 {
         System.out.println(i); 
         recursivefun(n,i+1);   
		 }
    }
   /**
   * This is the main method which makes use of 
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */

     public static void main(String args[])throws IOException 
    { 
	    int n,i=1;
		System.out.println("Enter an integer");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
        recursivefun(n,i);
	}
}
 