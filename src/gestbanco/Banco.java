/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestbanco;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Banco {
    private String name;
    private ArrayList<Persona> personas;
    private ArrayList<Cuenta> cuentas;

    public Banco(String name) {
        this.name = name;
        this.personas = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }
    
    public boolean añadPersona(Persona persona){
        return this.personas.add(persona);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
