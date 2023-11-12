package com.mycompany.registroalumnos;

/**
 *
 * @author marck - andres villamarin p.
 */
public class RegistroAlumnos {

  

    // atributos de la clase
    private String nombre;
    private String carrera;
    private int grupo;
    private String nivel;
    private int contacto;

    // constructores
    public RegistroAlumnos() {
    }

    public RegistroAlumnos(String nombre, String carrera, int grupo, String nivel, int contacto) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.grupo = grupo;
        this.nivel = nivel;
        this.contacto = contacto;
    }

    // getteres and setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    
    // metodo to String 

    @Override
    public String toString() {
        return "RegistroAlumnos{" + "nombre=" + nombre + ", carrera=" + carrera + ", grupo=" + grupo + ", nivel=" + nivel + ", contacto=" + contacto + '}';
    }

    void getNivel(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
