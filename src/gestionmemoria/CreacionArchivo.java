/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmemoria;

import gestbanco.Banco;
import gestbanco.Gerente;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Daniel y Cielo
 */
public class CreacionArchivo {
    public File crearArchivo(){
        File f = new File("Banco.csv");
        if(!(f.exists())){
            try{
                f.createNewFile();
                System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
            } catch(IOException ex){
                System.out.println("No se pudo crear el archivo.");
            }
        }
        return f;
    }
    
    public void rellArchivo(Banco bank, File fl) throws FileNotFoundException{
        ArrayList<String> z = new ArrayList<>();
        String r = null;
        for(Gerente ger : bank.listGerentes()){
            for(int i = 0; i < ger.getClientes().size(); i++){
                for(int k = 0; k < ger.getClientes().get(i).getCuentas().size(); k++)
                    r = bank.getName() + ", " + ger.getName() + ", " + ger.getClientes().get(i).getName() + ", "
                        + ger.getClientes().get(i).getCuentas().get(k).getId() + ", " + ger.getClientes().get(i).getCuentas().get(k).getCredito() + ",";
                    z.add(r);
            }
        }
        
        PrintStream ps = new PrintStream(fl);
        for(String lt : z){
            ps.println(lt);
        }
    }
}
