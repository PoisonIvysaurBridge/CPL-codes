package cpl;
import java.util.Scanner;

public class Zapping {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cont = true;
    while (cont){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<0 || b < 0)
            cont = false;
        else{
            int diff = Math.abs(a-b);
            if (diff < 50)
                System.out.println(diff);
            else
                System.out.println(100-diff);
        }
           
    }
  }
}
      