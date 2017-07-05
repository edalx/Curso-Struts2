/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

/**
 *
 * @author fing.labcom
 */
public class Validacion implements ServletRequestAware, ServletContextAware{
    String pwd;
    String user;
    ServletContext context;

    public String getPwd() {
        return pwd;
    }

    public String getUser() {
        return user;
    }


    

    public void setServletRequest(HttpServletRequest hsr) {
        pwd=hsr.getParameter("password");
        user=hsr.getParameter("username");
    }
    
    public void setServletContext(ServletContext context){
        this.context=context;
    }

 
    public String execute() throws Exception{
        String driver=context.getInitParameter("driver");
        String cadenacon=context.getInitParameter("cadenacon");
        GestionClientes gc=new GestionClientes(driver,cadenacon);
        
        if (gc.validar(user,pwd)) {
            return "ok";
        }else{
            return "error";
        }
    }
    
    
    
}
