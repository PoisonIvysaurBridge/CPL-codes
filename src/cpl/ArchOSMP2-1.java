/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell Inspiron 15
 */
package HasNext;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArchOSMP2 
{
    public static void main(String[] args) 
    {
        ArchOSMP2 a = new ArchOSMP2();
        Scanner sc = new Scanner(System.in);
        
        int i, signbit, E = 0, mantissaLength, Eprime = 0, hex;
        float exponent, usrData, product, fraction, test, f, nexponent, decimal;
        String binary = "", strFraction = "", mantissa, temp = "", tempbinary = "", newf = "";
        
        try
        {
            System.out.print("Enter decimal number: ");
            usrData = sc.nextFloat();

            System.out.print("Enter exponent: ");
            nexponent = sc.nextFloat();

            exponent = (float) Math.pow(10, nexponent);
            product = usrData * exponent;
            
            //Sign bit
            if (usrData < 0)
            {
                product = product * -1;
                signbit = 1;
            }
            else
            {
                signbit = 0;
            }
            
            if (Float.isInfinite(product))
            {
                switch (signbit)
                {
                    case 1: System.out.println("-Infinity"); break;
                    case 0: System.out.println("Infinity"); break;
                }
            }
            else if (Float.isNaN(product))
            {
                System.out.println("NaN");
            }
            else
            {
                fraction = product % 1;
                decimal = (product - fraction);

                //Converting fractional part to binary
                while (fraction > 0 && !strFraction.equals("Infinity"))
                {
                    test = fraction * 2;

                    if (test >= 1)
                    {
                        strFraction += "1";
                        fraction = test - 1;
                    }
                    else
                    {
                        strFraction += "0";
                        fraction = test;
                    }
                }
                
                mantissa = strFraction.substring(0, strFraction.length());

                //Converting decimal to binary
                f = decimal;

                while (f >= 1)
                {
                    newf = (int) (f % 2) + newf;
                    f = f / 2;
                }

                if (newf != "" && newf.charAt(0) == '0')
                {
                    newf = "1" + newf;
                }

                binary = newf + "." + mantissa;

                i = 0;

                //removing point
                for (i = 0; i < binary.length(); i ++)
                {
                    if (binary.charAt(i) != '.')
                    {
                        temp += binary.charAt(i);
                    }
                }

                //Repositioning point
                i = 0;

                while (i < temp.length() && temp.charAt(i) != '1')
                {
                    i ++;
                }

                if (i == temp.length())
                {
                    temp = "00000000000000000000000";
                }
                else
                {
                    temp = temp.substring(0, i + 1) + "." + temp.substring(i + 1);
                    //Calculating for E
                    if (i + 1 < binary.indexOf("."))
                    {
                        E += binary.indexOf(".") - 1;
                    }
                    else if (i + 1 > binary.indexOf("."))
                    {
                        E -= i + 1;
                    }
                }

                Eprime = E + 127;

                //Converting E to binary
                String strE = Integer.toBinaryString(Eprime);

                while (strE.length() < 8)
                {
                    strE = "0" + strE;
                }

                //Updating mantissa
                mantissa = temp.substring(temp.indexOf(".") + 1, temp.length());

                if (mantissa.length() > 24)
                {
                    mantissa = mantissa.substring(mantissa.indexOf(".") + 1, 23);
                }
                
                mantissaLength = mantissa.length();

                for (i = 0; i < 23 - mantissaLength; i ++)
                {
                    mantissa += "0";
                }
                
                if (Eprime <= 0 && mantissa.equals("00000000000000000000000") || usrData == 0)
                    System.out.println("0.0 (Zero)");
                else if (Eprime <= 0 && !mantissa.equals("00000000000000000000000"))
                    System.out.println("(Denormalized)");
                else
                {
                    System.out.print(signbit + " | ");
                    System.out.print(strE + " | ");
                    System.out.println(mantissa);
                
                    binary = signbit + strE + mantissa;
                    hex = Integer.parseUnsignedInt(binary, 2);
                    System.out.println("Hexadecimal: " + Integer.toHexString(hex));
                }
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("NaN");
        }
        catch (Exception e)
        {
            
        }
    }
}
