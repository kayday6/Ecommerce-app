package org.example.ecommerce.Login;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final LoggedUserManagementService loggedUserManagementService;

    public HomeController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/home")
    public String home(
            @RequestParam(required = false) String logout, Model model) {

        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

        String username =
                loggedUserManagementService.getUsername();

        if(username == null) {
            return "redirect:/logout";
        }
        model.addAttribute("username", username);
        return "home.html";
    }
}
