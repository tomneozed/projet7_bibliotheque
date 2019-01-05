package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.LoginService;
import generated.bibliothek.UtilisateurResponse;
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
        UtilisateurResponse userbean ;
        userbean = getBibliothekService().identification(user.getUsername(), user.getPassword());
        LoginService loginService = new LoginService();

        if(userbean.getUtilisateurBeanList().size() > 0)
        {
            session = ActionContext.getContext().getSession();
            session.put("user", user);
            vResult = ActionSupport.SUCCESS;
        }else
        {
            vResult = ActionSupport.LOGIN;
        }
        return vResult;
    }

    public String doLogout() {
        System.out.println("logout");
        session = ActionContext.getContext().getSession();

        session.remove("user");
        return ActionSupport.SUCCESS;
    }
}
