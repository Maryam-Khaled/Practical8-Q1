/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical8.q1;

/**
 *
 * @author marya
 */
public class PairOfDice {
    private int dice1Num;
    private int dice2Num;
    
    public PairOfDice() {
        roll();
    }
    
    public void roll() {
        dice1Num = (int)(1 + Math.random() * 6);
        dice2Num = (int)(1 + Math.random() * 6);
    }
    
    public int getFirstDice() {
        return dice1Num;
    }
    
    public int getSecondDice() {
        return dice2Num;
    }
    
    public int getTotal() {
        return dice1Num + dice2Num;
    }
}
