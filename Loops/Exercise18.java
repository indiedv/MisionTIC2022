/*Hacer modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro.
* solo existen tres productos con precios: 1. $0.6 litro 2.$3 litro 3. $1,25*/
package Loops;

import javax.swing.*;

public class Exercise18 {
    public static void main(String[] args) {
        int code,liter,literartone=0,countup=0;
        float priceliter=0, totalbill,totalbilling=0;
        for(int i=1;i<=5;i++){
            do{
                code=Integer.parseInt(JOptionPane.showInputDialog("Artículo N: "+i+"\nDigite el código del artículo: "));

            }while (code<1 || code>3);

            liter=Integer.parseInt(JOptionPane.showInputDialog("Artículo N: "+i+"\nDigite la cantidad en litros: "));
            switch (code){
                case 1: priceliter=0.6f;break;
                case 2:priceliter=3;break;
                case 3:priceliter=1.25f;break;
            }

            totalbill=liter*priceliter;
            totalbilling+=totalbill;

            if(code==1){
                literartone+=liter;
            }
            if(totalbill>600){
                countup++;
            }
        }
        System.out.println("Resúmen de ventas");
        System.out.println("Facturación Total: "+totalbilling);
        System.out.println("Cantidad en litros vendido de artículo uno: "+literartone);
        System.out.println("Cantidad de facturas de $600: "+countup);


    }
}
