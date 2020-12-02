/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author Anahi
 */
public class Rector implements Serializable{
    
    private Docente docente;
    private String cargo;
    private String correo;
    private String contrasenia;

    public Rector(Docente docente, String cargo, String correo, String contrasenia) {
        this.docente = docente;
        this.cargo = cargo;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

       

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    

    

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Rector{" + "docente=" + docente + ", cargo=" + cargo + ", correo=" + correo + ", contrasenia=" + contrasenia + '}';
    }  
    
    
}
