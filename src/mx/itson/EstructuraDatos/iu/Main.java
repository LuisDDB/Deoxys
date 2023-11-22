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

        Car carro1 = new Car(1, "AAA-AFZ", "Ferrari", true, "Ferrari", "2004", "15000 KM");
        Car carro2 = new Car(2, "AGA-CYZ", "Nissan", true, "Alianza Renault-Nissan-Mitsubishi", "1954", "54201 KM");
        Car carro3 = new Car(3, "CZA-DEZ", "Rolls Royce", true, "BMW Group", "2000", "18000 KM");
        Car carro4 = new Car(4, null, "BMW", true, "BMW Group", "2023", "100 KM");
        Car carro5 = new Car(5, "DFA-DKZ", "Ford", false, "Ford", "2014", "15000 KM");
        Car carro6 = new Car(6, "DLA-DSZ", "London Taxi C.", true, "Geely", "2010", "51000 KM");
        Car carro7 = new Car(7, "EUA-FPZ", "Lotus", true, "Geely", "2012", "53000 KM");
        Car carro8 = new Car(8, "FRA-FWZ", "Polestar", true, "Geely", "2004", "5000");
        Car carro9 = new Car(9, "FXA-GFZ", "Nissan", true, "Alianza Renault-Nissan-Mitsubishi", "1999", "7500 KM");
        Car carro10 = new Car(10, "VTA-WKZ", "Mini", true, "BMW Group", "2004", "5000 KM");

        Cola cola = new Cola();
        cola.createCola(10);
        cola.push(carro1);
        cola.push(carro1);
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

        System.out.println("\n Esta es la cola actual");
        cola.imprimir();

        System.out.println(" \n\n Evaluación de los coches");
        cola.evaluar();

        System.out.println("\n\n Esta es la cola actual");
        cola.imprimir();


    }

}
