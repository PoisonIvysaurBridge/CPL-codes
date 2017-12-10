package cpl;
import java.util.*;
import java.awt.Rectangle;
public class PtsInFigRect {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Double>> rectangles = new ArrayList<ArrayList<Double>>();
    ArrayList<Double> coordinates = new ArrayList<Double>();
    ArrayList<Double> temp = new ArrayList<Double>();
    boolean cont = true;
    while (cont){
        String str = sc.next();
        if (str.equals("*"))
            break;
        else{
            for(int i = 0; i<4; i++){
                temp.add(sc.nextDouble());
            }
            coordinates = new ArrayList<Double>(temp);
            rectangles.add(coordinates);
            temp.clear();
        }
    }
    int i = 1;
    while (!sc.nextLine().equals("9999.9 9999.9")){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        for (int j =1; j<=rectangles.size(); j++){
        }
        //System.out.println("Point "+i+" is contained in figure "+j);
        i++;
    }
  }
}
      