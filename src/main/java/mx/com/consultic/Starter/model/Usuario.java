/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.consultic.Starter.model;

/**
 *
 * @author roberto
 */

public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private String domicilio;
    private String movil;
    private String telefono;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String domicilio, String movil, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.movil = movil;
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", domicilio=" + domicilio + ", movil=" + movil + ", telefono=" + telefono + '}';
    }
   
    
}
