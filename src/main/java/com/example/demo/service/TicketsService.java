/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Tickets;
import com.example.demo.repository.TicketsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketsService implements ITicketsService{
  
    @Autowired
    private TicketsRepository ticketRepository;

    @Override
    public List<Tickets> findAll() {
        return (List<Tickets>) ticketRepository.findAll();
    }

    @Override
    public void save(Tickets ticket) {
       ticketRepository.save(ticket);
    }

    @Override
    public Optional<Tickets> findById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public void delete(long id) {
       ticketRepository.deleteById(id);
    }
    
}
