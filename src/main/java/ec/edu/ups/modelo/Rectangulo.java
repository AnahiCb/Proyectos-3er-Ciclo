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
public class Rectangulo extends Figura {
    public int ancho;
    public int alto;

    public Rectangulo() {
    }

    public Rectangulo(Rectangulo r) {
        super(r);
        if (r != null) {
            this.ancho = r.ancho;
            this.alto = r.alto;
        }
    }

    @Override
    public Figura clonar() {
        return new Rectangulo(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangulo) || !super.equals(o)) return false;
        Rectangulo figura2 = (Rectangulo) o;
        return figura2.ancho == ancho && figura2.alto == alto;
    }
    
}
