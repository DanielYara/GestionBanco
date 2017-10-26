/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import gestbanco.*;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Daniel y Cielo
 */
public class Vista {
    public static String readFileName() {
	String fileName = "Banco.csv";
	return fileName;
    }
    
    public static String mostrarDatos(Banco banco){
        String r = null, r2 = null, r3 = null, r4 = null, r5 = null, r6 = null, r7 = null, r8 = null;
        String r1 = banco.getName();
        for(Gerente ger : banco.listGerentes()){
            r2 = ger.getName();
            for(int i = 0; i < ger.getClientes().size(); i++){
                r3 = ger.getClientes().get(i).getName();
                for(int k = 0; k < ger.getClientes().get(i).getCuentas().size(); k++){
                    r4 = String.valueOf(ger.getClientes().get(i).getCuentas().get(k).getId());
                    r5 = String.valueOf(ger.getClientes().get(i).getCuentas().get(k).getCredito());
                    r6 =  "Cuenta: " + r4 + ", Credito : " + r5 + "\n";
                }
                r7 = "Cliente: " + r3 + "\n " + r6;
            }
            r8 = "Gerente: " + r2 + "\n " + r7;
        }
        r = "Banco: " + r1 + "\n " + r8;
        return r;
    }
}
