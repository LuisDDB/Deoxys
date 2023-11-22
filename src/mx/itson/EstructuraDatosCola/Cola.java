/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.EstructuraDatosCola;

import mx.itson.EstructuraDatosCola.entities.Car;

/**
 *
 * @author luisd
 */
public class Cola {

    Car [] cola;
    int tamannio;
    int frente;
    int ultimo;

    public void createCola(int _tamannio) {

        this.tamannio = _tamannio;
        this.cola = new Car[_tamannio];
        this.frente = 0;
        this.ultimo = -1;
      
    }

    public boolean isVacia() {

        if (this.frente > this.ultimo) {
            return true;
        }

        return false;
    }

    public boolean isLlena() {

        if (this.ultimo == this.tamannio - 1) {
            return true;
        }

        return false;
    }

    public void pop() {

        if (isVacia()) {

            System.out.println("Cola vacía, no se pueden eliminar más elementos de la cola ...");

        } else {

            this.frente++;

        }

    }

    public void push(Car _valor) {

        if (isLlena()) {

            System.out.println("Cola llena, no se pueden agregar el valor " + _valor + " a la cola ...");

        } else {

            this.ultimo++;
            this.cola[this.ultimo] = _valor;

        }

    }

    public void imprimir() {

        System.out.println("- Cola -");

        for (int _indice = this.frente; _indice <= this.ultimo; _indice++) {
            System.out.println("[" + this.cola[_indice] + "]");
        }

    }
}
