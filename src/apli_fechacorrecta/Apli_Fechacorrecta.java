/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta,
suponiendo que todos los meses son de 30 días*/
package apli_fechacorrecta;

import javax.swing.JOptionPane;

public class Apli_Fechacorrecta {

    public static void main(String[] args) {
       //Declaración de variables:
        int dia, mes, año;
        //Pedir los datos por medio de cuadros de dialogos:
        dia = Integer.parseInt (JOptionPane.showInputDialog ("Digite el día: "));
        mes = Integer.parseInt (JOptionPane.showInputDialog ("Digite el mes: "));
        año = Integer.parseInt (JOptionPane.showInputDialog ("Digite el año: "));
        //Condicional
        if (( dia>= 1) && (dia <=30)){
            if (( mes>= 1) && (dia <=12)){
                if (año != 0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            }
                else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
                }
            }
            else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
                }
        JOptionPane.showMessageDialog(null, "La fecha digitada es:"+dia+" - "+mes+" - "+año);
        }
            }
    
    

