/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.controlador;

import ec.edu.ups.modelo.Docente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class ControladorDocente extends Controlador<Docente> {

    private ControladorPersona controlador;
    

    public ControladorDocente(String ruta, ControladorPersona controlador) {
        super(ruta);
        this.controlador = controlador;
    }
    public List<Docente> docentes() {

        List<Docente> lista = new ArrayList();
        Docente docente;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            docente = (Docente) i.next();
            lista.add(docente);

        }
        return lista;

    }

    @Override
    public boolean validar(Docente objeto) {
        return controlador.validar(objeto);

    }

    @Override
    public int generarId() {
        return 0;

    }

    
}
