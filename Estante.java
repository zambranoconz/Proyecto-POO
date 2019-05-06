/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortomatic;

import java.util.ArrayList;

/**
 *
 * @author Rudy <your.name at your.org>
 */
public class Estante {
    private double lenEstante;
    private ArrayList<Articulo> listaArticulos;
    

    public double getLenEstante() {
        return lenEstante;
    }

    public void setLenEstante(double lenEstante) {
        this.lenEstante = lenEstante;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

   
    
    public Estante(double longitud){
        lenEstante= longitud;
        
    }
    
    public static void ordenarArticulos(){
        
    }
    
    public void agregarArticulo(){
        
    }
    
    @Override
    public String toString(){
        String texto = "";
        for (int i=0; i<listaArticulos.size();i++){
            
        }
        
        return texto;
    }
}
