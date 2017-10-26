/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestbanco;
import gestionmemoria.CreacionArchivo;
import java.io.*;

/*
Realizar un programa que permita gestionar la información de un banco de acuerdo
al diseño presentado. Se debe garantizar que los datos persisten en memoria 
secundaria. Adicionar el atributo name a la clase Bank.
Es decir, puedo ejecutar el programa, almacenar información y posteriormente en
ejecuciones posteriores recuperarla. El código debe coincidir con el diseño
*/
/**
 *
 * @author Estudiante
 */
public class GestBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco bank = new Banco("Unal");
        CreacionArchivo f = new CreacionArchivo();
        String ger1 = "Juan Perez";
        bank.añadGerente(ger1);
        String client1 = "Fernando Castro";
        String client2 = "Manuel Yepes";
        bank.añadCliente(client1, ger1);
        bank.añadCliente(client2, ger1);
        int id = 12345;
        double cred = 550000;
        bank.añadCuenta(id, cred, client1);
        
        File fl = null;
        fl = f.crearArchivo();
        
    }
    
}
