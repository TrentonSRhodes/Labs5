/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7Problem11;

import java.util.Random;

/**
 *
 * @author trent
 */
public class testDataResults {
    private int[] testScores = new int[10];  

    
    public void testScoresArray(){
        Random rand = new Random(); 
        for (int i = 0; i < 10; i++){
            testScores[i] = rand.nextInt(100);
    }
     
    public void int getTotal(){
            int total = 0;
        for (int i = 0; i < 10; i++){
            total = total + testScores[i];
        }
      return total;   
    } 
    
    public void int getAverage(){
            int total = 0;
        for (int i = 0; i < 10; i++){
            total = total + testScores[i];
        }
        int average = total / 10;
      return average;   
    } 
    
    public void int getLowest(){
            int total = 0;
            int lowest = 1000;
        for (int i = 0; i < 10; i++){
           if lowest >= testScores[i]{
               this.lowest = testScores[i];
           }
                   
        }
      return lowest;   
    } 
    public void int getLowest(){
            int total = 0;
            int highest = 1000;
        for (int i = 0; i < 10; i++){
           if highest >= testScores[i]{
               this.highest = testScores[i];
           }
                   
        }
      return highest;   
    } 
}