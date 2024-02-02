/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class Pokeball {
    private String color;
    private int numSerie;
    private int efi;

    public Pokeball() {
    }

    public Pokeball(String color, int numSerie, int efi) {
        this.color = color;
        this.numSerie = numSerie;
        this.efi = efi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getEfi() {
        return efi;
    }

    public void setEfi(int efi) {
        this.efi = efi;
    }

    @Override
    public String toString() {
        return "Pokeball: " + "["+numSerie+"] " + color;
    }
    
    
}
