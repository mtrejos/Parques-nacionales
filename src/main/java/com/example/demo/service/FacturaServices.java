/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Factura;
import com.example.demo.repository.FacturaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServices implements IFacturaServices{

    @Autowired
    private FacturaRepository facturarepository;    
    
    @Override
    public List<Factura> findAll() {
      return (List<Factura>) facturarepository.findAll();
    }

    @Override
    public void save(Factura Persona) {
     facturarepository.save(Persona);
    }

    @Override
    public Optional<Factura> findById(Long id) {
     return facturarepository.findById(id);  
    }

    @Override
    public void delete(long id) {
         facturarepository.deleteById(id);
    }
    
}
