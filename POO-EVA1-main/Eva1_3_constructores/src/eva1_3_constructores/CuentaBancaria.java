/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class CuentaBancaria {

    private String N_Cuenta;
    private double Saldo;
    private String Cliente;

    public CuentaBancaria() {//Constructor default
        N_Cuenta = "343";
        Saldo = 78.42;
        Cliente = "Luis";
    }

    public CuentaBancaria(String N_Account, double Cash, String ClientName) {
        N_Cuenta = N_Account;
        Saldo = Cash;
        Cliente = ClientName;

    }

    public String getN_Cuenta() {
        return N_Cuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setN_Cuenta(String value) {
        N_Cuenta = value;
    }

    public void setSaldo(int value) {
        Saldo = value;
    }

    public void setCliente(String value) {
        Cliente = value;
    }

}
