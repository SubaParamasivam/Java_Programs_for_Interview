import java.util.*;
/**
* <h1>Repeat the String and count the particular Character</h1>
* The RepeatAndCount program implements an application that
* repeats the string until the given length and prints the number
* of occurence for a particular given alphabet
* as output on the screen.
* <p>
* 
* Sample input : abcd
                 10
				 b
* Sample output: Count of b in a repeated given string is 3
*
* @author  SubaParamasivam
* @version 1.0
* @since   2018-01-09
*/
public class RepeatAndCount
{
    public static void main(String[] args) 
	{
	 /**
     * This is the main method which makes use
     * @param args Unused.
     * @return Nothing.
     *
     */	
		String s;
		int n,len,i=0,ct=0;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		s=sc.next();
		System.out.println("Enter length");
		n=sc.nextInt();
		System.out.println("Enter a character to count");
		c=sc.next().charAt(0);
		len=s.length();
		while(i!=n)
		{
		    for(int j=0;j<len;j++)
		    {
		        if(s.charAt(j)==c)
		        ct++;
		        i++;
		        if(i==n)
		        break;
		    }
		}
		System.out.println("count of "+c+" in a repeated string is "+ ct);
	}
}