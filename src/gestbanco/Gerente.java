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
public class Gerente extends Persona{
    private ArrayList<Cliente> clientes;

    public Gerente(String name) {
        super(name);
        this.clientes = new ArrayList<>();
    }
    
    public boolean añadClientes(Cliente cliente){
        Gerente aux = new Gerente(super.name);
        cliente.setGerente(aux);
        return this.clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
