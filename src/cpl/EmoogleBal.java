package cpl;
import java.util.Scanner;

public class EmoogleBal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cont = true;
    int j=1;
    while (cont){
        int n = sc.nextInt();
        int zero = 0;
        int event =0;
        if (n==0)
            cont = false;
        else{
            for (int i = 1; i<=n; i++){
                int e = sc.nextInt();
                if (e==0)
                    zero++;
                else if (e>=0)
                    event++;
            }
            System.out.println("Case "+j+": "+(event-zero));
            j++;
        }
    }
  }
}
      