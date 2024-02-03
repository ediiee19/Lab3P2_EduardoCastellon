/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class WaterType extends Pokemon{
    protected boolean respiracion;
    protected int velocidadNado;

    public WaterType(String nombre, int numDex, String Naturaleza, Boolean atrapado, boolean respiracion, int velocidadNado) {
        super(nombre, numDex, Naturaleza, atrapado);
        this.respiracion = respiracion;
        this.velocidadNado = velocidadNado;
    }
    
    public boolean isRespiracion() {
        return respiracion;
    }

    public void setRespiracion(boolean respiracion) {
        this.respiracion = respiracion;
    }

    public int getVelocidadNado() {
        return velocidadNado;
    }

    public void setVelocidadNado(int velocidadNado) {
        this.velocidadNado = velocidadNado;
    }
    
    public String nadar(){
        if (respiracion) {
            return "El pokemn puede vivir fuera del agua";
        }else{
            return "El pokemn no puede vivir fuera del agua";
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "| " + nadar() + " tiene una velocidad de nado de: " + velocidadNado;
    }

}
