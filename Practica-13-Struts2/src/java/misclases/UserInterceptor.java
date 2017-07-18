/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.*;
import org.apache.struts2.*;
import org.apache.struts2.interceptor.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author edd_a
 */
public class UserInterceptor extends AbstractInterceptor implements StrutsStatics{
public String intercept(ActionInvocation invocation) throws Exception{
  ComprobarAction action=(ComprobarAction)invocation.getAction();
    
   
ActionContext context=invocation.getInvocationContext();
HttpServletRequest request=(HttpServletRequest)context.get(HTTP_REQUEST);
Cookie [] cookies=request.getCookies();
 if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("user")) {
                    action.setExiste(true);
                    action.setUser(cookies[i].getValue());
                }
                
            }
}
 return invocation.invoke();
}}

   