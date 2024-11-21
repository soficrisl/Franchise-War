/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataStructures.ListaDoble;
import DataStructures.Queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Sofia
 */
public class AIProcessor extends Thread{
    private ListaDoble winners = new ListaDoble();  
    private long seconds;
    private int doing; // 0- decidiendo 1- anunciando 2- esperando
    private int ciclestilnow; 
    private int starwarswin=0;
    private int Startrekwin=0;
    private int Status=0;
    private int winWars=8;
    private int winTrek=8;
    public AIProcessor(long seconds) { 
        this.seconds = seconds; 
        this.ciclestilnow =0; 
        this.doing = 2; 
    }
  
    @Override
    public void run () {
        while (true) {
            
            setDoing(2); 
            try {
                Memory.getS1().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(AIProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            setDoing(0); 
            System.out.println("AI----------------------------------------------------------------------------");
            System.out.println("----------------CICLE " + ciclestilnow + " -----------------------------------------\n\n");
            ciclestilnow++; 
            Fighter f1 = Memory.getFighters()[0];
            Fighter f2 = Memory.getFighters()[1];
            System.out.println("Fighters are " + f1.getId() + " - " + f1.getCharacter().getName()+ " and " + f2.getId() + " - " + f2.getCharacter().getName());
            double result = Math.random(); 
            double counter1, counter2; 
            f1.setCounter(0);
            f2.setCounter(0);
            Status++;
            winWars=9;
            winTrek=9;
            System.out.println("Deciding result");
            try {
                Thread.sleep(1000*seconds);
            } catch (InterruptedException ex) {
                Logger.getLogger(AIProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Status++;
            if (result <= 0.4) {
                
               
                setDoing(1); 
                System.out.println("There is a Winner");
                counter1 = f1.getAgility()*0.30 + f1.getHabilities()*0.20 + f1.getLife_points()*0.30 + f1.getStreght()*0.20 + Math.random(); // Luck plays a part 
                counter2 = f2.getAgility()*0.30 + f2.getHabilities()*0.20 + f2.getLife_points()*0.30 + f2.getStreght()*0.20 + Math.random(); 
                
                if (counter1 == counter2) {
                    counter1 += Math.random()*0.01;
                    counter2 += Math.random()*0.01;
                }
                
                if (counter1> counter2) {
                    
                    starwarswin ++;
                    winWars=1;
                    winTrek=0;
                    System.out.println("Winner is" + f1.getId() + "-" + f1.getCharacter().getName());
                } else {
                   Startrekwin ++;
                   winWars=0;
                   winTrek=1;
                    System.out.println("Winner is" + f2.getId() + "-" + f2.getCharacter().getName());
                }
               
                winners.insertBegin(f1.getId());
 
            }else if (result > 0.4 && result <= 0.67) {
                System.out.println("There is a tie");
                f1.setPriority(1);
                f2.setPriority(1);
                Memory.addtoqueue(f1, 0);
                Memory.addtoqueue(f2, 1);
                winWars=2;
                winTrek=2;
            } else {
                System.out.println("There is no Winner");
                winWars=2;
                winTrek=2;
                Memory.putBack(0, f1);
                Memory.putBack(1, f2);
            }
            
            
            try {
                Thread.sleep(1000*seconds);
            } catch (InterruptedException ex) {
                Logger.getLogger(AIProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            winWars=8;
            winTrek=8;
            Status=0;
            try {
                Thread.sleep(1000*seconds);
            } catch (InterruptedException ex) {
                Logger.getLogger(AIProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Memory.updateCounters();
            Memory.getS2().release();
             
        }
    }

    public int getDoing() {
        return doing;
    }

    public void setDoing(int state) {
        this.doing = state;
    }

    public int getStarwarswin() {
        return starwarswin;
    }

    public int getStartrekwin() {
        return Startrekwin;
    }

    public int getStatus() {
        return Status;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    public int getWinWars() {
        return winWars;
    }

    public int getWinTrek() {
        return winTrek;
    }
   
    
}
