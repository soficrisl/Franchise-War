/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Sofia
 */
public class Fighter {
    private Character character; 
    private int id; 
    private int counter; 
    private double habilities; 
    private double life_points; 
    private double streght; 
    private double agility; 
    private int priority; 

    

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double getHabilities() {
        return habilities;
    }

    public void setHabilities(double habilities) {
        this.habilities = habilities;
    }

    public double getLife_points() {
        return life_points;
    }

    public void setLife_points(double life_points) {
        this.life_points = life_points;
    }

    public double getStreght() {
        return streght;
    }

    public void setStreght(double streght) {
        this.streght = streght;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Fighter(Character character, int id, double habilities, double life_points, double streght, double agility, int priority) {
        this.character = character;
        this.id = id;
        this.counter = 0;
        this.habilities = habilities; // 1 - 10
        this.life_points = life_points; // 1 - 10
        this.streght = streght; // 1 - 10
        this.agility = agility; // 1 - 10 
        this.priority = priority; // 1 - 10 
    }
    
    
    
}
