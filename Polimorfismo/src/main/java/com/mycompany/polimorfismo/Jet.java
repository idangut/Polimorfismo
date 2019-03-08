
package com.mycompany.polimorfismo;

/**
 * @description: Clase que contiene las variables del Jet
 * @author gtior
 */
public class Jet extends VehiculoPotenciado{
    
    private String numeroTurbinas;

    /**
     * @description Constructor que inicializa las variables
     * @param marca
     * @param modelo
     * @param tipoCombustible
     * @param numeroTurbinas 
     */
    public Jet(String marca, String modelo, String tipoCombustible, String numeroTurbinas) {
        super(marca, modelo, tipoCombustible);
        this.numeroTurbinas = numeroTurbinas;
    }
    
    /**
     * @description metodo especializado por la clase Jet que viene de la clase Vehiculo
     */
    @Override
    public void imprimir(){
        System.out.println("Esta funcion imprime los datos de un Jet: ");
        System.out.println("Marca: " + marca + 
                "\nNumero Turbinas: " + numeroTurbinas + 
                "\nModelo: "+ modelo);
    }

    /**
     * @description metodo especializado por la clase Jet que viene de la clase VehiculoPotenciando
     */
    @Override
    protected void imprimirPotenciado() {
        System.out.println("Jet Potenciado:");
        System.out.println("Numero Turbinas: " + numeroTurbinas + ""
                + "\nTipo de Combustible: " + tipoCombustible);
    }
    
    /**
     * @description metodo propio de impresion de la clase Jet
     */
    protected void imprimirJet(){
        System.out.println("Jet: ");
        System.out.println("Numero de Turbinas: " + numeroTurbinas);
    }

    /**
     * @description Metodo de impresion especializado de la Interfaz
     */
    @Override
    public void imprimirPrueba() {
        System.out.println("Imprimo desde Jet especializando de la Interfaz");
    }
    /**
     * @description: obtiene un valor
     * @return numeroTurbinas
     */
    public String getNumeroTurbinas() {
        return numeroTurbinas;
    }

    /**
     * @description: Asigna un valor
     * @param numeroTurbinas 
     */
    public void setNumeroTurbinas(String numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }
    
    
    
    
    
}
