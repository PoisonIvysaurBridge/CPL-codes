package cpl;
import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean honest = false;
    boolean cont = true;
    int prevGuess = 1;
    while (cont){
        prevGuess = sc.nextInt();
        sc.nextLine();
        if (prevGuess==0)
            cont = false;
        if (cont){
            String prevResponse = sc.nextLine();
            prevResponse = prevResponse.toLowerCase();

            while (!prevResponse.equalsIgnoreCase("right on")){
                int guess = sc.nextInt();
                sc.nextLine();
                String response = sc.nextLine();
                response = response.toLowerCase();
                if (prevResponse.equals("too low")){
                    if (prevGuess >= 10)
                        honest = false;
                    else if (response.equals("too high") && (guess==prevGuess+1 || guess <= prevGuess))
                        honest = false;
                    else if (response.equals("right on") && prevGuess>=guess)
                        honest = false;
                }
                else if (prevResponse.equals("too high")&&response.equals("too low")){
                    if (prevGuess <= 1)
                        honest = false;
                    else if (response.equals("too low")&&(guess==prevGuess-1 || guess >= prevGuess))
                        honest = false;
                    else if (response.equals("right on") && prevGuess<=guess)
                        honest = false;
                }
                
                prevResponse = response;
                prevGuess = guess;
            }
            if (honest)
                System.out.println("Stan may be honest");
            else
                System.out.println("Stan is dishonest");
            honest = true;
        }
    }
  }
}
/*
import java.util.*;  
      
    public class Main {  
      
        public static void main(String[] args) {  
              
            Scanner cin = new Scanner(System.in);  
          
            List guess = new ArrayList();  
           List response = new ArrayList();  
             
           while(cin.hasNext())  
           {  
               String guessNum = cin.nextLine();  
               if(guessNum.equals("0"))  
                   break;  
              String result = cin.nextLine();  
                
              guess.add(guessNum);  
              response.add(result);  
                 
               if(!result.equals("right on"))  
                   continue;  
                 
               else  
               {  
                   int honest = check(guess, response);  
                   if(honest == 1)  
                       System.out.println("Stan may be honest");  
                   else  
                       System.out.println("Stan is dishonest");  
                   guess.clear();  
                   response.clear();  
               }  
           }  
       }  
         
       private static int check(List guess, List response)  
       {  
           int honest = 1;  
             
           int lower = 0;  
           int upper = 11;  
             
           for(int i = 0; i < guess.size(); i++)  
           {  
               int g = Integer.valueOf((String)guess.get(i)).intValue();  
               String r = (String)response.get(i);  
                 
               if(r.equals("too high"))  
               {  
                   if(g <= lower)  
                   {  
                       honest = -1;  
                       break;  
                  }  
                   if(g < upper)  
                   {  
                       upper = g;  
                   }  
                     
               }  
               if(r.equals("too low"))  
               {  
                   if(g >= upper)  
                   {  
                       honest = -2;  
                       break;  
                   }  
                   if(g > lower)  
                   {  
                       lower = g;  
                   }  
               }  
                 
               if(r.equals("right on"))  
               {  
                   if(upper <= g || lower >= g || upper < lower)  
                   {  
                       honest = -3;  
                       break;  
                   }  
               }  
           }  
             
           return honest;  
       }  
     
   } 
*/      