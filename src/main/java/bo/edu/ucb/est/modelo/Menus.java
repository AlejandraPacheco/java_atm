/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PACHECO
 */
public class Menus {
    
    public void saldo(List<Cuenta> cuentas){
        Scanner sc = new Scanner(System.in);
	    System.out.println("\n****** Cuentas disponibles ******");
	    System.out.println("=================================");
	    	try {
                    int i;
                    for ( i = 0; i < cuentas.size(); i++) {
                        System.out.println(i+1+". "+cuentas.get(i).getNumCuenta()+" "+cuentas.get(i).getTipo()
                        +" ("+cuentas.get(i).getMoneda()+")");
                        //i++;
                    }
                    System.out.println("=================================");
                    System.out.print("Elija una cuenta: ");
                    int opcion=sc.nextInt();
                    while (opcion<1 || opcion>i){
                        System.out.print("Elija una cuenta: "); 
                        opcion=sc.nextInt();
                        }
                    for ( int j = 1; j <= opcion; j++) {
                        if(j==opcion){
                            Cuenta cuenta=cuentas.get(j-1);
                            System.out.println("\nInformacion de la cuenta");
                            System.out.println("Cuenta "+cuenta.getNumCuenta());
                            System.out.println(cuenta.getTipo());
                            System.out.println(cuenta.getSaldo()+" "+cuenta.getMoneda());
                        }
	            }
                }catch (Exception e) {
	                System.out.println("Error en el elemento ingresado.");
	        }
            }
    
    public void retirar(List<Cuenta> cuentas){
	Scanner sc = new Scanner(System.in);
        System.out.println("\n****** Cuentas disponibles ******");
        System.out.println("=================================");
            try {
                int i;
                for ( i = 0; i < cuentas.size(); i++) {
                    System.out.println(i+1+". "+cuentas.get(i).getNumCuenta()+" "+cuentas.get(i).getTipo()
                    +" ("+cuentas.get(i).getMoneda()+")");
                    //i++;
                }
                System.out.println("=================================");
                System.out.print("Elija una cuenta: ");
                int opcion=sc.nextInt();
                while (opcion<1 || opcion>i){
                    System.out.print("Elija una cuenta: "); 
                    opcion=sc.nextInt();
                    }
                
                for ( int j = 1; j <= opcion; j++) {
                    if(j==opcion){
                        boolean resultado;
                        double monto;
                        Cuenta cuenta=cuentas.get(j-1);
                        System.out.println("\nInformacion de la cuenta");
                        System.out.println("Cuenta "+cuenta.getNumCuenta());
                        System.out.println(cuenta.getTipo());
                        System.out.println(cuenta.getSaldo()+" "+cuenta.getMoneda());
                        System.out.print("Ingrese el monto que deasea retirar: ");
                        monto=sc.nextDouble();
                        resultado=cuenta.retirar(monto);
                        if(resultado==false){
                           System.out.println("Ingrese un monto mayor a cero y menor al saldo de su cuenta "); 
                        } 
                    }
                }
                
             
            }catch (Exception e) {
                    System.out.println("Error en el elemento ingresado.");
            }  
        }
    
    public void depositar(List<Cuenta> cuentas){
    	Scanner sc = new Scanner(System.in);
        System.out.println("\n****** Cuentas disponibles ******");
        System.out.println("=================================");
            try {
                int i;
                for ( i = 0; i < cuentas.size(); i++) {
                    System.out.println(i+1+". "+cuentas.get(i).getNumCuenta()+" "+cuentas.get(i).getTipo()
                    +" ("+cuentas.get(i).getMoneda()+")");
                    //i++;
                }
                System.out.println("=================================");
                System.out.print("Elija una cuenta: ");
                int opcion=sc.nextInt();
                while (opcion<1 || opcion>i){
                    System.out.print("Elija una cuenta: "); 
                    opcion=sc.nextInt();
                    }
                for ( int j = 1; j <= opcion; j++) {
                    if(j==opcion){
                        double monto;
                        Cuenta cuenta=cuentas.get(j-1);
                        System.out.println("\nInformacion de la cuenta");
                        System.out.println("Cuenta "+cuenta.getNumCuenta());
                        System.out.println(cuenta.getTipo());
                        System.out.println(cuenta.getSaldo()+" "+cuenta.getMoneda());
                        System.out.print("Ingrese el monto que deasea retirar: ");
                        monto=sc.nextDouble();
                        cuenta.depositar(monto);
                    }
                }
            }catch (Exception e) {
                    System.out.println("Error en el elemento ingresado.");
            }
    }
}

