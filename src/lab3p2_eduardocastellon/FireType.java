/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_eduardocastellon;

public class FireType extends Pokemon{

    private int potencia;

    public FireType(String nombre, int numDex, String Naturaleza, Boolean atrapado, int potencia ){
        super(nombre, numDex, Naturaleza, atrapado);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
