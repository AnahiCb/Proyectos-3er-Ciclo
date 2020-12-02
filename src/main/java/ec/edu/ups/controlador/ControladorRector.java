/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Docente;
import ec.edu.ups.modelo.Rector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class ControladorRector extends Controlador<Rector> {

    private Rector rector;

    public ControladorRector(String ruta) {
        super(ruta);

    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    @Override
    public boolean validar(Rector objeto) {

        String correo = objeto.getCorreo();
        String pwd = objeto.getContrasenia();

        for (Rector rec : super.getLista()) {
            Rector r = (Rector) rec;
            if (r.getCorreo().equals(correo) && r.getContrasenia().equals(pwd)) {
                this.rector = r;
                return rector != null;
            }

        }
        return false;

    }

    @Override
    public int generarId() {
        return 0;

    }

    public List<Rector> usuarios() {

        List<Rector> lista = new ArrayList();
        Rector r;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            r = (Rector) i.next();
            lista.add(r);

        }
        return lista;

    }

    public Rector buscarRector(Docente docente) {
        
        for (Rector rec : super.getLista()) {
            Rector r = (Rector) rec;
            if (docente.equals(r.getDocente())) {
                this.rector = r;
                
            }
        }
        return null;
        
    }
    public boolean iniciarSesion(String correo, String pass) {
        
        for (Rector rec : super.getLista()) {
            Rector r = (Rector) rec;
            if (r.getCorreo().equals(correo) && r.getContrasenia().equals(pass)) {
                this.rector = r;
                return true;
            }
        }
        return false;
        
    }

    
}
