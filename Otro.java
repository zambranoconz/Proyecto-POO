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
public class Otro extends Articulo {
    private String descripcion;

    // getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // constructor

    public Otro(String descripcion, double ancho, double alto, String titulo, String tipo) {
        super(ancho, alto, titulo, tipo);
        this.descripcion = descripcion;
    }
    
    
}
