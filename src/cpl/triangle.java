package cpl;

import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while (n>0){
            String pos = sc.next();
            int b = sc.nextInt();
            if (pos.equalsIgnoreCase("UR"))
                for (int i = 1, copy=1; i<=b; i++, copy++){
                    for (int j = 1; j<= b; j++){
                        if (j>=copy)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    }
                    System.out.println("");
                }
            else if (pos.equalsIgnoreCase("UL"))
                for (int i = 1, copy=b; i<=b; i++, copy--){
                    for (int j = 1; j<= b; j++){
                        if (j<=copy)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    }
                    System.out.println("");
                }
            else if (pos.equalsIgnoreCase("LL"))
                for (int i = 1, copy=1; i<=b; i++, copy++){
                    for (int j = 1; j<= copy; j++){
                        
                            System.out.print("#");
                        
                    }
                    System.out.println("");
                }
            else if (pos.equalsIgnoreCase("LR"))
                for (int i = 1, copy=b; i<=b; i++, copy--){
                    for (int j = 1; j<= b; j++){
                        if (j>=copy)
                            System.out.print("#");
                        else
                            System.out.print(" ");
                    }
                    System.out.println("");
                }
            n--;
            System.out.println("");
        }
    }
}