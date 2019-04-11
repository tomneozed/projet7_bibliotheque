package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.LoginService;
import com.ws.UtilisateurResponse;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LoginAction extends AbstractAction implements ModelDriven<User>, SessionAware {

    //=========  ATTRIBUTES  =========

    private User user = new User();

    private Map<String, Object> session;

    //=========  GETTERS & SETTERS  =========

    public User getModel() {
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    //=========  METHODS  =========

    public String doLogin()
    {
        String vResult = ActionSupport.INPUT;
        if(session.get("error") != null) {
        	session.remove("error");
        }
        //= ActionSupport.INPUT;
        if(user.getUsername().length() == 0 || user.getPassword().length() == 0) {
        	String error = "Login ou password non renseigné";
        	session.put("error", error);
        	return vResult;
        }
        UtilisateurResponse userbean ;
    	userbean = getBibliothekService().identification(user.getUsername(), user.getPassword());
        LoginService loginService = new LoginService();

        if(userbean != null)
        {
        	user.setId(userbean.getUtilisateurs().get(0).getId());
            session = ActionContext.getContext().getSession();
            session.put("user", user);
            System.out.println(session.get("user"));
            vResult = ActionSupport.SUCCESS;
        }else
        {
        	String error = "Login ou password incorrect";
        	session.put("error", error);
            vResult = ActionSupport.INPUT;
        }
        return vResult;
    }
    
    public String goToPage() {
    	return ActionSupport.INPUT;
    }

    public String doLogout() {
        System.out.println("logout");
        session = ActionContext.getContext().getSession();

        session.remove("user");
        return ActionSupport.SUCCESS;
    }
}
