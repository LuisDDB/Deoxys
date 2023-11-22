/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.EstructuraDatosCola.entities;

/**
 *
 * @author luisd
 */
public class Car {
    private int id;
    private String matricula;
    private String modelo;
    private boolean legalizado;
    private String marca;
    private String year;
    private String kilometraje;

    /**
     * Constructor
     * @param id id del carro
     * @param matricula matricula del carro
     * @param modelo modelo del carro
     * @param legalizado legalidad del carro
     * @param marca marca del carro
     * @param año year del carro
     * @param kilometraje 
     */
    public Car(int id, String matricula, String modelo, boolean legalizado, String marca, String año, String kilometraje) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.legalizado = legalizado;
        this.marca = marca;
        this.year = año;
        this.kilometraje = kilometraje;
    }

    
    
    

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the legalizado
     */
    public boolean isLegalizado() {
        return legalizado;
    }

    /**
     * @param legalizado the legalizado to set
     */
    public void setLegalizado(boolean legalizado) {
        this.legalizado = legalizado;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the year
     */
    public String getAño() {
        return year;
    }

    /**
     * @param año the year to set
     */
    public void setAño(String año) {
        this.year = año;
    }

    /**
     * @return the kilometraje
     */
    public String getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
}
