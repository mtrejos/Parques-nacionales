/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Actividades;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author juzz_
 */
public interface IActividadesServices {
   public List <Actividades> findAll();

   public void save(Actividades Actividades);

   public Optional <Actividades> findById(Long id);

   public void delete(long id);
}
