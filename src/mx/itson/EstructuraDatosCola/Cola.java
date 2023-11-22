/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.EstructuraDatosCola;

import java.util.ArrayList;
import java.util.List;
import mx.itson.EstructuraDatosCola.entities.Car;

/**
 *
 * @author luisd
 */
public class Cola {

    private List<Car> cola = new ArrayList<Car>();
    private int tamannio;
    private int frente;
    private int ultimo;

    public void createCola(int _tamannio) {

        this.setTamannio(_tamannio);
        this.setFrente(0);
        this.setUltimo(-1);

    }

    public boolean isVacia() {

        if (this.getFrente() > this.getUltimo()) {
            return true;
        }

        return false;
    }

    public boolean isLlena() {

        if (this.getUltimo() == this.getTamannio() - 1) {
            return true;
        }

        return false;
    }

    public void pop() {

        if (isVacia()) {

            System.out.println("Cola vacía, no se pueden eliminar más elementos de la cola ...");

        } else {

            this.setFrente(this.getFrente() + 1);

        }

    }

    public void push(Car _valor) {

        if (isLlena()) {

            System.out.println("Cola llena, no se pueden agregar el carro con el id " + _valor.getId() + " a la cola ...");

        } else {

            int vecesPasado = 0;
            if (!isVacia()) {
                for (int i = 0; i <= this.getUltimo(); i++) {
                    if (this.cola.get(i).getId() == _valor.getId()) {
                        vecesPasado++;
                    }
                }

            }
            if (vecesPasado < 2) {
                this.ultimo++;
                this.cola.add(_valor);
            } else {
                System.out.println("El carro ya llego a su limite");
            }

        }

    }

    public void imprimir() {

        if (!this.isVacia()){
        System.out.println("\n\n- Cola -");

        for (int _indice = this.getFrente(); _indice <= this.getUltimo(); _indice++) {
            System.out.println("[" + this.getCola().get(_indice).getId() + "] Matricula: " + this.getCola().get(_indice).getMatricula() + " Modelo: " + this.getCola().get(_indice).getModelo());
        }
        }else{
            System.out.println("\n \n La cola esta vacia");
        }

    }

    public void evaluar() {
        List<Car> auxiliar = this.cola;
        List<Integer> indice = new ArrayList();
        int datosBorrados = 0;

        for (int _indice = this.getFrente(); _indice <= this.getUltimo(); _indice++) {

            if (this.cola.get(_indice) != null) {

                if (this.cola.get(_indice).isLegalizado()
                        && this.cola.get(_indice).getMatricula() != null
                        && this.cola.get(_indice).getMarca() != null
                        && this.cola.get(_indice).getModelo() != null
                        && this.cola.get(_indice).getAño() != null) {

                    System.out.println("[ " + this.cola.get(_indice).getId() + " ] El carro " + this.cola.get(_indice).getMatricula() + " paso la verificación");

                } else {
                    System.out.println("El carro con  el id [" + this.cola.get(_indice).getId() + "]  no paso la verificación, este carro sera eliminado de la cola");
                    indice.add(_indice);
                    datosBorrados++;

                }

            }

        }
        int i = 0;
        for (int a : indice) {
            auxiliar.remove(a - i);
            i++;
        }
        this.ultimo = (this.ultimo - datosBorrados);

        this.cola = auxiliar;
    }

    /**
     * @return the tamannio
     */
    public int getTamannio() {
        return tamannio;
    }

    /**
     * @return the cola
     */
    public List<Car> getCola() {
        return cola;
    }

    /**
     * @return the ultimo
     */
    public int getUltimo() {
        return ultimo;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(List<Car> cola) {
        this.cola = cola;
    }

    /**
     * @param tamannio the tamannio to set
     */
    public void setTamannio(int tamannio) {
        this.tamannio = tamannio;
    }

    /**
     * @return the frente
     */
    public int getFrente() {
        return frente;
    }

    /**
     * @param frente the frente to set
     */
    public void setFrente(int frente) {
        this.frente = frente;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

}
