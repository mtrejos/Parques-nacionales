/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
 import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonaService implements IPersonaService{
     
@Autowired
     private PersonaRepository PersonaRepository;
     
    @Override
    public List<Persona> findAll() {
       return (List<Persona>) PersonaRepository.findAll();
    }

    @Override
    public void save(Persona Persona) {
        PersonaRepository.save(Persona);
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return PersonaRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        PersonaRepository.deleteById(id);
    }   
    
}
