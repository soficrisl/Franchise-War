/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Sofia
 */
public class Character {
    private String name; 
    private String picture; 
    private int category; // 0 - npc 1 - side character 2- secondary caracter 3- main caracters 4 - hero 5- villian
    private int company;

    public Character(String name, String picture, int category, int company) {
        this.name = name;
        this.picture = picture;
        this.category = category;
        this.company = company;
    }
    
            
    
}
