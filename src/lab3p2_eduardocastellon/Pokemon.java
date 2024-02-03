/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class Pokemon {
    protected String nombre;
    protected int numDex;
    protected String Naturaleza;
    protected Boolean atrapado;
    protected Pokeball ball;

    public Pokemon() {
    }

    public Pokemon(String nombre, int numDex, String Naturaleza, Boolean atrapado, Pokeball ball) {
        this.nombre = nombre;
        this.numDex = numDex;
        this.Naturaleza = Naturaleza;
        this.atrapado = atrapado;
        this.ball = ball;
    }

    public Pokemon(String nombre, int numDex, String Naturaleza, Boolean atrapado) {
        this.nombre = nombre;
        this.numDex = numDex;
        this.Naturaleza = Naturaleza;
        this.atrapado = atrapado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumDex() {
        return numDex;
    }

    public void setNumDex(int numDex) {
        this.numDex = numDex;
    }

    public String getNaturaleza() {
        return Naturaleza;
    }

    public void setNaturaleza(String Naturaleza) {
        this.Naturaleza = Naturaleza;
    }

    public Boolean getAtrapado() {
        return atrapado;
    }

    public void setAtrapado(Boolean atrapado) {
        this.atrapado = atrapado;
    }

    public Pokeball getBall() {
        return ball;
    }

    public void setBall(Pokeball ball) {
        this.ball = ball;
    }
    
    public String capturado(){
        if (atrapado) {
            return "Capturado! con "+ ball.toString();
        }else{
            return "Sin capturar";
        }
    }

    @Override
    public String toString() {
        return nombre + "["+numDex+"] " + "Naturaleza: " + Naturaleza + "| " + capturado();
    }
    
    
}
