/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maliarka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author JerryCampos
 */
@Controller
@RequestMapping("/administrador")
public class AdministradorController {
    
    @GetMapping("")
    public String home(){
        return "administrador/home";
    }
}
