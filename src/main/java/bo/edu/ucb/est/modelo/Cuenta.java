/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est.modelo;

/**
 *
 * @author ecampohermoso
 */
public class Cuenta {
    private int numCuenta;
    private String moneda;
    private String tipo;
    private double saldo;

    public Cuenta(int numCuenta, String moneda, String tipo, double saldoInicial) {
        this.numCuenta = numCuenta;
        this.moneda = moneda;
        this.tipo = tipo;
        this.saldo = saldoInicial;
    }

    public boolean retirar(double monto) {
        boolean resultado = false;
        if (monto > 0 && monto <= saldo) { // verifica que no sea negativo, cero o exceda su saldo
            saldo = saldo - monto;
            resultado = true; // si he podido retirar
        }
        return resultado;
    }
    
    public boolean depositar(double monto) {
        boolean resultado = false;
        if (monto > 0 ) { // verifica que no sea negativo, cero o exceda su saldo
            saldo = saldo + monto;
            resultado = true; // si he podido retirar
        }
        return resultado;
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
