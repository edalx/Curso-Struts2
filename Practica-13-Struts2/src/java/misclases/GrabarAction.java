/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;


import javax.servlet.http.*;
import javax.servlet.*;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.*;

/**
 *
 * @author edd_a
 */
public class GrabarAction implements ServletRequestAware, ServletResponseAware {

    String user;
    HttpServletResponse response;

    public String execute() throws Exception {
        Cookie ck = new Cookie("user", user);
        ck.setMaxAge(2000);
        response.addCookie(ck);
        return "grabado";
    }

    public String getUser() {
        return user;
    }

    public void setServletRequest(HttpServletRequest request) {
        user = request.getParameter("username");
    }

    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }
}
