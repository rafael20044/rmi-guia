package dev.rafael.imc.rmi;

import dev.rafael.imc.rmi.net.Servidor;

/**
 *
 * @author Rafael Barragan Acevedo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
            System.out.println("==================================================");
            System.out.println(" Servidor RMI (LipeRMI) iniciado en puerto: 9007 ");
            System.out.println(" Esperando conexiones de clientes...              ");
            System.out.println("==================================================");
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
