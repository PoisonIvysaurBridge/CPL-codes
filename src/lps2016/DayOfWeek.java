package lps2016;

import java.util.ArrayList;
import java.util.Scanner;

public class DayOfWeek 
{
	public static void main(String[] args)
	{
		System.out.println("Enter reference month:");
		Scanner sc = new Scanner(System.in);
		int refMo = sc.nextInt();
		System.out.println("Enter reference day:");
		int refDay = sc.nextInt();
		System.out.println("Enter day of week (0-6):");
		int DOW = sc.nextInt();
		System.out.println("Enter month:");
		int month = sc.nextInt();
		System.out.println("Enter day:");
		int day = sc.nextInt();
		
		
		
		int modRef = refDay % 7;
		
		ArrayList<Integer> lookUpDOW = new ArrayList();
		int temp = DOW;
		for(int i = 0; i < 7; i++)
		{
			lookUpDOW.add(temp % 7);
			temp++;
		}
		
		ArrayList<Integer> lookUpMod = new ArrayList<>();
		temp = modRef;
		for(int i = 0; i < 7; i++)
		{
			lookUpMod.add(temp % 7);
			temp++;
		}
		
	}
}
