/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;


import com.example.demo.entity.Roles;
import com.example.demo.repository.RolRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService implements IRolService {
@Autowired
    private RolRepository RolRepository;

    @Override
    public List<Roles> findAll() {
      return (List<Roles>) RolRepository.findAll();
    }

    @Override
    public void save(Roles rol) {
       RolRepository.save(rol);
    }

    @Override
    public Optional<Roles> findById(Long id) {
       return RolRepository.findById(id);  
    }

    @Override
    public void delete(long id) {
       RolRepository.deleteById(id);
    }
      

}
