/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmj.indiv03;

/**
 *
 * @author phpjava
 */
public class Producto {
    private String referencia;
    private String nombre;
    private String unidades;
    public Producto(String referencia, String nombre, String unidades){
        this.referencia=referencia;
        this.nombre=nombre;
        this.unidades=unidades;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }
    public String ToStringReferencia(){
        return referencia;
    }
    
    public String ToStringNombre(){
        return nombre;
    }
    
    public String ToStringUnidades(){
        return unidades;
    }
    
    
}
