package cpl;
import java.util.Scanner;

public class Hajje {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cont = true;
    int j = 1;
    while (cont){
        String msg = sc.next();
        msg = msg.toLowerCase();
        if (msg.equals("*"))
            cont = false;
        else if (msg.equals("hajj"))
            System.out.println("Case "+j+": Hajj-e-Akbar");
        else if (msg.equals("umrah"))
            System.out.println("Case "+j+": Hajj-e-Asghar");
        j++;
    }
  }
}
   