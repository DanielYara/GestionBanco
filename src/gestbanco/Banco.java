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
    private ArrayList<Gerente> gerentes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;

    public Banco(String name) {
        this.name = name;
        this.gerentes = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }
    
    public boolean añadGerente(String name){
        Gerente g = new Gerente(name);
        return this.gerentes.add(g);
    }
    
    public boolean añadCliente(String nomCliente, String nomGerente){
        Cliente cliente = new Cliente(nomCliente);
        Gerente aux = null;
        boolean r = false;
        for(int i = 0; i < this.gerentes.size(); i++){
            if(this.gerentes.get(i).getName().equals(nomGerente)){
                aux = new Gerente(nomGerente);
                cliente.setGerente(aux);
                this.clientes.add(cliente);
                r = this.gerentes.get(i).añadClientes(cliente);
                break;
            }
        }
        return r;
    }
    
    public boolean añadCuenta(int id, double credito, String nomClient){
        Cliente aux = null;
        Cuenta ct = new Cuenta(id, credito);
        boolean r = false;
        for(int i = 0; i < this.clientes.size(); i++){
            if(this.clientes.get(i).getName().equals(nomClient)){
                aux = new Cliente(nomClient);
                ct.setDueño(aux);
                this.clientes.get(i).añadCuentas(ct);
                r = this.cuentas.add(ct);
                break;
            }
        }
        return r;
    }
    
    public ArrayList<Gerente> listGerentes(){
        return this.gerentes;
    }
    
    public ArrayList<Cliente> listClientes(){
        return this.clientes;
    }
    
    public ArrayList<Cuenta> listCuentas(){
        return this.cuentas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    
    
}
