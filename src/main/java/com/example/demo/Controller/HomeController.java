/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.entity.Persona;
import com.example.demo.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author juzz_
 */
@Controller
public class HomeController {
    
    @Autowired
    
    private IPersonaService personaService;
    
    @GetMapping("/index")
    public String index(Model model){ 
        
        List<Persona> ListaPersonas = personaService.findAll();
        model.addAttribute("NombreUsuario", ListaPersonas);
        
    return "index";           
    } 
    
}
