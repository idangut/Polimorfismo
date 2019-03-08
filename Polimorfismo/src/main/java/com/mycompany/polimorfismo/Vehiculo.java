
package com.mycompany.polimorfismo;

import Interfaces.IVehiculo;

/**
 * @description: Clase que coniene los atributos de los vehiculo
 * @author gtior
 */
public class Vehiculo implements IVehiculo{
    
    protected String marca;
    protected String modelo;

    /**
     * @description: Constructor que inicializa las variables
     * @param marca
     * @param modelo 
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    /**
     * 
     */
    protected void imprimir(){
        System.out.println("Esta clase imprimir los datos de un vehiculo: ");
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }

    /**
     * description: Obtiene un valor
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @description: asigna un valor
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @description: obtiene un valor
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @description: asigna un valor.
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @description Metodo que implemeta la Interfaz
     */
    @Override
    public void imprimirPrueba() {
        System.out.println("Implemento el metodo de la Interfaz");
    }
    
    
    

    
}
