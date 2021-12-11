/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_heydenaldana_22111098;

import java.util.ArrayList;

/**
 *
 * @author heyde
 */
public class chat 
{
    private ArrayList<String> mensajes;
    private String usuario;
    
    public chat(String usuario)
    {
        this.usuario = usuario;
        this.mensajes = new ArrayList<String>();
    }

    public ArrayList<String> getArrayMensajes() {
        return mensajes;
    }

    public void addMensaje(String msg) {
        mensajes.add(msg);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
