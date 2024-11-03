/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frachise.war;

import DataStructures.Queue;

/**
 *
 * @author Sofia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q = new Queue (10); 
        
        
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        
        q.print();
        q.enqueue(10);
        q.dequeue();
        q.print();
        q.enqueue(10);
        q.print();
    }
    
}
