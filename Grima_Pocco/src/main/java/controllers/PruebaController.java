package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaController {

    @GetMapping("/holamundo")
    public String holaMundo(){

       return "holamundo";
    }

}