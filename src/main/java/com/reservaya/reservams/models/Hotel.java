package com.reservaya.reservams.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Hotel {

    @Id
    private String idhotel;
    private String nombreHotel;
    private String ciudad;
    private String cantidadHabitaciones;
    private Integer pasadia;
    private Integer valorHabitacion;
    private Integer valorPasadia;

    public Hotel(String idhotel, String nombreHotel, String ciudad, String cantidadHabitaciones, Integer pasadia, Integer valorHabitacion, Integer valorPasadia) {
        this.idhotel = idhotel;
        this.nombreHotel = nombreHotel;
        this.ciudad = ciudad;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.pasadia = pasadia;
        this.valorHabitacion = valorHabitacion;
        this.valorPasadia = valorPasadia;
    }

    public String getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(String idhotel) {
        this.idhotel = idhotel;
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

    public String getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(String cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getPasadia() {
        return pasadia;
    }

    public void setPasadia(Integer pasadia) {
        this.pasadia = pasadia;
    }

    public Integer getValorHabitacion() {
        return valorHabitacion;
    }

    public void setValorHabitacion(Integer valorHabitacion) {
        this.valorHabitacion = valorHabitacion;
    }

    public Integer getValorPasadia() {
        return valorPasadia;
    }

    public void setValorPasadia(Integer valorPasadia) {
        this.valorPasadia = valorPasadia;
    }
}
