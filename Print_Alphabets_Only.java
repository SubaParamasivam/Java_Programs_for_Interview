/**
* <h1>Print Alphabets only</h1>
* The Print_Letters program implements an application that
* takes an string as input which contains alphabets,
* special characters and numbers also and display output 
* only alphabets in the string.<p>
* 
* @author Suba Paramasivam
* @version 1.0
* @since   2017-10-04 
*/
import java.util.*;
public class Print_Letters
{   
/**
  * This is the main method which uses
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   * isLetter() is a predefined method used to check the letter is alphabet or not
   */
    public static void main(String[] args)throws IOException
    {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
		    if(Character.isLetter(c)||c==' ')
		    System.out.print(c);
	   }
		
     }
}