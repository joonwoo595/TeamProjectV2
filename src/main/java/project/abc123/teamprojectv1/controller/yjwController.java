package project.abc123.teamprojectv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class yjwController {

    @GetMapping("/yjw")
    public String index(){
        return "views/yjw";
    }
}
