package org.example.ecommerce.Login;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Setter
@Service
@SessionScope
public class LoggedUserManagementService {

    private String username;
}
