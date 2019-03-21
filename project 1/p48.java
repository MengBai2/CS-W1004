//*********************************
//Written by Meng Bai
//Print out changes
//********************************

import java.util.Scanner;

public class p48{
     public static void main(String []args){
         Scanner input = new Scanner(System.in);
// get the amount due    
         System.out.println("Please enter the amount due in pennies");     
         int ad;     
         ad = input.nextInt();  

// get the amount received in pennies from the customer
         System.out.println("Please enter the amount received");     
         int r;     
         r = input.nextInt();  

// check for difference between ad and r

if (ad - r < 0) 
    System.out.println (“Please enter a new amount received);       
    else       
    {

// get a dollars, b quarters, c dimes, d nickels, and e pennies
         int a;
         int b;
         int c;
         int d;
         int e;
         a = (r-ad) / 100;
         b = ((r- ad) % 100) /25;
         c = (((r-ad) % 100) %25)/10;
         d = ((((r-ad) % 100) %25)%10)/5;
         e = ((((r- ad) % 100) %25)%10)%5;
// print out changes
        System.out.println("The changes are " + a + "dollars" + b + 
"quarters"+ c +"dimes"+ d +"nickels" + e  + "pennies");  
       }   
     }
}
  
