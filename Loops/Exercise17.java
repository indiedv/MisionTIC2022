/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar facturas.
* En cada factura figura: El código del artículo, la cantidad vendida en litros y el precio por litro.
* Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
* y cuántas facturas se emitieron de más de $600*/
package Loops;

import javax.swing.*;

public class Exercise17 {
    public static void main(String[] args) {
        int code,liter,literartone=0,countup=0;
        float priceliter, totalbill,totalbilling=0;
        for(int i=1;i<=5;i++){
            code=Integer.parseInt(JOptionPane.showInputDialog("Artículo N: "+i+"\nDigite el código del artículo: "));
            liter=Integer.parseInt(JOptionPane.showInputDialog("Artículo N: "+i+"\nDigite la cantidad en litros: "));
            priceliter=Float.parseFloat(JOptionPane.showInputDialog("Artículo N: "+i+"\nDigite el precio por litro: "));

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
