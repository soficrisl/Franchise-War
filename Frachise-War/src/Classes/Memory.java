/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataStructures.Queue;

/**
 *
 * @author Sofia
 */
public final class Memory {
    private Queue qp1 = new Queue(30); 
    private Queue qp2= new Queue(30); 
    private Queue qp3 = new Queue(30); 
    private Queue backing = new Queue(30); 

    public Memory() {
        this.qp1 = new Queue(30); 
        this.qp2= new Queue(30); 
        this.qp3 = new Queue(30); 
        this.backing = new Queue(30); 
    }
    
    
    
}
