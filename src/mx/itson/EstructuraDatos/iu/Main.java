/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.EstructuraDatos.iu;

import mx.itson.EstructuraDatosCola.entities.Car;
import mx.itson.EstructuraDatosCola.Cola;
/**
 *
 * @author luisd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Car carro1 = new Car("AAA-AFZ", "Ferrari", true, "Ferrari", "2004", "15000 KM");
       Car carro2 = new Car("AGA-CYZ", "Nissan", true, "Alianza Renault-Nissan-Mitsubishi", "1954", "54201 KM");
       Car carro3 = new Car("CZA-DEZ", "Rolls Royce", true, "BMW Group", "2000", "18000 KM");
       Car carro4 = new Car("DFA-DKZ", "BMW", true, "BMW Group", "2023", "100 KM");
       Car carro5 = new Car("DFA-DKZ", "Ford", true, "Ford", "2014", "15000 KM");
       Car carro6 = new Car("DLA-DSZ", "London Taxi C.", true, "Geely", "2010", "51000 KM");
       Car carro7 = new Car("EUA-FPZ", "Lotus", true, "Geely", "2012", "53000 KM");
       Car carro8 = new Car("FRA-FWZ", "Polestar", true, "Geely", "2004", "5000");
       Car carro9 = new Car("FXA-GFZ", "Nissan", true, "Alianza Renault-Nissan-Mitsubishi", "1999", "7500 KM");
       Car carro10 = new Car("VTA-WKZ", "Mini", true, "BMW Group", "2004", "5000 KM");
       System.out.println(carro1);
        Cola cola = new Cola();
        cola.createCola(10);
        cola.push(carro1);
        cola.push(carro2);
        cola.push(carro3);
        cola.push(carro4);
        cola.push(carro5);
        cola.push(carro6);
        cola.push(carro7);
        cola.push(carro8);
        cola.push(carro9);
        cola.push(carro10);
        
    }
    
}
