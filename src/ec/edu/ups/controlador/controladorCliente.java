/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Monitor;
import ec.edu.ups.vista.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Anahi
 */
public class controladorCliente {
  VentanaPrincipal ventana;
  public  JLabel [] Clientes  ;
   int filas;
 int ejex=10;
 int ejey=10;
 int largo=60;
 int ancho=60;
 int ingreso;
 int fuera;
    public controladorCliente(VentanaPrincipal ventana, Monitor m) {
         filas= m.getClientesCola();
        this.ventana=ventana;
         
          ingreso= m.getClientes();
          fuera=m.getClientesFuera();
    }

 

    
    
   public  void generarColaDefault(){
      
      if(filas>0){
           ventana.getPanelCola().removeAll();
      Clientes= new JLabel [filas];
           for(int i=0;i<filas;i++){
      
       Clientes[i] =new javax.swing.JLabel();;
       Clientes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon.png")));
       Clientes [i].setBounds(ejex, ejey, largo, ancho);
       ventana.getPanelCola().add(Clientes[i]);
       ejex+=50;
       
       
       }
      }     
      
   
   }
   
   public void generarIngreso(){
       if(ingreso>0){
                   ventana.getPanelIngreso().removeAll();

              Clientes= new JLabel [ingreso];
        for(int i=0;i<ingreso;i++){
      
       Clientes[i] =new javax.swing.JLabel();;
       Clientes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon.png")));
       Clientes [i].setBounds(ejex, ejey, largo, ancho);
       ventana.getPanelIngreso().add(Clientes[i]);
       ejex+=50;
       
       
       }
       }
            

   }
   
   public void generarSalida(){
      
       if (fuera>0){
            ventana.getPanelSalida().removeAll();
       Clientes= new JLabel [fuera];
        for(int i=0;i<filas;i++){
      
       Clientes[i] =new javax.swing.JLabel();;
       Clientes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon.png")));
       Clientes [i].setBounds(ejex, ejey, largo, ancho);
       ventana.getPanelCola().add(Clientes[i]);
       ejex+=50;
       
       
       }
       }
          
   }
            
   
}

