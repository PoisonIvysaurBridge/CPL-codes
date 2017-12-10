package cpl;


import java.util.Scanner;

public class Nlogonia {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean cont = true;
    while (cont){
        int K = in.nextInt();
        if (K==0)
            cont=false;
        else{
            int n = in.nextInt();
            int m = in.nextInt();
            while (K>0){
                int x = in.nextInt();
                int y = in.nextInt();
                if (x==n || y==m)
                    System.out.println("divisa");
                else if (x > n && y> m)
                    System.out.println("NE");
                else if (x > n && y < m)
                    System.out.println("SE");
                else if (x < n && y < m)
                    System.out.println("SO");
                else if (x < n && y > m)
                    System.out.println("NO");
                K--;
            }
        }
    }
  }
}
      