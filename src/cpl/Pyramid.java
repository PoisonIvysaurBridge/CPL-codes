package cpl;


import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nTest = sc.nextInt();
        while (nTest > 0){
            int n = sc.nextInt();
            for (int k = 1, copy1 =n, copy2 = n+1; k<=n; k++, copy1--, copy2++){
                for (int j = 1; j<= n*2; j++){
                    if (j==copy1)
                        System.out.print("/");
                    
                    else if (j==copy2)
                        System.out.print("\\");
                    else if (k==n)
                        System.out.print("_");
                    else
                        System.out.print(" ");
                }
                System.out.println("");
            }
            nTest--;
        }
}
}