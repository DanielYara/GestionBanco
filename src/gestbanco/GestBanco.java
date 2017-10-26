/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestbanco;
import gestionmemoria.CreacionArchivo;
import gestionmemoria.CargaDatos;
import vista.Vista;
import java.io.*;
import java.util.ArrayList;

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
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Banco bank = new Banco("Unal");
        CreacionArchivo f = new CreacionArchivo();
        String ger1 = "Juan Perez";
        bank.añadGerente(ger1);
        String client1 = "Fernando Castro";
        String client2 = "Manuel Yepes";
        bank.añadCliente(client1, ger1);
        bank.añadCliente(client2, ger1);
        int id1 = 12345;
        double cred1 = 550000;
        int id2 = 12346;
        double cred2 = 870000;
        bank.añadCuenta(id1, cred1, client1);
        bank.añadCuenta(id2, cred2, client2);
        
        File fl = f.crearArchivo();
        f.rellArchivo(bank, fl);
        
        String filename = Vista.readFileName();
        Banco n = CargaDatos.leerArchivo(filename);
        Vista.mostrarDatos(n);
    }
}
