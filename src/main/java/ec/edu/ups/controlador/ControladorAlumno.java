/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class ControladorAlumno extends Controlador<Alumno> {

    private ControladorPersona controlador;

    public ControladorAlumno(ControladorPersona controlador, String ruta) {
        super(ruta);
        this.controlador = controlador;
    }
    public List<Alumno> alumnos() {

        List<Alumno> lista = new ArrayList();
        Alumno alumno;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            alumno = (Alumno) i.next();
            lista.add(alumno);

        }
        return lista;

    }

    @Override
    public boolean validar(Alumno objeto) {
        return controlador.validar(objeto);
    }

    @Override
    public int generarId() {
        return 0;

    }
    
}
