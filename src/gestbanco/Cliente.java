/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestbanco;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Persona{
    private Gerente gerente = null;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String name) {
        super(name);
        this.cuentas = new ArrayList<>();
    }
    
    public boolean añadCuentas(Cuenta cuenta){
        Cliente aux = new Cliente(super.name);
        cuenta.setDueño(aux);
        return this.cuentas.add(cuenta);
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
