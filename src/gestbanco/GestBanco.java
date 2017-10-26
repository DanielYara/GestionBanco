/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestbanco;

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
        Gerente manager1 = new Gerente("Juan Perez");
        Cliente cliente1 = new Cliente("John Yepes");
        Cliente cliente2 = new Cliente("Emilia Espinoza");
        Cuenta c1 = new Cuenta(124, 300.0);
        Cuenta c2 = new Cuenta(125, 350.0);
        cliente1.añadCuentas(c1);
        cliente2.añadCuentas(c2);
        manager1.añadClientes(cliente1);
        manager1.añadClientes(cliente2);
        
        
    }
    
}
