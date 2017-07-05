/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author fing.labcom
 */
public class GestionClientes {
    Datos dt;

    public GestionClientes( String driver, String cadenacon) {
        dt=new Datos(driver,cadenacon);
    }

    public boolean validar(String user, String pwd){
        boolean estado=false;
        try {
            Connection cn=dt.getConexion();
            
            String query="select * from cliente where password='"+pwd+"' and usuario='"+user+"'";
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(query);
            estado=rs.next();
            
            dt.cierraConexion(cn);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return estado;
        }
    }
}
