package br.com.tuxlinux.alura.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deyve on 04/06/17.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){

        System.out.println("Entrando na home da CDC");

        model.addAttribute("recipient", "World");

        return "index";
    }
}
