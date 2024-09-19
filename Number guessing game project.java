import java.util.Scanner;
import java.util.Random;
class Numberguessinggameproject {
    public static void main(String[] args) {

    int attempts = 0;
    int maxattempts = 10;
    int guess;
    int randnum = 0;
    Random randomnum = new Random();
    Scanner input = new Scanner (System.in);

    // For Difficulty level

    System.out.println("Select difficulty level:");
    System.out.println("Press 1 for Easy");
    System.out.println("Press 2 for Medium");
    System.out.println("Press 3 for Hard");
    int difficulty = input.nextInt();
    
    // yahan pr difficulty level introduce karaya hai isi liye switch statement ka istemmal kiya hai Q ke user ke pass 3 option shai un mein se koi sa bhi select krskta hai aur phir hr case mein same do while loop copy krdia

    switch ( difficulty ) {
      case 1:
        randnum = randomnum.nextInt(51);
        do {
          System.out.println("Guess a number between 1 and 50:");
          guess = input.nextInt();
  
          if (guess < randnum) {
             System.out.println("Try Higher"); 
          }
  
          else if (guess > randnum) {
              System.out.println("Try Lower");
          }
  
          else {
              System.out.println("Congrats you guessed it right");
          }
  
          // ye max attempts ke liye hai ke 5 attempts ke baad game khatam hojaaye
  
          attempts++;
          if (attempts>=maxattempts) {
          System.out.println("Game Over");
          break;
          }
  
        } 
          while (guess != randnum);
          break;

      case 2:
        randnum = randomnum.nextInt(101);
        do {
          System.out.println("Guess a number between 1 and 100:");
          guess = input.nextInt();
  
          if (guess < randnum) {
             System.out.println("Try Higher"); 
          }
  
          else if (guess > randnum) {
              System.out.println("Try Lower");
          }
  
          else {
              System.out.println("Congrats you guessed it right");
          }
  
          // ye max attempts ke liye hai ke 5 attempts ke baad game khatam hojaaye
  
          attempts++;
          if (attempts>=maxattempts) {
          System.out.println("Game Over");
          break;
          }
  
        } 
          while (guess != randnum);
          break;

      case 3:
        randnum = randomnum.nextInt(200);
        do {
          System.out.println("Guess a number between 1 and 200:");
          guess = input.nextInt();
  
          if (guess < randnum) {
             System.out.println("Try Higher"); 
          }
  
          else if (guess > randnum) {
              System.out.println("Try Lower");
          }
  
          else {
              System.out.println("Congrats you guessed it right");
          }
  
          // ye max attempts ke liye hai ke 5 attempts ke baad game khatam hojaaye
  
          attempts++;
          if (attempts>=maxattempts) {
          System.out.println("Game Over");
          break;
          }
  
        } 
          while (guess != randnum);
          break;
    
      default:
        System.out.println("Invalid Choice");
        break;
    }
  }
}
 
        
