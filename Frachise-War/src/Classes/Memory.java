/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Classes.Fighter;
import DataStructures.Queue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Sofia
 */
public final class Memory {
    private static Character[] character1 = new Character[20];
    private static Character[] character2 = new Character[20]; 
    private static int[] numcharacters = new int[]{0,0}; 
    private static Queue swqp1 = new Queue(); 
    private static Queue swqp2 = new Queue();
    private static Queue swqp3 = new Queue();
    private static Queue swbacking = new Queue();
    private static Queue stqp1 = new Queue();
    private static Queue stqp2 = new Queue();
    private static Queue stqp3 =new Queue();
    private static Queue stbacking = new Queue();
    private static Semaphore s1 = new Semaphore(0);  // Semaforo para el AI
    private static Semaphore s2 =new Semaphore(1); // Semaforo para el administrador
    private static Fighter[] fighters = new Fighter[2]; 
    private static boolean flag = false; 

    private Memory() {
    }
    
    public static void insertCharacter(Character c, int i){
        if (numcharacters[i] < 20) {
            if (i == 0) {
                character1[numcharacters[i]] = c; 
            } else if (i == 1) {
                character2[numcharacters[i]] = c; 
            }
            numcharacters[i]++; 
        } 
    }
    //CORREGIR
    public static Fighter bringCharacter(int f) {
        Fighter ch =  null; 
        if (f == 0) {
            if (!swqp1.isEmpty()) {
                ch = (Fighter) swqp1.dequeue(); 
            } else {
                if (!swqp2.isEmpty()) {
                    ch = (Fighter) swqp2.dequeue(); 
                } else {
                    ch = (Fighter) swqp3.dequeue(); 
                }
            }     
        } else if (f == 1) {
             if (!stqp1.isEmpty()) {
                ch = (Fighter) stqp1.dequeue(); 
            } else {
                if (!stqp2.isEmpty()) {
                    ch = (Fighter) stqp2.dequeue(); 
                } else {
                    ch = (Fighter) stqp3.dequeue(); 
                }
            }
        }
         return ch; 
    }
    
    public static void addtoqueue (Fighter fight, int company) {
        int i = fight.getPriority(); 
        if (company == 0) {
                switch  (i) {
                case 1:
                    swqp1.enqueue(fight);
                    break; 
                case 2: 
                    swqp2.enqueue(fight);
                    break;
                case 3:
                    swqp3.enqueue(fight);
                    break;    
                }
            //swbacking.enqueue(fight); 
            
        } else if (company == 1) {
                switch  (i) {
                case 1:
                    stqp1.enqueue(fight);
                    break; 
                case 2: 
                    stqp2.enqueue(fight);
                    break;
                case 3:
                    stqp3.enqueue(fight);
                    break;    
                }
            //stbacking.enqueue(fight); 
        }
        
    }
    
    public static void setFighters (Fighter f1, Fighter f2){
        fighters[0] = f1; 
        fighters[1] = f2; 
    }
    
    public static Fighter[] getFighters(){
        return fighters;
    }

    public static Character[] getCharacter1() {
        return character1;
    }

    public void setCharacter1(Character[] character1) {
        this.character1 = character1;
    }

    public static Character[] getCharacter2() {
        return character2;
    }
    
    
    public static Fighter[] getBack(){
        if (swbacking.isEmpty() &&  stbacking.isEmpty()) {
              System.out.println("Backing empty");
            return null; 
        } else {
            Fighter[] backers = {(Fighter) swbacking.dequeue(), (Fighter) stbacking.dequeue()}; 
            return backers; 
        }    
    }
    
    public static void putBack(int i, Fighter fighter){
        if (i==0) {
           swbacking.enqueue(fighter); 
        } else {
            stbacking.enqueue(fighter); 
        }      
    }
    
    public static Fighter getFrom2(int i) {
        Fighter ch; 
        if (i == 0) {
            ch = (Fighter) swqp2.dequeue(); 
        } else {
             ch = (Fighter) stqp2.dequeue(); 
        } 
        return ch; 
    }
    
    public static Fighter getFrom3(int i) {
        Fighter ch; 
        if (i == 0) {
            ch = (Fighter) swqp3.dequeue(); 
        } else {
             ch = (Fighter) stqp3.dequeue(); 
        } 
        return ch; 
    }

    public static Semaphore getS1() {
        return s1;
    }

    public static void setS1(Semaphore s1) {
        Memory.s1 = s1;
    }

    public static Semaphore getS2() {
        return s2;
    }

