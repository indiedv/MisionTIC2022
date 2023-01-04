/*En Mega Plaza se hace un 20% de descuento a los clientes cuya compra supere los $300
* ¿Cuál será la cantidad que pagará una persona por su compra?*/
package Conditionals;

import javax.swing.*;

public class Exercise4 {
    public static void main(String[] args){
        float purchase, dcto;

        purchase=Float.parseFloat( JOptionPane.showInputDialog("Ingrese el valor de la compra: "));
        if(purchase > 300) {
            dcto = purchase * 0.20f;
            purchase -= dcto;
            JOptionPane.showMessageDialog(null,"Valor a pagar: $"+purchase);
        }
            else{
                JOptionPane.showMessageDialog(null,"Valor a pagar: $"+purchase);

            }
        }
    }
