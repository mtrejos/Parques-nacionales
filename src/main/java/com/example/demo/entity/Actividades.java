/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Actividades")
public class Actividades implements Serializable{
    
   @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int IdAcvitidad;
    
    private String nombreActividad;
    private String TipoActividad;
    private String ValorActividad;

    public int getIdAcvitidad() {
        return IdAcvitidad;
    }

    public void setIdAcvitidad(int IdAcvitidad) {
        this.IdAcvitidad = IdAcvitidad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getTipoActividad() {
        return TipoActividad;
    }

    public void setTipoActividad(String TipoActividad) {
        this.TipoActividad = TipoActividad;
    }

    public String getValorActividad() {
        return ValorActividad;
    }

    public void setValorActividad(String ValorActividad) {
        this.ValorActividad = ValorActividad;
    }
    
    
    
}
