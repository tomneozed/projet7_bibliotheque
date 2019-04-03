package com.service;

import com.model.User;

public class LoginService {

    //private BibliothekService bibliothekService;

    public boolean verifyLogin(User user)
    {
        //bibliothekService.identification(user.getUsername(), user.getPassword())
        if(user.getPassword().equals("password") && user.getUsername().equals("username"))
        {
            return true;
        }else
        {
            return false;
        }
    }


}
