/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.vista;
import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class Prueba {
    public static void main(String[] args){
        List<Figura> figuras = new ArrayList<>();
        List<Figura> figurasClonadas = new ArrayList<>();

        Circulo c = new Circulo();
        c.x = 10;
        c.y = 20;
        c.radio = 15;
        c.color = "azul";
        figuras.add(c);
        
        Circulo c1 = (Circulo) c.clonar();
        figuras.add(c1);
        System.out.println(c1.x);
        Rectangulo r = new Rectangulo();
        r.ancho = 10;
        r.alto = 20;
        r.color = "amarillo";
        figuras.add(r);

        clonarYComparar(figuras, figurasClonadas);
    }

    private static void clonarYComparar(List<Figura> figuras, List<Figura> figurasClonadas) {
        for (Figura figura : figuras) {
            figurasClonadas.add(figura.clonar());
        }
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i) != figurasClonadas.get(i)) {
                System.out.println(i + ":Las figuras son diferentes");
                if (figuras.get(i).equals(figurasClonadas.get(i))) {
                    System.out.println(i + ":y son idénticas (Bien Hecho!");
                } else {
                    System.out.println(i + ":Pero no son idénticas (Error)");
                }
            } else {
                System.out.println(i + ": Las figuras son las mismas (Error)");
            }
        }
    }
}
