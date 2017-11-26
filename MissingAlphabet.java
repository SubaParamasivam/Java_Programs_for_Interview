import java.io.*;
/**
* <h1>Find Missing Alphabet in Palindrome!</h1>
* The MissingAlphabet program implements an application that
* simply checks the given palindrome string and Prints
* the missed alphabet from the input as 
* output on the screen.
* <p>
*
*
* @author  SubaParamasivam
* @version 1.0
* @since   2017-11-20
*/
public class MissingAlphabet
{
   /**
   * This is the main method which makes use of 
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */
    public static void main(String[] args)throws IOException
	{
	     int i,j;
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         char[] c=s.toCharArray();
		 for(i=0,j=c.length-1;i<c.length/2;i++,j--)
         {
            if(c[i]!=c[j])
            {
               if(c[i]==c[j-1]&&(i!=j-1))
                {
                   System.out.print(c[j]);
                   break;
                }
                else
				{
        			 System.out.print(c[i]);
                     break;
                }
            }
         }
    }
}