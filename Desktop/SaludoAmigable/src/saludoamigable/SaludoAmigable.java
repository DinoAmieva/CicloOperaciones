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

public class SaludoAmigable {
    
        Scanner entrada = new Scanner(System.in);
        
        public void Saludo(String nombre){
        
        System.out.print("Introduce tu nombre: ");
        
        nombre = entrada.nextLine();
        
        System.out.println("¡Hola " + nombre + "!");
        
        }
        
    public static void main(String[] args) {
        String nombre = "";
        SaludoAmigable SaludoDino= new SaludoAmigable();
        SaludoDino.Saludo(nombre);

    }

}
