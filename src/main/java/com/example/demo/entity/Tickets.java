/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Tickets")
public class Tickets implements Serializable {
     @Id
    private int IdTicket;
    
    private String fecha;
    
    private String NomParqueNacional;
    
    private int CostoEntrada;

    public int getIdTicket() {
        return IdTicket;
    }

    public void setIdTicket(int IdTicket) {
        this.IdTicket = IdTicket;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNomParqueNacional() {
        return NomParqueNacional;
    }

    public void setNomParqueNacional(String NomParqueNacional) {
        this.NomParqueNacional = NomParqueNacional;
    }

    public int getCostoEntrada() {
        return CostoEntrada;
    }

    public void setCostoEntrada(int CostoEntrada) {
        this.CostoEntrada = CostoEntrada;
    }
    
             
    
}
