package by.flameksandr.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model) {
        String firstName = request.getParameter("name");
        model.addAttribute("name", firstName);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam("surname") String surname, Model model) {
        model.addAttribute("lastName", surname);
        return "first/goodbye";
    }
}
