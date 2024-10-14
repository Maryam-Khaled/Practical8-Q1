/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical8.q1;

/**
 *
 * @author marya
 */
public class Practical8Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Problem 1: 
//Design a class PairOfDice with two instance variables to represent the numbers 
//showing on each dice. Note that all your instance variables should be private. 
//1. Implement a method roll that sets the value of each dice to a random number between 1 and 6. 
//2. Implement a constructor that rolls the dice, so that they initially show some random values. 
//3. Implement a method getFirstDice that returns the number showing on the first dice. 
//4. Implement a method getSecondDice that returns the number showing on the second dice. 
//5. Implement a method getTotal that returns the total showing on both the dices. 
//6. Test your main method that rolls a pair of dice until the dice come up with snake
//eyes (with a total value of 2), the method should count and reports the number of rolls.

          PairOfDice dice = new PairOfDice();
          
          
          int count = 0;
          while (dice.getTotal() !=2) {
              dice.roll();
              System.out.println("Number of first dice: " + dice.getFirstDice());
              System.out.println("Number of second dice: " + dice.getSecondDice());
              if (dice.getTotal() !=2) {
                  System.out.println("Not snake eyes");
              }
              else if (dice.getTotal()==2)
                  System.out.println("snake eyes");
              System.out.println();
              count++;
             
          }
          
          System.out.println("Number of first dice: " + dice.getFirstDice());
          System.out.println("Number of second dice: " + dice.getSecondDice());
          System.out.println("Number of rolls: " + count);
          
    }
    
}
