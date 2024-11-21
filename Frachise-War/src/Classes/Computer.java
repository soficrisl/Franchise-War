/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;



/**
 *
 * @author Sofia
 */
public class Computer {
    private Administrator admin; 
    private  AIProcessor processor;
    private int seconds; 

    public Computer(int seconds) {
        this.admin = new Administrator(); 
        this.processor = new AIProcessor(seconds); 
        this.seconds = seconds; 
    }
    
    public void simulation() {
        // Inicializamos a los personajes
        // Star Wars Characters
Memory.insertCharacter(new Character("Luke Skywalker", "src/Image/Skywalker_luke_1.png", 4, 0), 0);
Memory.insertCharacter(new Character("Darth Vader", "src/Image/darth_vader_1.jpg", 5, 0), 0);
Memory.insertCharacter(new Character("Princess Leia", "src/Image/Princess_leia_1.jpg", 3, 0), 0);
Memory.insertCharacter(new Character("Han Solo", "src/Image/Han_solo_1.jpg", 3, 0), 0);
Memory.insertCharacter(new Character("Yoda", "src/Image/Yoda_1.jpg", 5, 0), 0);
Memory.insertCharacter(new Character("Obi-Wan Kenobi", "src/Image/Obi-wan-kenobi_1.jpg", 5, 0), 0);
Memory.insertCharacter(new Character("Clone Trooper", "src/Image/Clone_trooper_1.jpg", 0, 0), 0);
Memory.insertCharacter(new Character("Stormtrooper", "src/Image/Stormtrooper_1.jpg", 0, 0), 0);
Memory.insertCharacter(new Character("Jango Fett", "src/Image/Jango_fett_1.jpg", 2, 0), 0);
Memory.insertCharacter(new Character("Boba Fett", "src/Image/Boba_fett_1.jpg", 2, 0), 0);
Memory.insertCharacter(new Character("Palpatine", "src/Image/Palpatine_1.jpg", 5, 0), 0);
Memory.insertCharacter(new Character("Rey", "src/Image/Rey_1.jpg", 4, 0), 0);
Memory.insertCharacter(new Character("Finn", "src/Image/Finn_1.jpg", 3, 0), 0);
Memory.insertCharacter(new Character("Poe Dameron", "src/Image/Poe_dameron_1.jpg", 3, 0), 0);
Memory.insertCharacter(new Character("Mace Windu", "src/Image/Mace_windu_1.jpg", 1, 0), 0);
Memory.insertCharacter(new Character("Padmé Amidala", "src/Image/Padme_amidala_1.jpg", 3, 0), 0);
Memory.insertCharacter(new Character("Qui-Gon Jinn", "src/Image/Qui-Gon-Jinn_1.jpg", 2, 0), 0);
Memory.insertCharacter(new Character("Ahsoka Tano", "src/Image/Ashoka_tano_1.jpg", 4, 0), 0);
Memory.insertCharacter(new Character("Jabba the Hutt", "src/Image/Jabba_the_hutt_1.jpg", 3, 0), 0);
Memory.insertCharacter(new Character("General Grievous", "src/Image/General_grevious_1.jpg", 5, 0), 0);
        
        // Star Trek Characters
Memory.insertCharacter(new Character("Captain Kirk", "src/Image/Captain_Kirk_1.jpg", 5, 1), 1);
Memory.insertCharacter(new Character("Spock", "src/Image/Spock_1.jpg", 4, 1), 1);
Memory.insertCharacter(new Character("Jean-Luc Picard", "src/Image/Jean_Luc_Picard_1.jpg", 4, 1), 1);
Memory.insertCharacter(new Character("Data", "src/Image/Data_1.jpg", 2, 1), 1);
Memory.insertCharacter(new Character("Worf", "src/Image/Worf_1.jpg", 2, 1), 1);
Memory.insertCharacter(new Character("Uhura", "src/Image/Uhura_1.jpg", 1, 1), 1);
Memory.insertCharacter(new Character("Scotty", "src/Image/Scotty_1.jpg", 1, 1), 1);
Memory.insertCharacter(new Character("Bones McCoy", "src/Image/Bones_McCoy_1.jpg", 1, 1), 1);
Memory.insertCharacter(new Character("Sulu", "src/Image/Sulu_1.jpg", 1, 1), 1);
Memory.insertCharacter(new Character("Q", "src/Image/Q_1.jpg", 5, 1), 1);
Memory.insertCharacter(new Character("Borg Drone", "src/Image/Borg_Drone_1.jpg", 0, 1), 1);
Memory.insertCharacter(new Character("Redshirt", "src/Image/Redshirt_1.jpg", 0, 1), 1);
Memory.insertCharacter(new Character("Chakotay", "src/Image/Chakotay_1.jpg", 2, 1), 1);
Memory.insertCharacter(new Character("Seven of Nine", "src/Image/Seven_of_Nine_1.jpg", 3, 1), 1);
Memory.insertCharacter(new Character("The Doctor", "src/Image/The_Doctor_1.jpg", 3, 1), 1);
Memory.insertCharacter(new Character("Captain Janeway", "src/Image/Captain_Janeway_1.jpg", 4, 1), 1);
Memory.insertCharacter(new Character("Tom Paris", "src/Image/Tom_Paris_1.jpg", 1, 1), 1);
Memory.insertCharacter(new Character("B'Elanna Torres", "src/Image/B_Elanna_Torres_1.jpg", 2, 1), 1);
Memory.insertCharacter(new Character("Tuvok", "src/Image/Tuvok_1.jpg", 1, 1), 1);
Memory.insertCharacter(new Character("Hikaru Sulu", "src/Image/Hikaru_Sulu_1.jpg", 1, 1), 1);

        
        admin.start();
        processor.start();
        
    }

    public AIProcessor getProcessor() {
        return processor;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
    
    
    
}
