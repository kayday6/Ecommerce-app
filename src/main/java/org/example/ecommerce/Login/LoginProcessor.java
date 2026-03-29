package org.example.ecommerce.Login;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Getter
@Setter
@Component
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;


    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService)
    {this.loggedUserManagementService = loggedUserManagementService;}

    public boolean login() {
        String username = this.getUsername();
        String password = this.getPassword();

        boolean loginStatus = false;

        if ("katie".equals(username) && "password".equals(password)) {
            loginStatus = true;
            loggedUserManagementService.setUsername(username);
        }
            return loginStatus;
        }

    }

