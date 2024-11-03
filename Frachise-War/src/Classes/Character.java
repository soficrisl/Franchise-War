/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Sofia
 */
public class Character {
    private int id; 
    private int priority; 
    private int company; 
    private int [] qualities; // 0 habilities 1 life points 2 streght 
    private int rounds; 

    public Character(int id, int company, int[] qualities) {
        this.id = id;
        this.company = company;
        this.qualities = qualities;
        this.rounds = 0; 
        this.priority = getInitialPriority(); 
    }
    
    public int getInitialPriority() {
        int i = 0;
        return i; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int[] getQualities() {
        return qualities;
    }

    public void setQualities(int[] qualities) {
        this.qualities = qualities;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds() {
        this.rounds += 1;
    }
            
    
}
