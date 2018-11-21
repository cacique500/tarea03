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
public class Usuario {
    private String nombre;
    private String apellidos;
    private String edad;
    private String dni;
    
    public Usuario(String nombre, String apellidos, String edad, String dni){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
     public String ToStringNombre(){
        return nombre;
        
    }
     public String ToStringApellidos(){
        return apellidos;
        
    }
     public String ToStringEdad(){
        return edad;
        
    }
     public String ToStringDni(){
        return dni;
        
    }
}
