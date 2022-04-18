/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.Tickets;
import org.springframework.data.repository.CrudRepository;


public interface TicketsRepository extends CrudRepository<Tickets,Long>  {
    
}
