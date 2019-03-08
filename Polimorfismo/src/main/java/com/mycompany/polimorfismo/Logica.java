
package com.mycompany.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Clase que contiene la logica del programa
 * @author gtior
 */
public class Logica {
    
    /**
     * ArrayList que contiene todos los datos
     */ 
    List<Vehiculo> vehiculo = new ArrayList();
    
    /**
     * @description Constructor de la clase Logica
     */
    public Logica(){
        datos();
        imprimirDatos();
    }
    
    /**
     * @description metodo para quemar datos en el ArrayList
     */
    private void datos(){
        Vehiculo patineta = new Patineta("Skate Board","2019","Mediano");
        Vehiculo bicicleta = new Bicicleta("Todo Terreno","2018","10");
        Vehiculo carro = new Carro("Renault","2018","Diesel","1200");
        Vehiculo jet = new Jet("Militar Air Force","2020","Corriente","4");
        
        vehiculo.add(patineta);
        vehiculo.add(bicicleta);
        vehiculo.add(carro);
        vehiculo.add(jet);
    }
    
    /**
     * @description Metodo para imprimir los datos del ArrayList
     */
    private void imprimirDatos(){
        
        for (Vehiculo vehiculo1 : vehiculo) {
            if(vehiculo1 instanceof Patineta){
                Patineta pat = (Patineta) vehiculo1;
                pat.imprimir();
                pat.imprimirPatineta();
                pat.imprimirPrueba();
            }else if(vehiculo1 instanceof Jet){
                Jet avion = (Jet) vehiculo1;
                avion.imprimir();
                avion.imprimirJet();
                avion.imprimirPotenciado();
                avion.imprimirPrueba();
            }else if(vehiculo1 instanceof Carro){
                Carro car = (Carro) vehiculo1;
                car.imprimir();
                car.imprimirCarroVehiculo();
                car.imprimirPotenciado();
                car.imprimirPrueba();
            }else if(vehiculo1 instanceof Bicicleta){
                Bicicleta bic = (Bicicleta) vehiculo1;
                bic.imprimir();
                bic.imprimirBicicleta();
                bic.imprimirPrueba();
            }
            
            
        }
    }
    
}
