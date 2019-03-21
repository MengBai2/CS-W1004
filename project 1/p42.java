//*********************************
//Written by Meng Bai
//Print out Month and Day
//********************************

import java.util.Scanner;

public class p42{

    public static void main(String []args){
// make a scanner called input     
    Scanner input = new Scanner(System.in);     
    System.out.println("Your name please");     
    String name = input.nextLine(); 

// get the year from the user     
    System.out.println("give me a (integral) year,i.e. 2001, "+name);     
    int  y;     
    y = input.nextInt();        
    
// Divide y by 19 and call the remainder a 
    int a;
    a = y%19;

// Divide y by 100 to get a quotient b and a remainder c
    int b;
    int c;
    b = y/100;
    c = y%100;

// Divide b by 4 to get a quotient d and a remainder e
    int d;
    int e;
    d = b/4;
    e = b%4;
    
// Divide 8 * b + 13 by 25 to get a quotient g
    int g;
    g = (8 * b + 13)/25;

// Divide 19 * a + b - d - g + 15 by 30 to get a remainder h
    int h;
    h = (19 * a + b - d - g + 15)%30;

// Divide c by 4 to get a quotient j and a remainder k
    int j;
    int k;
    j = c/4;
    k = c%4;

// Divide a + 11 * h by 319 to get a quotient m
    int m;
    m = (a + 11 * h) /319;
    
// Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r
    int r;
    r = (2 * e + 2 * j - k - h + m + 32)% 7;
    
// Divide h - m + r + 90 by 25 to get a quotient n
    int n;
    n = ( h - m + r + 90) / 25;

// Divide h - m + r + n + 19 by 32 to get a remainder p
    int p;
    p = (h - m + r + n + 19) % 32;
    
// Print the results     
    System.out.println("that is " + n + "/" + p);     
     }
}
