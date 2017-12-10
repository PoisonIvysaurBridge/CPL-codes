package cpl;
import java.util.Scanner;

public class Internet{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while (n>0){
            int cx = sc.nextInt();
            int cy= sc.nextInt();
            int r= sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x>=0 && y>=0){
                if (x>cx+r && y > cy+r){
                    System.out.println("safe");
                }
                else
                    System.out.println("unsafe");
            }
            else if (x>=0 && y<=0){
                if (x>cx+r && y <cy-r){
                    System.out.println("safe");
                }
                else
                    System.out.println("unsafe");
            }
            else if (x<=0 && y>=0){
                if (x< cx-r && y > cy+r){
                    System.out.println("safe");
                }
                else
                    System.out.println("unsafe");
            }
            else if (x<=0 && y<=0){
                if (x< cx-r && y <cy-r)
                    System.out.println("safe");
                else
                    System.out.println("unsafe");
            }
            
            n--;
        }
}
}