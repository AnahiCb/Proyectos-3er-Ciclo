/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Anahi
 */
public abstract class Controlador<E> {
    private List<E> lista;

    private String ruta;

    public Controlador(String ruta) {
        lista = new ArrayList();
        this.ruta = ruta;

    }

    public void cargarDatos() throws ClassNotFoundException, IOException {
        ObjectInputStream datos = null;
        try {
            File f = new File(ruta);
            FileInputStream a = new FileInputStream(f);
            datos = new ObjectInputStream(a);

            lista = (List<E>) datos.readObject();

        } catch (IOException e) {

        }

    }

    public void guardarDatos(String ruta) throws IOException {
        ObjectOutputStream datos = null;
        File f = new File(ruta);
        FileOutputStream archivo = new FileOutputStream(f);
        datos = new ObjectOutputStream(archivo);
        datos.writeObject(lista);

    }

    public boolean crear(E objeto) {

        if (validar(objeto) == true) {
            return lista.add(objeto);
        }
        return false;

    }

    public Optional<E> buscar(E comparar) {
        return lista.stream().filter(objeto -> objeto.equals(comparar)).findFirst();

    }

    public int posicion(E objetoC) {
        for (int i = 0; i < lista.size(); i++) {
            E objetoL = lista.get(i);
            if (objetoL.equals(objetoC)) {
                return i;
            }
        }
        return -1;

    }

    public boolean eliminar(E objeto) {
        Optional<E> buscar = buscar(objeto);
        E objetoE = buscar.get();
        if (objetoE != null) {
            System.out.println("True");
            return lista.remove(objetoE);

        }
        System.out.println("False");
        return false;

    }

    public boolean actualizar(E objetoA) {
        int pos = posicion(objetoA);
        if (pos >= 0) {
            lista.set(pos, objetoA);
            System.out.println("Verdadero");
            return true;

        }
        System.out.println("Falso");
        return false;

    }

    public abstract boolean validar(E objeto);

    public abstract int generarId();

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }
}
