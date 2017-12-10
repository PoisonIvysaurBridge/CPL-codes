package cpl;
import java.util.Scanner;

public class DieGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cont = true;
    while (cont){
        int n = sc.nextInt();
        if (n==0)
            cont = false;
        if (cont){
        int temp = 0, top = 1, north = 2, west = 3;
        while (n>0){
            String command = sc.next();
            if (command.equalsIgnoreCase("north")){
                temp = top;
                top = 7-north;
                north = temp;
            }
            else if (command.equals("south")){
                temp = top;
                top = north;
                north = 7- temp;
            }
            else if (command.equals("east")){
                temp = top;
                top = west;
                west = 7-temp;
            }
            else if (command.equals("west")){
                temp = top;
                top = 7-west;
                west = temp;
            }
            
            n--;
        }
        System.out.println(top);
        }
    }
  }
}
      