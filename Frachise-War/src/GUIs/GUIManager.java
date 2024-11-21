/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import Classes.Computer;
import Classes.Memory;
import java.util.logging.Level;
import java.util.logging.Logger;
import Classes.Fighter;
import javax.swing.ImageIcon;
/**
 *
 * @author Katiuska Torres
 */
public class GUIManager extends Thread{
    private Star_wars_vs_Star_Trek window;
    private Computer computadora;
    
      public GUIManager(Star_wars_vs_Star_Trek window,Computer computadora) {
        this.window = window;
        this.computadora=computadora; 
    }
   @Override 
    public void run() {
        window.setSLide(10-computadora.getSeconds());
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        // Fighter 1
for (int i = 0; i < 10; i++) {
            Fighter fighter = (Fighter) Memory.getSwbacking().peek(i);
            String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
            switch (i) {
                case 0: window.setRefue_id_1_SW(fighterId); break;
                case 1: window.setRefue_id_2_SW(fighterId); break;
                case 2: window.setRefue_id_3_SW(fighterId); break;
                case 3: window.setRefue_id_4_SW(fighterId); break;
                case 4: window.setRefue_id_5_SW(fighterId); break;
                case 5: window.setRefue_id_6_SW(fighterId); break;
                case 6: window.setRefue_id_7_SW(fighterId); break;
                case 7: window.setRefue_id_8_SW(fighterId); break;
                case 8: window.setRefue_id_9_SW(fighterId); break;
                case 9: window.setRefue_id_10_SW(fighterId); break;
            }
        }
   // Repite el proceso para Star Trek
        for (int i = 0; i < 10; i++) {
            Fighter fighter = (Fighter) Memory.getStbacking().peek(i);
            String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
            switch (i) {
                case 0: window.setRefue_id_1_ST(fighterId); break;
                case 1: window.setRefue_id_2_ST(fighterId); break;
                case 2: window.setRefue_id_3_ST(fighterId); break;
                case 3: window.setRefue_id_4_ST(fighterId); break;
                case 4: window.setRefue_id_5_ST(fighterId); break;
                case 5: window.setRefue_id_6_ST(fighterId); break;
                case 6: window.setRefue_id_7_ST(fighterId); break;
                case 7: window.setRefue_id_8_ST(fighterId); break;
                case 8: window.setRefue_id_9_ST(fighterId); break;
                case 9: window.setRefue_id_10_ST(fighterId); break;
            }
        }
for (int i = 0; i < 10; i++) {
    Fighter fighter = (Fighter) Memory.getSwqp3().peek(i); // Cambiado a getFighterSwqp3()
    String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
    
    switch (i) {
        case 0: window.setDefi_id_1_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 1: window.setDefi_id_2_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 2: window.setDefi_id_3_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 3: window.setDefi_id_4_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 4: window.setDefi_id_5_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 5: window.setDefi_id_6_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 6: window.setDefi_id_7_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 7: window.setDefi_id_8_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 8: window.setDefi_id_9_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
        case 9: window.setDefi_id_10_SW(fighterId); break; // Cambiado a setDefi_id_X_SW
    }
}
for (int i = 0; i < 10; i++) {
    Fighter fighter = (Fighter) Memory.getStqp3().peek(i); // Cambiado a getFighterStqp3()
    String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
    
    switch (i) {
        case 0: window.setDefi_id_1_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 1: window.setDefi_id_2_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 2: window.setDefi_id_3_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 3: window.setDefi_id_4_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 4: window.setDefi_id_5_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 5: window.setDefi_id_6_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 6: window.setDefi_id_7_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 7: window.setDefi_id_8_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 8: window.setDefi_id_9_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
        case 9: window.setDefi_id_10_ST(fighterId); break; // Cambiado a setDefi_id_X_ST
    }
}
for (int i = 0; i < 10; i++) {
    Fighter fighter = (Fighter) Memory.getSwqp2().peek(i); // Cambiado a getFighterSwqp3()
    String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
    
    switch (i) {
        case 0: window.setProm_id_1_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 1: window.setProm_id_2_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 2: window.setProm_id_3_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 3: window.setProm_id_4_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 4: window.setProm_id_5_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 5: window.setProm_id_6_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 6: window.setProm_id_7_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 7: window.setProm_id_8_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 8: window.setProm_id_9_SW(fighterId); break; // Cambiado a setProm_id_X_SW
        case 9: window.setProm_id_10_SW(fighterId); break; // Cambiado a setProm_id_X_SW
    }
}
for (int i = 0; i < 10; i++) {
    Fighter fighter = (Fighter) Memory.getStqp2().peek(i); // Cambiado a getFighterSwqp3()
    String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
    
    switch (i) {
        case 0: window.setProm_id_1_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 1: window.setProm_id_2_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 2: window.setProm_id_3_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 3: window.setProm_id_4_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 4: window.setProm_id_5_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 5: window.setProm_id_6_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 6: window.setProm_id_7_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 7: window.setProm_id_8_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 8: window.setProm_id_9_ST(fighterId); break; // Cambiado a setProm_id_X_ST
        case 9: window.setProm_id_10_ST(fighterId); break; // Cambiado a setProm_id_X_ST
    }
}
for (int i = 0; i < 10; i++) {
    Fighter fighter = (Fighter) Memory.getSwqp1().peek(i); // Cambiado a getFighterSwqp3()
    String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
    
    switch (i) {
        case 0: window.setExcep_id_1_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 1: window.setExcep_id_2_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 2: window.setExcep_id_3_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 3: window.setExcep_id_4_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 4: window.setExcep_id_5_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 5: window.setExcep_id_6_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 6: window.setExcep_id_7_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 7: window.setExcep_id_8_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 8: window.setExcep_id_9_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
        case 9: window.setExcep_id_10_SW(fighterId); break; // Cambiado a setExcep_id_X_SW
    }
}
for (int i = 0; i < 10; i++) {
    Fighter fighter = (Fighter) Memory.getStqp1().peek(i); // Cambiado a getFighterSwqp3()
    String fighterId = (fighter != null) ? String.valueOf(fighter.getId()) : "vacio";
    
    switch (i) {
        case 0: window.setExcep_id_1_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 1: window.setExcep_id_2_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 2: window.setExcep_id_3_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 3: window.setExcep_id_4_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 4: window.setExcep_id_5_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 5: window.setExcep_id_6_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 6: window.setExcep_id_7_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 7: window.setExcep_id_8_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 8: window.setExcep_id_9_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
        case 9: window.setExcep_id_10_ST(fighterId); break; // Cambiado a setExcep_id_X_ST
    }
}
int winwars= computadora.getProcessor().getWinWars();
        int wintrek=computadora.getProcessor().getWinTrek();
if (computadora.getProcessor().getStatus()==0){
    window.setEstatus("Esperando");
}else if(computadora.getProcessor().getStatus()==1){
    window.setEstatus("Decidiendo");
}else{
    window.setEstatus("Anunciando");
}  
if((10-window.getSlide())!=computadora.getProcessor().getSeconds()){
    long a=10-window.getSlide();
    computadora.getProcessor().setSeconds(a);
}
if (Memory.getFighters()[0]!= null){
if (window.getName_SW()!= Memory.getFighters()[0].getCharacter().getName()){
    window.setName_SW(Memory.getFighters()[0].getCharacter().getName());}
if (window.getImage_SW().getDescription() !=Memory.getFighters()[0].getCharacter().getPicture() && winwars!=8){
    ImageIcon currentIcon = new ImageIcon(Memory.getFighters()[0].getCharacter().getPicture());
    window.setImage_SW(currentIcon);
if (window.getID_SW()!= String.valueOf(Memory.getFighters()[0].getId())){
    window.setID_SW(String.valueOf(Memory.getFighters()[0].getId()));}
}      
if (Memory.getFighters()[1] != null) {
    if (window.getName_ST() != Memory.getFighters()[1].getCharacter().getName()) {
        window.setName_ST(Memory.getFighters()[1].getCharacter().getName());
    }
    if (window.getImage_ST().getDescription() != Memory.getFighters()[1].getCharacter().getPicture() && wintrek!=8) {
        ImageIcon currentIcon = new ImageIcon(Memory.getFighters()[1].getCharacter().getPicture());
        window.setImage_ST(currentIcon);
        if (window.getID_ST() != String.valueOf(Memory.getFighters()[1].getId())) {
            window.setID_ST(String.valueOf(Memory.getFighters()[1].getId()));
        }
    }
}
      
        if (winwars==0){
        window.setEstado_SW("Perdedor");}
        if (winwars==1){
        window.setEstado_SW("Ganador");}
        if (winwars==2){
        window.setEstado_SW("Empate");}
        if (winwars==3){
        window.setEstado_SW("No hubo ganador");}
        if (winwars == 8) {           
        window.setEstado_SW("Esperando");
        ImageIcon currentIcon = new ImageIcon("src/Image/Interrogacion_1.png");
        window.setImage_SW(currentIcon);
        window.setName_SW("????");
        window.setID_SW("???????");}
        if (wintrek == 0) {
        window.setEstado_ST("Perdedor");}
        if (wintrek == 1) {
        window.setEstado_ST("Ganador");}
        if (wintrek == 2) {
        window.setEstado_ST("Empate");}
        if (wintrek == 3) {           
        window.setEstado_ST("No hubo ganador");}
        if (wintrek == 8) {           
        window.setEstado_ST("Esperando");
        ImageIcon currentIcon = new ImageIcon("src/Image/Interrogacion_1.png");
        window.setImage_ST(currentIcon);
        window.setName_ST("????");
        window.setID_ST("??????");}
        int Starwarswins= computadora.getProcessor().getStarwarswin();
        int Startrekwins= computadora.getProcessor().getStartrekwin();
        if (window.getST_wins() != Startrekwins) {
                window.setST_wins(Startrekwins);
            }
        if (window.getSW_wins() != Starwarswins) {
                window.setSW_wins(Starwarswins);
            }
            
}
}
    }
}
