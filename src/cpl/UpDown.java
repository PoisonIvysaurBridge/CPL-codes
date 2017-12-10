package cpl;
import java.util.Scanner;

public class UpDown{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while (n>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();
            while (m>0){
                String move = sc.next();
                move = move.toLowerCase();
                if (move.equals("up")&& (y>-1 && y<2))
                    y++;
                else if (move.equals("down")&&(y>-1 && y<2))
                    y--;
                else if (move.equals("left")&&(x>-3 && x<3))
                    x--;
                else if (move.equals("right")&&(x>-3 && x<3))
                    x++;
                m--;
            }
            System.out.println("("+x+","+y+")");
            n--;
        }
}
}