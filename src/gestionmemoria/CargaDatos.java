/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmemoria;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import gestbanco.Banco;

/**
 *
 * @author Daniel y Cielo
 */
public class CargaDatos {
    
    public static Banco leerDatos(Scanner sc){
        Banco newBank = null;
        
        String banco = sc.next().trim();
        String gerente = sc.next().trim();
        String cliente = sc.next().trim();
        String id = sc.next().trim();
        int i = Integer.parseInt(id);
        String credito = sc.next().trim();
        float cr = Float.parseFloat(credito);
        
                
        newBank = new Banco(banco);
        newBank.añadGerente(gerente);
        newBank.añadCliente(cliente, gerente);
        newBank.añadCuenta(i, cr, cliente);
                    
        return newBank;
    }
    
    public static Banco leerArchivo(String fileName) {
        Banco n = null;
	Scanner sc;
	try {
            sc = new Scanner(new File(fileName));
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                n = leerDatos(sc);
            }
	} catch (FileNotFoundException e) {
            System.out.println("File not found -- " + fileName);
            e.printStackTrace();
	}
        return n;
    }
    
    
}
