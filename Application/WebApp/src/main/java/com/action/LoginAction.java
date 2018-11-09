package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.LoginService;
import generated.bibliothekservice.BibliothekService;
import generated.bibliothekservice.UtilisateurResponse;
import org.apache.commons.lang3.StringUtils;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    public void validate()
    {
        if(StringUtils.isEmpty(user.getUsername()))
        {
            addFieldError("username", "Username cannot be blank");
        }
        if(StringUtils.isEmpty(user.getPassword()))
        {
            addFieldError("password", "Password cannot be blank");
        }
    }

    public String execute()
    {

        LoginService loginService = new LoginService();

        if(loginService.verifyLogin(user))
        {
            return ActionSupport.SUCCESS;
        }else
        {
            return ActionSupport.LOGIN;
        }
    }

    public User getModel() {
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
