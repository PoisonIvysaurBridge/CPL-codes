package cpl;

import java.util.Scanner;

public class BoxArt{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while(cont){
            int n = sc.nextInt();
            if (n==0)
                break; 
            int col = 2 + n*2 + n + 1 ;
            int row = 2 + n*2;
            int ctr = 2 + n*2 +1;
            int btm1 = 2, btm2 = 2+2*n+1;
            for (int i = 1; i<= row; i++){
                for(int j = 1; j<=col; j++){
                    if((i==1 || i==n+2) && (j==1 || j==2+2*n))
                        System.out.print("+");
                    else if((i==1 || i==n+2) && (j>1 && j<2+2*n))
                        System.out.print("-");
                    else if(i<n+2 && (j==1 || j==2+2*n) || i>= 2+n && j==col)
                        System.out.print("|");
                    else if(i>1 && i<2+n && j==ctr || i>2+n && (j==btm1 || j==btm2))
                        System.out.print("\\");
                    else if(i==row && j>btm1 && j<btm2)
                        System.out.print("_");
                    else
                        System.out.print(" ");
                }
                if(i>1 && i<n+2)
                    ctr++;
                else if(i>2+n){
                    btm1++;
                    btm2++;
                }
                    
                System.out.println("");
            }
        }
    }
}