package cpl;
import java.util.Scanner;

public class EcoPremium {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (;n>0;n--){
        int f = sc.nextInt();
        double sum = 0;
        while (f > 0){
            int sqM = sc.nextInt();
            int nAnimals = sc.nextInt();
            int degree = sc.nextInt();
            sum+=(sqM*1.0/ nAnimals* degree*nAnimals);
            f--;
        }
        int Sum = (int) sum;
        System.out.println(Sum);
    }
  }
}
      