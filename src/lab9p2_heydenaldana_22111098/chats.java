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
public class chats 
{
    private ArrayList<chat> c = new ArrayList<chat>();
    
    public boolean agregarNuevoChat(String usuario)
    {
        for (int i = 0; i < c.size(); i++) 
        {
            if(c.get(i).getUsuario().equals(usuario))
                return false;
        }
        
        c.add(new chat(usuario));
        return true;
    }
    
    public void agregaralChat(String usuario, String mensaje)
    {
        for (int i = 0; i < c.size(); i++) 
        {
            if(c.get(i).getUsuario().equals(usuario))
            {
                c.get(i).addMensaje(mensaje);
            }
        }
    }
    
    public String getTodosMensajes(String usuario)
    {
        String msg="";
        for (int i = 0; i < c.size(); i++) 
        {
            if(c.get(i).getUsuario().equals(usuario))
            {
                ArrayList<String> tempm = c.get(i).getArrayMensajes();
                for (String m : tempm) 
                {
                    msg += m + "\n";
                }
            }
        }
        
        return msg;
    }
    
    
    public boolean eliminarChat(String usuario)
    {
        for (int i = 0; i < c.size(); i++) 
        {
            if(c.get(i).getUsuario().equals(usuario))
            {
                c.remove(i);
            }
        }
    }
}
