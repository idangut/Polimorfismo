
package com.mycompany.polimorfismo;

/**
 * @description: Clase que contiene los atributos de patineta
 * @author gtior
 */
public class Patineta extends Vehiculo {
    
    private String tamano;
    
    
    /**
     * @description: Constructor que iniciaiza la variable
     * @param marca
     * @param modelo 
     */
    public Patineta(String marca, String modelo, String tamano) {
        super(marca, modelo);
        this.tamano = tamano;
    }

    /**
     * @description metodo de impresion especializado por la clase Patineta que viene de la clase Vehiculo
     */
    @Override
    public void imprimir(){
        System.out.println("Este metodo imprime los datos de una patineta: ");
        System.out.println("Marca: " + marca + 
                "\nModelo: " + modelo + 
                "\nTamaño: " + tamano);
    }

    /**
     * @description metodo de impresion que especializa de la interfaz IVehiculo
     */
    @Override
    public void imprimirPrueba() {
        System.out.println("Imprimo metodo especializado de la Interfaz");
    }
    
    /**
     * @description metodo propio de impresion de la clase Patineta
     */
    protected void imprimirPatineta(){
        System.out.println("Patineta: ");
        System.out.println("Tamaño: " + tamano);
    }
    /**
     * @description Getters and Setters
     * @return tamano 
     */
    public String getTamano() {
        return tamano;
    }

    /**
     * 
     * @param tamano 
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    
    
    
}
