package lps2016;

import java.util.*;

public class Pyramids 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base:");
		int b = sc.nextInt();
		System.out.println("Enter count:");
		int ctr = sc.nextInt();
		
		
		boolean isOne = false;
		if(b == 1)
		{
			System.out.println("*");
			isOne = true;
		}
		
		if(!isOne)
		{
			int cols = b * ctr;
			int rows = b;
			ArrayList<Integer> vertices = new ArrayList<>();
			int limit = b;
			for(int i = 0; i < cols; i++)
			{
				if (limit == b)
				{
					limit = 0;
				}
				if (limit == b/2+1)
				{
					vertices.add(i);
				}
				
				limit++;
			}
		/*	for(int k = 0; k<vertices.size(); k++){
				System.out.println(vertices.get(k));
			}
		*/	
			int[][] bounds = new int[ctr][2];
			for(int z = 0; z < ctr; z++)
			{
				bounds[z][0] = vertices.get(z);
				bounds[z][1] = vertices.get(z);
			}
			
			for(int i = 1; i <= rows; i++)
			{
				for(int j = 1; j <= cols; j++)
				{
					for(int z = 0; z < bounds.length; z++)
					{
						while(j >= bounds[z][0] && j <= bounds[z][1] && i%2!=0)
						{
							System.out.print("*");
							j++;
						}
					}
					System.out.print(" ");
				}
				System.out.println();
				if (i%2!=0)
				{
					
					for(int z = 0; z < ctr; z++)
					{
						bounds[z][0]--;
						bounds[z][1]++;
					}
				}
				
			}
		}
	}
		
}
