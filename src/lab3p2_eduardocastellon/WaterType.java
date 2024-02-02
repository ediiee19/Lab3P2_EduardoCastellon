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
    private boolean respiracion;
    private int velocidadNado;

    public WaterType(boolean respiracion, int velocidadNado) {
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
    
    
}
