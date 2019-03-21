//*******************************
//
// Zip code class
//
// This is a template for your zip code class
// You may add methods and instance variables to this
// class but your code must work with the provided test class ZipTest.java
//
//*******************************


public class Zipcode{


    private String zipcode;
    private String barcode = "|";

    public Zipcode(int zip_number){
    zipcode = Integer.toString(zip_number);
    }

    
    public int checkDigit(){
    int digitsum = 0;
    int firstdigit = Integer.parseInt(zipcode.substring(0,1));
    int seconddigit = Integer.parseInt(zipcode.substring(1,2));
    int thirddigit = Integer.parseInt(zipcode.substring(2,3));
    int fourthdigit = Integer.parseInt(zipcode.substring(3,4));
    int fifthdigit = Integer.parseInt(zipcode.substring(4,5));
    digitsum = firstdigit + seconddigit + thirddigit + fourthdigit + fifthdigit;
    
    int remainder = 0;
    remainder = digitsum % 10;
            if (remainder != 0){
                remainder = 10 - remainder; 
            }        
    return remainder;
    }
    
        public String digitBarCode(int digit) {
        if (digit == 1) {
          return  ":::||";
        }
        if (digit == 2) {
           return "::|:|";
        }
        if (digit == 3) {
           return "::|||";
        }
        if (digit == 4) {
          return ":|:::";
        }
        if (digit == 5) {
          return ":|:||";
        }
        if (digit == 6) {
          return  ":||::";
        }
        if (digit == 7) {
          return "|::::";
        }
        if (digit == 8) {
          return  "|::||";
        }
        if (digit == 9) {
          return "|:|::";
        }
        else {
           return  "||:::";
        }
    }
    
    //Generate barcode
    


    public String getBarcode(){
        int digit = 0;
        for( int i = 0; i < zipcode.length(); i++){
        digit = Integer.parseInt(zipcode.substring(i,i+1));
        barcode = barcode +  digitBarCode(digit);
        }
        barcode = barcode + digitBarCode(checkDigit()) + "|";
	//leave this method as is
        return barcode;
    }

}