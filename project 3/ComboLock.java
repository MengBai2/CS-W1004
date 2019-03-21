//***************************************************
// ComboLock.java 
// Mimic a ComboLock like a gym locker
// Written by Meng Bai
//***************************************************


public class ComboLock {

private int sec1;
private int sec2;
private int sec3;
private int dial;//the position of pointer
private boolean open1 = true;
private boolean open2 = true;
private boolean open3 = true;

    //Construct the three numbers of the locker
    public ComboLock(int secret1, int secret2, int secret3) { 
        sec1 = secret1;
        sec2 = secret2;
        sec3 = secret3;
    } 

    //This method resets the dial so that it points to 0
    public void reset() { 
        dial = 0; 
        open1 = true;
        open2 = true;
        open3 = true;
        }

    //turn the dial by a given number of ticks to the left
    public void turnLeft(int ticks) {
        dial = dial + ticks; 
        if (dial >= 40){
            dial = dial - 40;
        }
        if (dial != sec2)
          {
                open2 = false;
            }
    }

    //turn the dial by a given number of ticks to the right
     public void turnRight(int ticks) {
        dial = dial - ticks;
        if (dial < 0){
            dial = dial + 40;
        }
        if(dial != sec1 ){
            if(dial != sec3){
                open3 = false;    
            }
        }
    }
    //This method attempts to open the lock
    public boolean open() { 
    return (open1 && open2 && open3);
    } 
}
