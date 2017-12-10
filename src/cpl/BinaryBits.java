package cpl;


import java.util.Scanner;

public class BinaryBits{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BinaryBits B = new BinaryBits();
        int nTest = sc.nextInt();
        while (nTest>0){
            int n = sc.nextInt();
            int binary = B.convertToBinary(n);
            n++;
            boolean cont = true;
            while (cont){
                if (B.howMany1(B.convertToBinary(n))==B.howMany1(binary)){
                    cont=false;
                    System.out.println(n);
                }
                n++;
            }
            nTest--;
        }
}
    public int howMany1(int n){
        int howMany = 0;
        while (n>0){
            if (n%10==1)
                howMany++;
            n/=10;
        }
        return howMany;
    }
    public  int convertToBinary(int n){
//      
        int result = 0;
        int b128 = n/128;
        n%=128;
        int b64 = n/64;
        n%=64;
        int b32 = n/32;
        n%=32;
        int b16 = n/16;
        n%=16;
        int b8 = n/8;
        n%=8;
        int b4 = n/4;
        n%=4;
        int b2 = n/2;
        n%=2;
        result= b128*10000000 + b64*1000000+ b32*100000 + b16*10000 + b8*1000 + b4*100 + b2*10+ n;
        return result;
    }
}