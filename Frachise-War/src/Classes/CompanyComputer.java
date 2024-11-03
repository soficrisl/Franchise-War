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
public class CompanyComputer extends Thread{
    private int Companyid; 
    private int lastid; 
    private AIProcessor processor; 
    private Administrator admin; 
    private Queue qp1;
    private Queue qp2;
    private Queue qp3;  
    private Queue backing; 

    public CompanyComputer(int Companyid) {
        this.qp1 = new Queue(30); 
        this.qp2= new Queue(30); 
        this.qp3 = new Queue(30); 
        this.backing = new Queue(30); 
        this.Companyid = Companyid; 
        this.processor = new AIProcessor(); 
        initializequeues();
    }

    public void initializequeues(){
        
    }
    
    public int getLastid() {
        return lastid;
    }

    public void setLastid(int lastid) {
        this.lastid = lastid;
    }

    public AIProcessor getProcessor() {
        return processor;
    }

    public Administrator getAdmin() {
        return admin;
    }
    
    
    @Override
    public void run () {
        
    }
    public Queue getQp1() {
        return qp1;
    }

    public void setQp1(Queue qp1) {
        this.qp1 = qp1;
    }

    public Queue getQp2() {
        return qp2;
    }

    public void setQp2(Queue qp2) {
        this.qp2 = qp2;
    }

    public Queue getQp3() {
        return qp3;
    }

    public void setQp3(Queue qp3) {
        this.qp3 = qp3;
    }

    public Queue getBacking() {
        return backing;
    }

    public void setBacking(Queue backing) {
        this.backing = backing;
    }
    
}
