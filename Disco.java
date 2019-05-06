/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortomatic;

/**
 *
 * @author Rudy <your.name at your.org>
 */
public class Disco extends Articulo {
    private double capacidad;
    
    // getters y setters
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    // constructor

    public Disco(double capacidad, double ancho, double alto, String titulo, String tipo) {
        super(ancho, alto, titulo, tipo);
        this.capacidad = capacidad;
    }

    
   
    
}
