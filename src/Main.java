import java.util.*;
import java.io.*;
// Bathroom Stalls
public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  
	    for (int i = 1; i <= t; ++i) {
	    	
	      int n = in.nextInt();
	      int k = in.nextInt();
	      
	      String[] stalls = new String[n+2];
	      // initialize the stalls to empty
	      for(int a = 0; a < stalls.length; a++){
	    	  if(a == 0 || a == stalls.length-1)
	    		  stalls[a] = "O";
	    	  else
	    		  stalls[a] = ".";
	      }
	      
	      int y = -1, z = -1;
	      
	      
	      // people occupying the stalls
	      for(int person = 0; person < k; person++)
	      {
	    	  int[] min = new int[n+2];
		      int[] max = new int[n+2];
		      // getting the min values for the stalls initial state
		      for(int j = 0; j < stalls.length; j++){
		    	  
		    	  if(j != 0 && j!= stalls.length-1)
		    	  {
		    		  int sLeft = 0, sRight = 0;
		    		  if(stalls[j].equals("O"))
		    		  {
		    			  min[j] = -1;
		    			  max[j] = -1;
		    			  
		    		  }
		    		  else{
		    			  for(int l = j-1; l > 0; l--){
			    			  if(stalls[l].equals("."))
			    				  sLeft++;
			    			  else
			    				  break;
			    			  
			    		  }
			    		  
			    		  for(int r = j+1; r < stalls.length; r++){
			    			  if(stalls[r].equals("."))
				    				  sRight++;
			    			  else
			    				  break;
			    			  
			    		  }
			    		  min[j] = Math.min(sLeft, sRight);
			    		  max[j] = Math.max(sLeft, sRight);
		    		  }
		    	  }
		    	  else{
		    		  min[j] = -1;
		    		  max[j] = -1;
		    	  }
		      }
		      /*
		      for(int j = 0; j < min.length; j++)
		      {
		    	  System.out.print(min[j]+" ");
		      }
		      System.out.println();
		      for(int j = 0; j < max.length; j++){
		    	  System.out.print(max[j]+" ");
		      }
		      */
	    	  
	    	  int maximal = -1;
	    	  int index = -1;
	    	  // getting the largest min
	    	  for(int j = 0; j < min.length; j++)
	    	  {
	    		  if(min[j] > maximal)
	    		  {
	    			  maximal = min[j];
	    			  index = j;
	    		  }
	    	  }
	    	  
	    	  if(maximal == 0)
	    	  {
	    		  maximal = -1;
	    		  index = -1;
	    		  for(int j = 0; j < max.length; j++)
		    	  {
		    		  if(max[j] > maximal)
		    		  {
		    			  maximal = max[j];
		    			  index = j;
		    		  }
		    	  }
	    	  }
	    	  
	    	  if(index == -1)
	    	  {
	    		  y = 0;
	    		  z = 0;
	    		  break;
	    	  }
	    	  
	    	  stalls[index] = "O";
	    	  z = min[index];
	    	  y = max[index];
	    	  
	    	 // min[index] = -1;
	    	  //max[index] = -1;
	    	  /*
	    	  for(int a = 0; a< stalls.length; a++)
		      {
		    	  System.out.print(stalls[a]+" ");
		      }System.out.println();*/
	      }
	      
	      System.out.println("Case #"+i+": "+y+" "+z);
	     }
	    
	}
}
