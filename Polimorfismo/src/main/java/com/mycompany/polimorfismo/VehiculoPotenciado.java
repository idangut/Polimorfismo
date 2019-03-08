package com.mycompany.polimorfismo;

/**
 * @description: Clase que contiene las variables del vehiculo potenciada
 * @author gtior
 */
public abstract class VehiculoPotenciado extends Vehiculo {
    
    protected String tipoCombustible;

    /**
     * @description: Constructor que inicializa las variables
     * @param marca
     * @param modelo 
     */
    public VehiculoPotenciado(String marca, String modelo, String tipoCombustible) {
        super(marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }
    
    
    /**
     * @description metodo propio de impresion de la clase VehiculoPotenciado
     */
    protected void imprimirPotenciado(){
        System.out.println("Vehiculo Potenciado:");
        System.out.println("Tipo de Combustible: "+ tipoCombustible);
    }
    /**
     * @desription: Obtiene el valor
     * @return 
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    
    /**
     * @description: asigna un valor
     * @param tipoCombustible 
     */
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    
    
    
    
}
