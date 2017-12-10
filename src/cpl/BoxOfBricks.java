package cpl;
import java.util.Scanner;

public class BoxOfBricks {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int j = 1;
    while (n>0){
        int[] heights = new int [n];
        int sumBlocks = 0;
        for (int i = 0; i< heights.length; i++){
            heights[i] = sc.nextInt();
            sumBlocks+=heights[i];
        }
        int ave = sumBlocks/n;
        int moves = 0;
        for (int i = 0; i< heights.length; i++){
            if (heights[i] < ave)
                moves += (ave - heights[i]);
        }
        System.out.println("Set #"+j);
        System.out.println("The minimum number of moves is "+moves+".");
        System.out.println("");
        ++j;
        n = sc.nextInt();
    }
  }
}
      