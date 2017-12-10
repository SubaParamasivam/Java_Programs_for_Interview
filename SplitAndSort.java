/**
* <h1>Split a string into two parts and sort </h1>
* The SplitAndSort program implements an application that
* splits a given string into two sub parts and sort it 
* then Print the sorted array as output on the screen.
* <p>
*
* @author  SubaParamasivam
* @version 1.0
* @since   2017-12-10
*/
import java.util.*;
public class SplitAndSort
 {
	 /**
   * This is the main method which makes 
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   */
    public static void main(String[] args)throws IOException
 	{
		
		String s, tmp[];
		int n,m;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		n=s.length();
		m=n/2;
		tmp=new String[2];
		tmp[0]=s.substring(0,m);
		tmp[1]=s.substring(m,n);
		Arrays.sort(tmp);
		System.out.print(tmp[0]+"\n"+tmp[1]);
	}
}