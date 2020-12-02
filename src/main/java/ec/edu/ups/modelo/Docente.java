/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Anahi
 */
public class Docente extends Persona{
   
    private String profesion;
    private Curso curso;
    private String correo;
    private String contrasenia;

    public Docente(String profesion, String correo, String contrasenia, String cedula, String nombre, String apellido, int edad, String direccion) {
        super(cedula, nombre, apellido, edad, direccion);
        this.profesion = profesion;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Docente{" + "profesion=" + profesion + ", correo=" + correo + ", contrasenia=" + contrasenia + '}';
    }
    
    
}
