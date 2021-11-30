package com.reservaya.reservams.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Pasadia {

    @Id
    private String idpas;
    private String idpasadia;
    private String nombreHotel;
    private String ciudad;
    private Date fechaIn;
    private Integer valorPasadia;

    public Pasadia(String idpas, String idpasadia, String nombreHotel, String ciudad, Date fechaIn, Integer valorPasadia) {
        this.idpas = idpas;
        this.idpasadia = idpasadia;
        this.nombreHotel = nombreHotel;
        this.ciudad = ciudad;
        this.fechaIn = fechaIn;
        this.valorPasadia = valorPasadia;
    }

    public String getIdpas() {
        return idpas;
    }

    public void setIdpas(String idpas) {
        this.idpas = idpas;
    }

    public String getIdpasadia() {
        return idpasadia;
    }

    public void setIdpasadia(String idpasadia) {
        this.idpasadia = idpasadia;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Integer getValorPasadia() {
        return valorPasadia;
    }

    public void setValorPasadia(Integer valorPasadia) {
        this.valorPasadia = valorPasadia;
    }
}