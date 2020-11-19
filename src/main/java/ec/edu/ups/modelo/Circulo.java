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
public class Circulo extends Figura{
    public int radio;

    public Circulo() {
    }

    public Circulo(Circulo c) {
        super(c);
        if (c != null) {
            this.radio = c.radio;
        }
    }

    @Override
    public Figura clonar() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circulo) || !super.equals(o)) return false;
        Circulo figura2 = (Circulo) o;
        return figura2.radio == radio;
    }
    
}
