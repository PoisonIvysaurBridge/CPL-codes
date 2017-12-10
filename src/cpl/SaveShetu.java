package cpl;


import java.util.Scanner;

public class SaveShetu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int money = 0;
    int t = sc.nextInt();
    sc.nextLine();
    while (t>0){
        String input = sc.nextLine();
        input = input.toLowerCase();
        if (input.equals("report"))
            System.out.println(money);
        else{
            String strK = input.substring(7);
            int k = Integer.parseInt(strK);
            money+=k;
        }
        
        t--;
    }
  }
}