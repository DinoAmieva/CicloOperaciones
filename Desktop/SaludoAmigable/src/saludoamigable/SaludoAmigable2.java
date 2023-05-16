package saludoamigable;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner
 * Este programa despliega un saludo Hola personalizado.
 *
 */

public class SaludoAmigable2 {
    
        Scanner entrada = new Scanner(System.in);
        public static String nombre = ""; //variable global
        
        public void Saludo(String nombre){
        
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        
        }
        
    public static void main(String[] args) {
        SaludoAmigable SaludoDino= new SaludoAmigable();
        SaludoDino.Saludo(nombre);

    }

}
