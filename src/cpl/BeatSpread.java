package cpl;
import java.util.Scanner;

public class BeatSpread{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (; n>0; n--){
        int s = sc.nextInt();
        int d = sc.nextInt();
        int larger = (s+d)/2;
        if ((s+d)%2==0 && s-larger>=0){
            System.out.println(larger+" "+(s-larger));
        }
        else
            System.out.println("impossible");
    }
  }
}
      