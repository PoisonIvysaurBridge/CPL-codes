package cpl;
import java.util.Scanner;

public class SumOrProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
            int a = sc.nextInt();
            int b = sc.nextInt();
            
        while (a!=0 && b!=0){
            if (a+b > a*b)
                System.out.println("sum");
            else if (a+b < a*b)
                System.out.println("product");
            else if (a==b)
                System.out.println("equal");
            a = sc.nextInt();
            b = sc.nextInt();
        }
            
}
}