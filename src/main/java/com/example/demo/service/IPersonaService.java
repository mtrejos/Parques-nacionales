/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author juzz_
 */
public interface IPersonaService {
   
   public List <Persona> findAll();

   public void save(Persona Persona);

   public Optional <Persona> findById(Long id);

   public void delete(long id);
}
