/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sofia
 */
public class Administrator extends Thread{
    private int cicle; 
    private int id; 
    

    public Administrator() {
        this.cicle = 0;
        this.id =0; 
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                Memory.getS2().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\n----ADMIN-----------------------------------------");
            if (cicle == 0 && !Memory.isFlag()) {
                System.out.println("Adding all characters to queue");
                // Para Star Wars
                Memory.setFlag();
                for (int i = 0; i < Memory.getCharacter1().length; i++) {
                    Character r = Memory.getCharacter1()[i]; 
                    Fighter m = calculatePriority(r); 
                    Memory.addtoqueue(m, 0);
                }
                // Para Star Trek 
                for (int i = 0; i < Memory.getCharacter2().length; i++) {
                    Character r = Memory.getCharacter2()[i]; 
                    Fighter m = calculatePriority(r); 
                    Memory.addtoqueue(m, 1);
                }
                

            } else  if (cicle ==2) {
                double choice = Math.random(); 
                if (choice <= 0.8) {
                    System.out.println("Creating new Character");
                    int rand = (int)(Math.random()*20); 
                    Character sw = Memory.getCharacter1()[rand]; 
                    System.out.println("New character is" + sw.getName());
                    Fighter fsw = calculatePriority(sw); 
                    Memory.addtoqueue(fsw, 0);
                    rand = (int)(Math.random()*20); 
                    System.out.println("Creating new Character");
                    Character st = Memory.getCharacter2()[rand]; 
                     System.out.println("New character is" + st.getName());
                    Fighter fst = calculatePriority(st); 
                    Memory.addtoqueue(fst, 1);
                }
                cicle = 0; 
            }
            System.out.println("QUEUE PRIORITY 1 SW ---------");
            Memory.getSwqp1().print();
            System.out.println("\n\nQUEUE PRIORITY 2 SW ---------");
            Memory.getSwqp2().print();
            System.out.println("\n\nQUEUE PRIORITY 3 SW ---------");
            Memory.getSwqp3().print();
            System.out.println("\n\nQUEUE BACK  SW ---------");
            Memory.getSwbacking().print();
            System.out.println("\n\n");
            System.out.println("QUEUE PRIORITY 1 ST ---------");
            Memory.getStqp1().print();
            System.out.println("\n\nQUEUE PRIORITY 2 ST ---------");
            Memory.getStqp2().print();
            System.out.println("\n\nQUEUE PRIORITY 3 ST ---------");
            Memory.getStqp3().print();
            System.out.println("\n\nQUEUE BACK  ST ---------");
            Memory.getStbacking().print();
            System.out.println("\n\n");
            chooseFighters(); 
            handleBacking(); 
            cicle++; 
            System.out.println("\n\n");
            Memory.getS1().release();
        }


    }
    
    public Fighter calculatePriority(Character m) {
        int i = m.getCategory(); 
        double [] qualities = new double [4];   // 0 - habilities 1 - lp 2- stregnt  4 - agility 
        switch (i) {
            case 0: 
                qualities[0] = (Math.random() * 2); 
                qualities[1] = (Math.random() * 2); 
                qualities[2] = (Math.random() * 2); 
                qualities[3] = (Math.random() * 2); 
                break; 
            case 1: 
                qualities[0] =  2 + (Math.random() * 2); 
                qualities[1] =  2 + (Math.random() * 2); 
                qualities[2] =  2 + (Math.random() * 2); 
                qualities[3] =  2 + (Math.random() * 2); 
                break; 
            case 3: 
                qualities[0] =  4 + (Math.random() * 2); 
                qualities[1] =  4 + (Math.random() * 2); 
                qualities[2] =  4 +  (Math.random() * 2); 
                qualities[3] =  4 +(Math.random() * 2); 
                break; 
            case 4: 
                qualities[0] =  6 + (Math.random() * 2); 
                qualities[1] =  6+  (Math.random() * 2); 
                qualities[2] =  6 + (Math.random() * 2); 
                qualities[3] =  6 + (Math.random() * 2); 
                break;
            case 5: 
                qualities[0] =  8 + (Math.random() * 2); 
                qualities[1] =  8 + (Math.random() * 2); 
                qualities[2] =  8 + (Math.random() * 2); 
                qualities[3] =  8 + (Math.random() * 2); 
                break;     
            }
            //Max number: 22. 
            //Priorities 
            /*
            0 - 8,8  priority 3 
            8,9 - 15 priority 2 
            17,7 - 22 priority 1 
                */
            int priority = 0; 
            double sum = qualities[0]*0.6 + qualities[1]*0.7 + qualities[2]*0.5 + qualities[3]*0.4; 
            if (sum <= 8.8) {
                priority = 3; 
            } else if (sum >= 8.9 && sum <= 16) {
                priority = 2; 
            } else {
                priority = 1; 
            }
            
            Fighter result = new Fighter(m,id, qualities[0], qualities[1],qualities[2], qualities[3], priority); 
            id++; 
            return result; 
        
    }
    
    public void chooseFighters(){
        Fighter f1 = Memory.bringCharacter(0); 
        Fighter f2 = Memory.bringCharacter(1); 
        System.out.println("Fighters are " + f1.getId() + " - " + f1.getCharacter().getName()+ " and " + f2.getId() + " - " + f2.getCharacter().getName());
        Memory.setFighters(f1, f2);
    }
    
    public void handleBacking(){
        double choice = Math.random(); 
        Fighter[] back = Memory.getBack();
        if (back!= null) {
            Fighter backing1 = back[0];
            Fighter backing2 = back[1];
            backing1.setPriority(1);
            backing2.setPriority(1);
            System.out.println("Handling Backing");
            System.out.println("Fighters are " + backing1.getId() + " - " + backing1.getCharacter().getName()+ " and " + backing2.getId() + " - " + backing2.getCharacter().getName());
            if (choice <= 0.4) {
                System.out.println("Fighters selected to be added to queue 1 ");
                Memory.addtoqueue(backing1, 0);
                Memory.addtoqueue(backing2, 1);
            } else {
                System.out.println("Fighters selected to go back to backing");
                Memory.putBack(0, backing1);
                Memory.putBack(1, backing2);
            }
        }else {
            System.out.println("empty backing");
        }
        
        
    }
    /*
    public void handleQueues(){
        Fighter ch = null; 
        if (Memory.getSwbacking().isEmpty() || Memory.getStbacking().isEmpty()) {
            if (Memory.getSwbacking().isEmpty()) {
                for (int i = 0; i < Memory.getCharacter1().length; i++) {
                    Character r = Memory.getCharacter1()[i]; 
                    Fighter m = calculatePriority(r); 
                    Memory.putBack(0, m);
                }
            } else {
                for (int i = 0; i < Memory.getCharacter2().length; i++) {
                    Character r = Memory.getCharacter2()[i]; 
                    Fighter m = calculatePriority(r); 
                    Memory.putBack(1, m);
            }
        } else if ()
        
        
        
        
        
        if (Memory.getStqp1().isEmpty()) {
            if (!Memory.getStqp2().isEmpty())
                ch = Memory.getFrom2(0); 
                ch.setPriority(1);
                Memory.addtoqueue(ch, 0, 1);
            }
            
        }
    
    */
}
