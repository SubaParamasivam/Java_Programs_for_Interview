import java.util.*;
/**
* <h1>Toggle_Case!</h1>
* This program implements an application that
* simply changes the alphabet into opposite case
* and Prints the converted alphabet on the screen.
* 
* @author  SubaParamasivam
* @version 1.0
* @since   2017-10-10
*/
public class Toggle_Case 
{
   /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */

    public static void main(String[] args)throws IOException 
    {
	    char c;
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		if(Character.isUpperCase(c))
		System.out.println(Character.toLowerCase(c));
		if(Character.isLowerCase(c))
		System.out.println(Character.toUpperCase(c));

	}
}