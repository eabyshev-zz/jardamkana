package kg.jks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping("/list")
    public String elderlyList() {
        return "ElderlyList";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/reports")
    public String reports() {
        return "reports";
    }
}
