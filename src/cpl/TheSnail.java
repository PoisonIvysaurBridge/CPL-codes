package cpl;
import java.util.Scanner;

public class TheSnail {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cont = true;
    while (cont){
        int H = sc.nextInt();
        double U = sc.nextInt();
        int D = sc.nextInt();
        double F = sc.nextInt();
        if (H==0)
            cont = false;
        if (cont){
            int j =0;
            double snail = 0;
            double fat =  U*F*1.0/100;
            while (snail<=H && snail >=0){
                snail += U;
                snail -= D;
                U-=fat;
                j++;
            }
            if (snail>H)
                System.out.println("success on day "+(j-1));
            else
                System.out.println("failure on day "+j);
        }
    }
  }
}
      