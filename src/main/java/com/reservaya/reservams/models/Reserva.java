package com.reservaya.reservams.models;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Reserva {
    @Id
    private String idres;
    private String nombreHotel;
    private String ciudad;
    private Date fechaIn;
    private Date fechaOut;
    private String habitacion;
    private Integer valorHabitacion;
    private String tipo;

    public Reserva(String idres,String nombreHotel, String ciudad, Date fechaIn, Date fechaOut, String habitacion, Integer valorHabitacion,String tipo) {
        this.idres=idres;
        this.nombreHotel = nombreHotel;
        this.ciudad = ciudad;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.habitacion = habitacion;
        this.valorHabitacion = valorHabitacion;
        this.tipo=tipo;
    }

    public String getIdres() {
        return idres;
    }

    public void setIdres(String idres) {
        this.idres = idres;
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

    public Date getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(Date fechaOut) {
        this.fechaOut = fechaOut;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public Integer getValorHabitacion() {
        return valorHabitacion;
    }

    public void setValorHabitacion(Integer valorHabitacion) {
        this.valorHabitacion = valorHabitacion;
    }

    public String gettipo() {
        return tipo;
    }

    public void gettipo(String tipo) {
        this.tipo = tipo;
    }
}
