package com.mycompany.polimorfismo;

/**
 * @description: Clase que contiene las variables de la bicicleta
 * @author gtior
 */
public class Bicicleta extends Vehiculo {
    
    private String numeroCambios;

    /**
     * @description: Constructor que inicializa las variables
     * @param marca
     * @param modelo 
     */
    public Bicicleta(String marca, String modelo, String numeroCambios) {
        super(marca, modelo);
        this.numeroCambios = numeroCambios;
    }
    /**
     * @description metodo especializado por la clase bicleta que viene de la clase vehiculo
     */
    @Override
    public void imprimir(){
        System.out.println("Esta funcion imprime los datos de una biclicleta: ");
        System.out.println("Marca:" + marca + 
                "\nModelo: " + modelo + 
                "\nNumero Cambios: " + numeroCambios);
    }

    /**
     * @description Metodo para imprimir que especializa desde la Interfaz IVehiulo
     */
    @Override
    public void imprimirPrueba() {
        System.out.println("Imprimo desde Carro especializando desde la Interfaz");
    }
 
    /**
     * @description metodo propio de impresion de la clase Bicicleta
     */
    public void imprimirBicicleta(){
        System.out.println("Datos Bicicleta:");
        System.out.println("Numero Cambios: " + numeroCambios);
    }
    /**
     * @description: obtiene el valor
     * @return numeroCambios
     */
    public String getNumeroCambios() {
        return numeroCambios;
    }
    
    /**
     * @description: asigna un valor
     * @param numeroCambios 
     */
    public void setNumeroCambios(String numeroCambios) {
        this.numeroCambios = numeroCambios;
    }
    
    
    
    
    
}
