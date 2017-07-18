/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author edd_a
 */
public class ComprobarAction {
    boolean existe;
    String user;
    
    public String execute() throws Exception{
        if (existe) {
            return "si";
        }else{
            return "no";
        }      
    }

    public boolean getExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    
}
