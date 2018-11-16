package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.LoginService;
import generated.bibliothekservice.BibliothekService;
import generated.bibliothekservice.BibliothekServiceService;
import generated.bibliothekservice.UtilisateurBean;
import generated.bibliothekservice.UtilisateurResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

    BibliothekServiceService bibliothekServiceService = new BibliothekServiceService();

    @Autowired
    private BibliothekService bibliothekService = bibliothekServiceService.getBibliothekServicePort();
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
        UtilisateurResponse userbean = new UtilisateurResponse();
        userbean = bibliothekService.identification(user.getUsername(), user.getPassword());
        LoginService loginService = new LoginService();

        if(userbean.getUtilisateurBeanList().size() > 0)
        {
            Map session = ActionContext.getContext().getSession();
            session.put("user", user);
            return ActionSupport.SUCCESS;
        }else
        {
            return ActionSupport.LOGIN;
        }
    }

    public BibliothekService getBibliothekService() {
        return bibliothekService;
    }

    public void setBibliothekService(BibliothekService bibliothekService) {
        this.bibliothekService = bibliothekService;
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
