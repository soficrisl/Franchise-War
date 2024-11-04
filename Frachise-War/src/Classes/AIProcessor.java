/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataStructures.ListaDoble;
import DataStructures.Queue;

/**
 *
 * @author Sofia
 */
public class AIProcessor extends Thread{
    private ListaDoble winners = new ListaDoble(); 
    private AIProcessor processor; 
    private Administrator admin; 

    public AIProcessor() {
        initializelists();
        this.admin = new Administrator(); 
    }

    public void initializelists(){
        // Star Wars Characters
        Memory.insertCharacter(new Character("Luke Skywalker", "https://example.com/luke.jpg", 4, 0), 0);
        Memory.insertCharacter(new Character("Darth Vader", "https://example.com/vader.jpg", 5, 0), 0);
        Memory.insertCharacter(new Character("Princess Leia", "https://example.com/leia.jpg", 3, 0), 0);
        Memory.insertCharacter(new Character("Han Solo", "https://example.com/han.jpg", 3, 0), 0);
        Memory.insertCharacter(new Character("Yoda", "https://example.com/yoda.jpg", 4, 0), 0);
        Memory.insertCharacter(new Character("Obi-Wan Kenobi", "https://example.com/obiwan.jpg", 4, 0), 0);
        Memory.insertCharacter(new Character("Clone Trooper", "https://example.com/clone.jpg", 0, 0), 0);
        Memory.insertCharacter(new Character("Stormtrooper", "https://example.com/stormtrooper.jpg", 0, 0), 0);
        Memory.insertCharacter(new Character("Jango Fett", "https://example.com/jango.jpg", 2, 0), 0);
        Memory.insertCharacter(new Character("Boba Fett", "https://example.com/boba.jpg", 2, 0), 0);
        Memory.insertCharacter(new Character("Palpatine", "https://example.com/palpatine.jpg", 5, 0), 0);
        Memory.insertCharacter(new Character("Rey", "https://example.com/rey.jpg", 4, 0), 0);
        Memory.insertCharacter(new Character("Finn", "https://example.com/finn.jpg", 3, 0), 0);
        Memory.insertCharacter(new Character("Poe Dameron", "https://example.com/poe.jpg", 2, 0), 0);
        Memory.insertCharacter(new Character("Mace Windu", "https://example.com/mace.jpg", 1, 0), 0);
        Memory.insertCharacter(new Character("Padmé Amidala", "https://example.com/padme.jpg", 3, 0), 0);
        Memory.insertCharacter(new Character("Qui-Gon Jinn", "https://example.com/quigon.jpg", 2, 0), 0);
        Memory.insertCharacter(new Character("Ahsoka Tano", "https://example.com/ahsoka.jpg", 4, 0), 0);
        Memory.insertCharacter(new Character("Jabba the Hutt", "https://example.com/jabba.jpg", 5, 0), 0);

        // Star Trek Characters
        Memory.insertCharacter(new Character("Captain Kirk", "https://example.com/kirk.jpg", 4, 1), 1);
        Memory.insertCharacter(new Character("Spock", "https://example.com/spock.jpg", 4, 1), 1);
        Memory.insertCharacter(new Character("Jean-Luc Picard", "https://example.com/picard.jpg", 4, 1), 1);
        Memory.insertCharacter(new Character("Data", "https://example.com/data.jpg", 2, 1), 1);
        Memory.insertCharacter(new Character("Worf", "https://example.com/worf.jpg", 2, 1), 1);
        Memory.insertCharacter(new Character("Uhura", "https://example.com/uhura.jpg", 1, 1), 1);
        Memory.insertCharacter(new Character("Scotty", "https://example.com/scotty.jpg", 1, 1), 1);
        Memory.insertCharacter(new Character("Bones McCoy", "https://example.com/mccoy.jpg", 1, 1), 1);
        Memory.insertCharacter(new Character("Sulu", "https://example.com/sulu.jpg", 1, 1), 1);
        Memory.insertCharacter(new Character("Q", "https://example.com/q.jpg", 5, 1), 1);
        Memory.insertCharacter(new Character("Borg Drone", "https://example.com/borgdrone.jpg", 0, 1), 1);
        Memory.insertCharacter(new Character("Redshirt", "https://example.com/redshirt.jpg", 0, 1), 1);
        Memory.insertCharacter(new Character("Chakotay", "https://example.com/chakotay.jpg", 2, 1), 1);
        Memory.insertCharacter(new Character("Seven of Nine", "https://example.com/seven.jpg", 3, 1), 1);
        Memory.insertCharacter(new Character("The Doctor", "https://example.com/doctor.jpg", 3, 1), 1);
        Memory.insertCharacter(new Character("Captain Janeway", "https://example.com/janeway.jpg", 4, 1), 1);
        Memory.insertCharacter(new Character("Tom Paris", "https://example.com/tomparis.jpg", 1, 1), 1);
        Memory.insertCharacter(new Character("B'Elanna Torres", "https://example.com/torres.jpg", 2, 1), 1);
        Memory.insertCharacter(new Character("Tuvok", "https://example.com/tuvok.jpg", 1, 1), 1);
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
    
}
