/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

import java.util.Scanner;
import bo.edu.ucb.est.modelo.Banco;
import bo.edu.ucb.est.modelo.Cliente;
import bo.edu.ucb.est.modelo.Cuenta;
/**
 *
 * @author ecampohermoso
 */
public class Cajero {
    Banco b;
    public Cajero (Banco b) {
        this.b=b;
    }
    Cliente cliente;
    //Banco b;
    String codigo,pin;
    public void ingreso(){
        cliente=null;
        while (cliente==null){
        Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su codigo: ");
            codigo=sc.next(); 
            System.out.print("Ingrese su PIN: ");
            pin=sc.next();
            cliente=b.buscarClientePorCodigo(codigo, pin);
            
            if(cliente!=null){
                MenuPrincipal mp=new MenuPrincipal(cliente,b);
                mp.menu1();
            }
            else{
                System.out.println("Datos incorrectos, intente nuevamente");
            }
        }
    } 
}
