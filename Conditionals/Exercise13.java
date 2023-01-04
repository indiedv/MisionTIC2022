/*Hacer un programa que simmule un cajero automático con un saldo inicial de USD$1000
* con el siguiente menú de opciones:
* 1. Depositar dinero a la cuenta
* 2. Retirar dinero de la cuenta
* 3. Salir*/
package Conditionals;

import javax.swing.*;

public class Exercise13 {
    public static void main(String[]args){
        final int initial=1000;
        float credit,debit,nbalance;
        int operation;
        operation=Integer.parseInt(JOptionPane.showInputDialog(null,"Cajero Automático,Bienvenido\n"
        +"1. Depositar Dinero\n"
        +"2. Retirar Dinero\n"
        +"3. Salir"));

        switch (operation){
            case 1: credit=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor a depositar: "));
                    nbalance=initial+credit;
                    JOptionPane.showMessageDialog(null,"Depósito realizado con éxito, tu nuevo saldo es:" +nbalance);
                    break;
            case 2: debit=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor a retirar: "));
                    if(debit>initial){
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                    }
                    else {
                        nbalance=initial-debit;
                        JOptionPane.showMessageDialog(null,"Retiro realizado con éxito, tu nuevo saldo es:" +nbalance);
                    }
                    break;
            case 3: JOptionPane.showMessageDialog(null,"Gracias! por utilizar nuestro servicio");
                    break;
            default:JOptionPane.showMessageDialog(null,"Operación no válida");break;
        }

        }

    }

