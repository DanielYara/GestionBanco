/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmemoria;
import java.io.*;

/**
 *
 * @author Daniel y Cielo
 */
public class CreacionArchivo {
    public File crearArchivo(){
        File f = new File("Banco.txt");
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
}
