/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Administrador;
import ec.edu.ups.modelo.Usuario;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Anahi
 */
public class ControladorUsuario extends Controlador<Usuario>{
    private Usuario usuario;
    
    public ControladorUsuario(String ruta) {
        super(ruta);
    }
    
    public Usuario iniciarSesion(String correo, String contraseña) {
        
       var listaUsuario= (List<Usuario>) getListaGenerica();
        
        Usuario usuario= listaUsuario.stream().filter(usu-> usu.getCorreo().equals(correo)&&usu.getContraseña().equals(contraseña)).findFirst().get();
        if(usuario!=null){
            Usuario.instance=usuario;
            return Usuario.getInstance();
        }
        return null;
    }
    
}
