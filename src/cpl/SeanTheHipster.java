package cpl;
import java.util.Scanner;

public class SeanTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int gg = 0;
            int ave = n;
            while (n>1){
                gg+= sc.nextInt();
                n--;
            }
            System.out.println(ave*65-(gg));
            t--;
        }
}
}
