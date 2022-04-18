/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Actividades;
import com.example.demo.repository.ActividadesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesServices implements IActividadesServices {

    @Autowired
     private ActividadesRepository actividadesRepository;
    
    @Override
    public List<Actividades> findAll() {
         return (List<Actividades>) actividadesRepository.findAll();
    }

    @Override
    public void save(Actividades Actividades) {
        actividadesRepository.save(Actividades);
    }

    @Override
    public Optional<Actividades> findById(Long id) {
      return actividadesRepository.findById(id);
    }

    @Override
    public void delete(long id) {
       actividadesRepository.deleteById(id);  
    }
    
}
