package eva1_3_constructores;

import javax.swing.JOptionPane;

public class Eva1_3_constructores {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("343", 40, "Luis");

        //  cuenta.setCliente("Luis García");
        // cuenta.setN_Cuenta("343");
        // cuenta.setSaldo(27);
        String name = cuenta.getCliente();
        String Account = cuenta.getN_Cuenta();
        double Money = cuenta.getSaldo();

        JOptionPane.showMessageDialog(null, "Nombre del cliente : " + name + "\n Número de cuenta : " + Account + "\n Saldo disponible (MXN) : " + Money + "$");

        CuentaBancaria cuenta2 = new CuentaBancaria("345", 70000, "Fernando");
        
        cuenta2.getCliente();
        cuenta2.getN_Cuenta();
        cuenta2.getSaldo();

        JOptionPane.showMessageDialog(null, "Nombre del cliente : " + cuenta2.getCliente() + "\n Número de cuenta : " + cuenta2.getN_Cuenta() + "\n Saldo disponible (MXN) : " + cuenta2.getSaldo() + "$");

    }

}
