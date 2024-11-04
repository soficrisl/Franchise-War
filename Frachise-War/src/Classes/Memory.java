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
    private static Character[] character1 = new Character[20];
    private static Character[] character2 = new Character[20]; 
    private  static int[] numcharacters;
    private static Queue swqp1;
    private static Queue swqp2;
    private static Queue swqp3;  
    private static Queue swbacking; 
    private static Queue stqp1;
    private static Queue stqp2;
    private  static Queue stqp3;  
    private static Queue stbacking; 

    private Memory() {
        this.swqp1 = new Queue(20);
        this.swqp2 = new Queue(20);
        this.swqp3 = new Queue(20);
        this.swbacking =new Queue(20);
        this.character1 = new Character[20];
        this.numcharacters = new int[2]; 
        this.stqp1 = new Queue(20);
        this.stqp2 = new Queue(20);
        this.stqp3 = new Queue(20);
        this.stbacking =new Queue(20);
        this.character1 = new Character[20];
    }
    
    public static void insertCharacter(Character c, int i){
        if (numcharacters[i] < 20) {
            if (i == 0) {
                character1[numcharacters[i]] = c; 
            } else if (i ==1) {
                character2[numcharacters[i]] = c; 
            }
            numcharacters[i]++; 
        } 
    }
    
    public Fighter bringCharacter(int i, int f) {
        Fighter ch =  null; 
        if (f == 0) {
            if (i == 0) {
                ch = (Fighter) swqp1.dequeue(); 
            } else if (i == 1) {
                ch = (Fighter) swqp2.dequeue();
            } else if (i == 2) {
                ch = (Fighter) swqp3.dequeue();
            } else if (i == 3) {
                ch = (Fighter) swbacking.dequeue();
            }
        } else if (f == 1) {
            if (i == 0) {
                ch = (Fighter) stqp1.dequeue(); 
            } else if (i == 1) {
                ch = (Fighter) stqp2.dequeue();
            } else if (i == 2) {
                ch = (Fighter) stqp3.dequeue();
            } else if (i == 3) {
                ch = (Fighter) stbacking.dequeue();
            }
        }
        
        return ch; 
    }

    public  Character[] getCharacter1() {
        return character1;
    }

    public void setCharacter1(Character[] character1) {
        this.character1 = character1;
    }

    public Character[] getCharacter2() {
        return character2;
    }

    public void setCharacter2(Character[] character2) {
        this.character2 = character2;
    }

    public int[] getNumcharacters() {
        return numcharacters;
    }

    public void setNumcharacters(int[] numcharacters) {
        this.numcharacters = numcharacters;
    }

    public Queue getSwqp1() {
        return swqp1;
    }

    public void setSwqp1(Queue swqp1) {
        this.swqp1 = swqp1;
    }

    public Queue getSwqp2() {
        return swqp2;
    }

    public void setSwqp2(Queue swqp2) {
        this.swqp2 = swqp2;
    }

    public Queue getSwqp3() {
        return swqp3;
    }

    public void setSwqp3(Queue swqp3) {
        this.swqp3 = swqp3;
    }

    public Queue getSwbacking() {
        return swbacking;
    }

    public void setSwbacking(Queue swbacking) {
        this.swbacking = swbacking;
    }

    public Queue getStqp1() {
        return stqp1;
    }

    public void setStqp1(Queue stqp1) {
        this.stqp1 = stqp1;
    }

    public Queue getStqp2() {
        return stqp2;
    }

    public void setStqp2(Queue stqp2) {
        this.stqp2 = stqp2;
    }

    public Queue getStqp3() {
        return stqp3;
    }

    public void setStqp3(Queue stqp3) {
        this.stqp3 = stqp3;
    }

    public Queue getStbacking() {
        return stbacking;
    }

    public void setStbacking(Queue stbacking) {
        this.stbacking = stbacking;
    }
    
    
 
}
