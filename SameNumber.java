import java.util.*;
/**
* <h1>Print number which has first and last digit 
* is same in an array!</h1>
* The SameNumber program implements an application that
* prints numbers from an array which has first and 
* last number has same digit  as 
* the output on the screen.
* <p>
*
*
* @author  SubaParamasivam
* @version 1.0
* @since   2017-11-26
*/
public class SameNumber
 {
   public static void main(String[] args) 
   {
	  int n;
	  String a[];
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  a=new String[n];
	  for(int i=0;i<n;i++)
		{
		    a[i]=sc.next();
		    int m=a[i].length();
		    char c[]=a[i].toCharArray();
		    if(c[0]==c[m-1])
		    System.out.print(a[i]+" ");
		}
    }
}