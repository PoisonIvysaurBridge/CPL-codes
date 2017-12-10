package cpl;
import java.util.Scanner;

public class MrBeanPackingHoliday {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int j = 1;
    while (j<=t){
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        if (l<=20 && w<=20 && h<=20)
            System.out.println("Case "+j+": good");
        else
            System.out.println("Case "+j+": bad");
        j++;
    }
  }
}