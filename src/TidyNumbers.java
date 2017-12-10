import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class TidyNumbers {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
    	
    	BigInteger n = in.nextBigInteger();
	    BigInteger tidy = BigInteger.ONE;
	    for(BigInteger j = BigInteger.ONE; j.compareTo(n) == 0; j.add(BigInteger.ONE))
	    {
	    	boolean check = true;
	    	String strN = j.toString();
	    	BigInteger[] number = new BigInteger[strN.length()];
	    	for(int k = 0; k < number.length; k++)
	    	{
	    		number[k] = new BigInteger(strN.substring(k,k+1));
	    	}
	    	
	    	for(int k = 0; k < number.length; k++)
	    	{
	    		for(int l = 0; l < number.length-1; l++)
	    		{
	    			if(number[l].compareTo(number[l+1]) == 1)
	    			{
	    				check = false;
	    				break;
	    			}
	    		}
	    	}
	    	if(check == true)
	    	{
	    		tidy = j;
	    	}
	    }
	    
	    System.out.println("Case #"+i+": "+tidy);
    }
  }
}