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
public class Actividad implements Serializable{
    
    private int codigo;
    private Curso curso;
    private String link;
    private String titulo;
    private String descripcion;

    public Actividad(int codigo, Curso curso, String link, String titulo, String descripcion) {
        this.codigo = codigo;
        this.curso = curso;
        this.link = link;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Actividad{" + "codigo=" + codigo + ", curso=" + curso 
                + ", link=" + link + ", titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }
    
    
}
