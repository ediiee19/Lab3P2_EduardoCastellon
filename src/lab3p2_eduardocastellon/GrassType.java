/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class GrassType extends Pokemon{
    private String habitad;
    private int domPlant;

    public GrassType(String habitad, int domPlant) {
        this.habitad = habitad;
        this.domPlant = domPlant;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public int getDomPlant() {
        return domPlant;
    }

    public void setDomPlant(int domPlant) {
        this.domPlant = domPlant;
    }
    
    
    
}
