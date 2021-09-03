/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

import java.util.List;
import java.util.Scanner;
import bo.edu.ucb.est.modelo.Banco;
import bo.edu.ucb.est.modelo.Cliente;
import bo.edu.ucb.est.modelo.Cuenta;
/**
 *
 * @author PACHECO
 */
public class MenuPrincipal {

    private final Cliente cli;
    private final Banco b;
    public MenuPrincipal(Cliente cli, Banco b){
        this.cli=cli;
        this.b=b;
    }
     public void menu1(){
         Menus m=new Menus();
       Scanner sc=new Scanner(System.in);
       boolean salir = false;
       int opcion;
       while (salir==false) {
    	   System.out.println("\n****************** Menú de opciones *******************");
    	   //System.out.println("*******************************************************");
	       System.out.println("1. Ver saldo\n2. Retirar dinero\n3. Depositar dinero\n4. Salir");
	       System.out.println("*******************************************************");
	       try {
                   List<Cuenta> cuentas=cli.getCuentas();
	    	   System.out.print("Elija una opción: ");
	           opcion=sc.nextInt();
	           switch (opcion) {
	           	case 1:
                            m.saldo(cuentas);
	                    break;
	                case 2:
                            m.retirar(cuentas);
	                    break;
	                case 3:
                            m.depositar(cuentas);
	                    break;
	                case 4:
	                    Cajero c=new Cajero(b);
                            c.ingreso();
	                    break;
	                default:
	                    System.out.println("El número ingresado debe estar entre el 1 y 4");
	                }
	            } catch (Exception e) {
	                System.out.println("Error en el elemento ingresado.");
	            }
       }   
    }
}
