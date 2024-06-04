package com.celvesa.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cervecerias")
public class Cerveceria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombre_cerveceria")
    private String nombre_cerveceria;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "municipio")
    private String municipio;

    @Column(name= "nomenclatura")
    private String nomenclatura;

    @Column(name = "marca_cerveza")
    private String marca_cerveza;

    @Column(name = "cantidad_stock")
    private long cantidad_stock;

    public Cerveceria(){

    }

    public Cerveceria(String nombre_cerveceria, String departamento, String municipio, String nomenclatura, String marca_cerveza, long cantidad_stock){
        this.nombre_cerveceria= nombre_cerveceria;
        this.departamento = departamento;
        this.municipio = municipio;
        this.nomenclatura = nomenclatura;
        this.marca_cerveza= marca_cerveza;
        this.cantidad_stock= cantidad_stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_cerveceria() {
        return nombre_cerveceria;
    }

    public void setNombre_cerveceria(String nombre_cerveceria) {
        this.nombre_cerveceria = nombre_cerveceria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getMarca_cerveza() {
        return marca_cerveza;
    }

    public void setMarca_cerveza(String marca_cerveza) {
        this.marca_cerveza = marca_cerveza;
    }

    public long getCantidad_stock() {
        return cantidad_stock;
    }

    public void setCantidad_stock(long cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }

    @Override
    public String toString() {
        return "Cerveceria [id=" + id + ", nombre_cerveceria=" + nombre_cerveceria + ", departamento=" + departamento
                + ", municipio=" + municipio + ", nomenclatura=" + nomenclatura + ", marca_cerveza=" + marca_cerveza
                + ", cantidad_stock=" + cantidad_stock + "]";
    }

    
}
