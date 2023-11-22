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
    private String matricula;
    private String modelo;
    private boolean legalizado;
    private String marca;
    private String año;
    private String kilometraje;

    /**
     * Constructor de Car
     * 
     * @param matricula matricula del carro
     * @param modelo modelo del carro
     * @param legalizado legalidad del carro
     * @param marca marca del carro
     * @param año año del carro
     * @param kilometraje kilometraje del carro
     * 
     * 
     */
    public Car(String matricula, String modelo, boolean legalizado, String marca, String año, String kilometraje) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.legalizado = legalizado;
        this.marca = marca;
        this.año = año;
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
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
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
    
    
}