    public static void setS2(Semaphore s2) {
        Memory.s2 = s2;
    }

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag() {
        Memory.flag = !flag;
    }

    public static Queue getSwqp1() {
        return swqp1;
    }

    public static void setSwqp1(Queue swqp1) {
        Memory.swqp1 = swqp1;
    }

    public static Queue getStqp1() {
        return stqp1;
    }

    public static void setStqp1(Queue stqp1) {
        Memory.stqp1 = stqp1;
    }

    public static Queue getSwqp2() {
        return swqp2;
    }

    public static void setSwqp2(Queue swqp2) {
        Memory.swqp2 = swqp2;
    }

    public static Queue getSwqp3() {
        return swqp3;
    }

    public static void setSwqp3(Queue swqp3) {
        Memory.swqp3 = swqp3;
    }

    public static Queue getSwbacking() {
        return swbacking;
    }

    public static void setSwbacking(Queue swbacking) {
        Memory.swbacking = swbacking;
    }

    public static Queue getStqp2() {
        return stqp2;
    }

    public static void setStqp2(Queue stqp2) {
        Memory.stqp2 = stqp2;
    }

    public static Queue getStqp3() {
        return stqp3;
    }

    public static void setStqp3(Queue stqp3) {
        Memory.stqp3 = stqp3;
    }

    public static Queue getStbacking() {
        return stbacking;
    }

    public static void setStbacking(Queue stbacking) {
        Memory.stbacking = stbacking;
    }
    
    public static void updateCounters(){
        System.out.println("---------uptading counters---------------------------");
        Queue newqueue = new Queue(); 
        Fighter pointer =(Fighter)swqp2.dequeue(); 
        while (pointer!= null) {
           pointer.setCounter(pointer.getCounter() +1);
           System.out.println(pointer.getId() + "-" + pointer.getCharacter().getName() + " counter: " + pointer.getCounter());
           if (pointer.getCounter() == 8) {
               System.out.println("-" + pointer.getCharacter().getName() + " tenia un counter = 8. Se pasa a la cola 1");
               pointer.setCounter(0);
               pointer.setPriority(1);
               swqp1.enqueue(pointer);
           } else {
               newqueue.enqueue(pointer);
           }
           pointer = (Fighter)swqp2.dequeue();     
        }
        Memory.setSwqp2(newqueue);
        newqueue = new Queue(); 
        pointer =(Fighter)stqp2.dequeue();  
        while (pointer!= null) {
           pointer.setCounter(pointer.getCounter() +1);
           System.out.println(pointer.getId() + "-" + pointer.getCharacter().getName() + " counter: " + pointer.getCounter());
           if (pointer.getCounter() == 8) {
               System.out.println("-" + pointer.getCharacter().getName() + " tenia un counter = 8. Se pasa a la cola 1");
               pointer.setCounter(0);
               pointer.setPriority(1);
               stqp1.enqueue(pointer);
           } else {
               newqueue.enqueue(pointer);
           }
           pointer = (Fighter)stqp2.dequeue();  
        }
        Memory.setStqp2(newqueue);
        newqueue = new Queue(); 
        pointer =(Fighter)swqp3.dequeue();  
        while (pointer!= null) {
           pointer.setCounter(pointer.getCounter() +1);
           System.out.println(pointer.getId() + "-" + pointer.getCharacter().getName() + " counter: " + pointer.getCounter());
           if (pointer.getCounter() == 8) {
               System.out.println("-" + pointer.getCharacter().getName() + " tenia un counter = 8. Se pasa a la cola 2");
               pointer.setCounter(0);
               pointer.setPriority(1);
               swqp2.enqueue(pointer);
           } else {
               newqueue.enqueue(pointer);
           }
           pointer = (Fighter)swqp3.dequeue();  
        }
        Memory.setSwqp3(newqueue);
        newqueue = new Queue(); 
        pointer =(Fighter)stqp3.dequeue();  
        while (pointer!= null) {
           pointer.setCounter(pointer.getCounter() +1);
           System.out.println(pointer.getId() + "-" + pointer.getCharacter().getName() + " counter: " + pointer.getCounter());
           if (pointer.getCounter() == 8) {
               System.out.println("-" + pointer.getCharacter().getName() + " tenia un counter = 8. Se pasa a la cola 2");
               pointer.setCounter(0);
               pointer.setPriority(1);
               stqp2.enqueue(pointer);
           } else {
               newqueue.enqueue(pointer);
           }
           pointer = (Fighter)stqp3.dequeue();  
        }
        Memory.setStqp3(newqueue);
    }
    
 
}
