/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;
import static sanitas.Creation.*;

/**
 *
 *@author Serge Dogny
 */
public class ProgrammPrincipal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws OperationInvalideException
     */
    public static void main(String[] args) throws IOException, OperationInvalideException {
        
        if (args.length != 4){
            System.out.println("Nombre d'arguments invalide...");
        }else { 
            traiterDemande(args[0], args[1], args[2], args[3]);
        } 
    }
}
       