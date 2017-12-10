package cpl;
import java.util.Scanner;

public class TariffPlan {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int j = 1;
    while (j<=t){
        int n = sc.nextInt();
        int Mile = 0;
        int Juice = 0;
        while (n>0){
            int duration = sc.nextInt();
            
            //Mile
            int costMile = duration/30+1;
            costMile*=10;
            Mile += costMile;
            
            //Juice
            int costJuice = duration/60+1;
            costJuice*=15;
            Juice += costJuice;
            n--;
        }
        int min = Math.min(Mile, Juice);
        if (Mile==Juice)
            System.out.println("Case "+j+": Mile Juice "+min);
        else{
            if (Mile< Juice)
                System.out.println("Case "+j+": Mile "+Mile);
            else
                System.out.println("Case "+j+": Juice "+Juice);
        }
        j++;
    }
  }
}
      