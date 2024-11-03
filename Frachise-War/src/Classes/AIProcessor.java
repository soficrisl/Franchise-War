/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataStructures.Queue;
import java.util.LinkedList; 

/**
 *
 * @author Sofia
 */
public class AIProcessor extends Thread {
    private LinkedList <Character> winners = new LinkedList<Character>();  

    public AIProcessor() {
    }
    
    @Override 
    public void run() { 
        
    }

    public LinkedList<Character> getWinners() {
        return winners;
    }

    public void setWinners(LinkedList<Character> winners) {
        this.winners = winners;
    }
    
    
    
    
    
}
