/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;


import com.example.demo.entity.Tickets;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author juzz_
 */
public interface ITicketsService {
    
    public List <Tickets> findAll();

   public void save(Tickets ticket);

   public Optional <Tickets> findById(Long id);

   public void delete(long id);
    
    
}
