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
        clientes = new ArrayList<>();
    }
    
}
