/*Hacer un programa que pase de kg a otra unidad de medida de masa,
mostrar en pantalla un menú con las opciones posibles*/
package Conditionals;

import javax.swing.*;

public class Exercise14 {
    public static void main(String[]args){
        float kg,hecto,deca,gram,deci,centi,mili,quintal,ton;
        int covert;
        kg=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el valor en kilogramos: "));
        covert=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione a qué medida va a pasar\n"+"1.Hectogramos\n"+"2.Decagramos\n"+"3. Gramos\n"+"4. Decigramos\n"+"5. Centigramos\n"+"6. Miligramos\n"+"7. Quintal\n"+"8. Tonelada"));
        switch (covert){
            case 1: hecto=kg*10;
                    JOptionPane.showMessageDialog(null,+kg+" Kg son: "+hecto+" Hg");
                    break;
            case 2: deca=kg*100;
                    JOptionPane.showMessageDialog(null,+kg+" Kg son: "+deca+" Dag");
                    break;
            case 3: gram=kg*1000;
                    JOptionPane.showMessageDialog(null,+kg+" Kg son: "+gram+" gr");
                    break;
            case 4: deci=kg*10000;
                    JOptionPane.showMessageDialog(null,+kg+" Kg son: "+deci+" dg");
                    break;
            case 5: centi=kg*100000;
                    JOptionPane.showMessageDialog(null,+kg+" Kg son: "+centi+"cg");
                    break;
            case 6: mili=kg*1000000;
                JOptionPane.showMessageDialog(null,+kg+" Kg son: "+mili+" mg");
                break;
            case 7: quintal=kg/100;
                    JOptionPane.showMessageDialog(null,+kg+" Kg son: "+quintal+" Quintales");
                    break;
            case 8: ton=kg/1000;
                JOptionPane.showMessageDialog(null,+kg+" Kg son: "+ton+" Tn");
                break;
            default:JOptionPane.showMessageDialog(null,"Error");

        }
    }
}
