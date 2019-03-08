package com.mycompany.polimorfismo;

/**
 * @description: Clase que contiene los atributos de carro
 * @author gtior
 */
public class Carro extends VehiculoPotenciado {
    
    private String tamanoMotor;

    
    /**
     * @description Constructor que inicializa las variables
     * @param marca
     * @param modelo
     * @param tipoCombustible
     * @param tamanoMotor 
     */
    public Carro(String marca, String modelo, String tipoCombustible, String tamanoMotor) {
        super(marca, modelo, tipoCombustible);
        this.tamanoMotor = tamanoMotor;
    }
    
    /**
     * @description metodo especializado por la clase Carro que viene de la clase Vehiculo
     */
    @Override
    public void imprimir(){
        System.out.println("Esta funcion imprime los datos de un Carro: ");
        System.out.println("Tipo Combustible: " + tipoCombustible + 
                "\nTamaño Motor: " + tamanoMotor + 
                "\nMarca:"+ marca + 
                "\nModelo: " + modelo);
    }

    /**
     * @description metodo especializado por la clase Carro que viene de la clase VehiculoPotenciado
     */
    @Override
    protected void imprimirPotenciado() {
        System.out.println("Vehiculo Potenciado: ");
        System.out.println("Tamaño Motor: " + tamanoMotor + 
                "\nTipo de Combustible: " + tipoCombustible);
    }

    /**
     * @description Metodo de impresion que especializa de la Interfaz IVehiculo
     */
    @Override
    public void imprimirPrueba() {
        System.out.println("Imprimo desde carro especializando desde la Interfaz");
    }
    
    /**
     * @description metodo propio de impresion de la clase Carro
     */
    public void imprimirCarroVehiculo(){
        System.out.println("Tamaño del Motor: ");
        System.out.println(tamanoMotor);
    }
    /**
     * @description: obtiene un valor
     * @return 
     */
    public String getTamanoMotor() {
        return tamanoMotor;
    }
   
    /**
     * @description: asigna un valor
     * @param tamañoMotor 
     */
    public void setTamañoMotor(String tamanoMotor) {
        this.tamanoMotor = tamanoMotor;
    }
    
    
    
    
    
}
