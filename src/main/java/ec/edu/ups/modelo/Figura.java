/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author Anahi
 */
public abstract class Figura {
    public int x;
    public int y;
    public String color;

    public Figura() {
    }

    public Figura(Figura f) {
        if (f != null) {
            this.x = f.x;
            this.y = f.y;
            this.color = f.color;
        }
    }

    public abstract Figura clonar();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Figura)) return false;
        Figura figura2 = (Figura) o;
        return figura2.x == x && figura2.y == y && Objects.equals(figura2.color, color);
    }
}
