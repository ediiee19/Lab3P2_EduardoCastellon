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
    protected String habitad;
    protected int domPlant;

    public GrassType(String nombre, int numDex, String Naturaleza, Boolean atrapado, String habitad, int domPlant) {
        super(nombre, numDex, Naturaleza, atrapado);
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

    @Override
    public String toString() {
        return super.toString() + "";
    }
    
    
    
}
