
package myutils;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class MyUtils {
    
public static String inverteix(String cadena) {
        String resultat = "";
        if (cadena != null) {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat = resultat + cadena.charAt(i);
            }
        } else {
            resultat = null;
        }

        return resultat;
    }

   
    public static int edat(int day, int month, int year) {
        int resultat = 0;
        Calendar fecha = new GregorianCalendar();

        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        resultat = año - year;

        if (mes <= month) {
            resultat--;
        } else if (mes == month) {
            if (dia < day) {
                resultat--;
            }
        }

        if (resultat > 150) {
            resultat = -1;
        } else if (resultat <= 0) {
            resultat = -2;
        }
        return resultat;
    }

    
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        }else if (numero < 0) {
            return -1;
        }  else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}