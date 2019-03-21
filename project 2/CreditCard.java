
//***************************************************
// CreditCard.java 
// Check if the number is a valid Credit Card Number
// Written by Meng Bai
//***************************************************


public class CreditCard {

    private String card; // The card number is stored as a string
    private boolean valid; // Boolean indicating valid or not
	private int errorCode;//An integer which initialized at 0 and takes value from 1 to 6
	
    public CreditCard(String n){
        card = n;
        valid = true;
    }
	
    // This method checks to see if the number is valid or not

    //The first digit must be a 4
    private void check1(){
        int firstdigit = Integer.parseInt(card.substring(0,1));
        if (!(firstdigit== 4))
        {
            valid=false;
            errorCode = 1;
        }
    }
    
    //The fourth digit must be one greater than the fifth digit
    private void check2(){
        int fourthdigit = Integer.parseInt(card.substring(3,4));
        int fifthdigit = Integer.parseInt(card.substring(4,5));
        
        if (!(fourthdigit == fifthdigit + 1))
        {
            valid=false;
            errorCode = 2;
        }
    }
    
    //The product of the first, fifth, and ninth digits must be 24
    private void check3(){
        int firstdigit = Integer.parseInt(card.substring(0,1));
        int fifthdigit = Integer.parseInt(card.substring(4,5));
        int ninthdigit = Integer.parseInt(card.substring(8,9));
        if (!(firstdigit*fifthdigit*ninthdigit == 24))
        { 
            valid=false;
            errorCode = 3;
        }

    }
    
    //The sum of all digits must be evenly divisible by 4
    private void check4(){
        int firstdigit = Integer.parseInt(card.substring(0,1));
        int seconddigit = Integer.parseInt(card.substring(1,2));
        int thirddigit = Integer.parseInt(card.substring(2,3));
        int fourthdigit = Integer.parseInt(card.substring(3,4));
        int fifthdigit = Integer.parseInt(card.substring(4,5));
        int sixthdigit = Integer.parseInt(card.substring(5,6));
        int seventhdigit = Integer.parseInt(card.substring(6,7));
        int eighthdigit = Integer.parseInt(card.substring(7,8));
        int ninthdigit = Integer.parseInt(card.substring(8,9));
        int tenthdigit = Integer.parseInt(card.substring(9,10));
        int eleventhdigit = Integer.parseInt(card.substring(10,11));
        int twelvethdigit = Integer.parseInt(card.substring(11,12));
        int sum;
        sum = firstdigit + seconddigit + thirddigit + fourthdigit + fifthdigit + sixthdigit + seventhdigit 
+eighthdigit + ninthdigit + tenthdigit +eleventhdigit+twelvethdigit; 
        if (!(sum%4 ==0))
        {
        valid=false;
        errorCode = 4;
        }
    }
    
    //The sum of the first four digits must be one less than the sum of the last four digits
    private void check5(){
        int firstdigit = Integer.parseInt(card.substring(0,1));
        int seconddigit = Integer.parseInt(card.substring(1,2));
        int thirddigit = Integer.parseInt(card.substring(2,3));
        int fourthdigit = Integer.parseInt(card.substring(3,4));
        int ninthdigit = Integer.parseInt(card.substring(8,9));
        int tenthdigit = Integer.parseInt(card.substring(9,10));
        int eleventhdigit = Integer.parseInt(card.substring(10,11));
        int twelvethdigit = Integer.parseInt(card.substring(11,12));
        
        int sumfirst4;
        sumfirst4 = firstdigit + seconddigit + thirddigit + fourthdigit;
        int sumlast4;
        sumlast4 = ninthdigit + tenthdigit +eleventhdigit+twelvethdigit;
        if (!(sumfirst4+ 1 == sumlast4))
        {
        valid=false;
        errorCode = 5;
        }
    }
    
    //the sum of the first two digits as a two-digit number and the seventh and eight digits as a two digit number must be 100
    private void check6(){
        int first2digit=Integer.parseInt(card.substring(0,2));
        int seven8digit = Integer.parseInt(card.substring(6,8));
        int sum4;
        sum4 = first2digit + seven8digit;
        if (!(sum4 == 100))
        {
        valid=false;
        errorCode = 6;
        }
    }

    //Get error code
    public int getErrorCode(){
        return errorCode;
    }
    
    // this public method calls the six support methods to check
    // to see if the card number is valid
    public void check(){
        check1();
        if (errorCode == 0){
            check2();
            if (errorCode == 0){
                check3();
                if (errorCode == 0){
                check4();
                if (errorCode == 0){
                check5();
                if (errorCode == 0){
                check6();}
                }
                }
            }
        }
    }
    // This is an accessor method for checking valid
    public boolean isValid(){
        return valid;
    }
		
} // end of class

