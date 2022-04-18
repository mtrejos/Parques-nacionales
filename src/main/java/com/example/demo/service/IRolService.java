/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;


import com.example.demo.entity.Roles;
import java.util.List;
import java.util.Optional;


public interface IRolService {
   public List <Roles> findAll();

   public void save(Roles rol);

   public Optional <Roles> findById(Long id);

   public void delete(long id);  
}
