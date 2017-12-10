package cpl;
import java.util.Scanner;

public class Rectangles{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Perimeter: "+ (2*a+2*b));
            System.out.println("Area: "+(a*b));
            t--;
        }
}
}