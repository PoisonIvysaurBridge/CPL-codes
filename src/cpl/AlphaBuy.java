package cpl;

import java.util.*;

public class AlphaBuy{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t>0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int min = Math.min(m,n);
            int [] r = new int [m];
            int [] e = new int [m];
            int [] p = new int [m]; 
            for (int i = 0; i< m; i++){
                r [i] = sc.nextInt();
                e [i] = sc.nextInt();
                p [i]= r[i]-e[i];
            }
            //Arrays.sort(p);
            int max = p[0];
            //int maxSub = -1;
            int [] former = new int [min];
            int j = 0,i;
            while (min > 0){
                for (i = 0; i< p.length; i++){
                    if (p[i]>=max ){
                        max = p[i];
                        former [j]= i;
                    }
                }
                j++;//maxSub = i;
                //p[i]=0;
                min--;
                for (i = 0; i< p.length; i++){
                    if (p[i]==max)
                        p[i]=0;
                }
                max = p[0];
            }
            for (i = 0; i< former.length; i++)
                System.out.print(former[i]+1+" ");
            System.out.println("");
            t--;
        }
}
}