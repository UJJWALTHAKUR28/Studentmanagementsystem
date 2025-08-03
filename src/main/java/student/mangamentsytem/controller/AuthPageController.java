package student.mangamentsytem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import student.mangamentsytem.entity.User;
import student.mangamentsytem.service.UserService;

@Controller
public class AuthPageController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Thymeleaf template: register.html
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        userService.register(user);
        model.addAttribute("success", true);
        return "register"; // or redirect to login page
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Thymeleaf template: login.html
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") User user, Model model) {
        boolean authenticated = userService.authenticate(user.getEmail(), user.getPassword());
        if (authenticated) {
            // Redirect to dashboard after successful login
            return "redirect:/dashboard";
        } else {
            model.addAttribute("loginError", "Invalid email or password");
            return "login";
        }
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard"; // Thymeleaf template: dashboard.html
    }
}