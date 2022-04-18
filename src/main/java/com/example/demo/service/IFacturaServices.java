/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Factura;
import java.util.List;
import java.util.Optional;


public interface IFacturaServices {
  public List <Factura> findAll();

   public void save(Factura Persona);

   public Optional <Factura> findById(Long id);

   public void delete(long id);  
}
