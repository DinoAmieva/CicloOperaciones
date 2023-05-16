package ciclooperacionesbasicas;
import java.util.Scanner;

/**
 *
 * @author Sac2-20
 */
public class CicloOperacionesBasicas {
    Scanner entrada = new Scanner(System.in);
    double numero1, numero2, resultado = 0;
    int opcion = 0;
    
    public void menuOperaciones(String args[]) {
    
    do{
    System.out.println("Calculadora");
    System.out.println("Que operacion desea realizar?");
    System.out.println("1.-Suma");
    System.out.println("2.-Resta");
    System.out.println("3.-Multiplicacion");
    System.out.println("4.-Division");
    System.out.println("5.-Salir");
    System.out.print("Introduzca opcion: ");
   opcion = entrada.nextInt();
   
   if (opcion == 1) {
    System.out.println("Suma");
    System.out.print("Introduce primer operador: ");
    numero1 = entrada.nextDouble();
    System.out.print("Introduce segundo operador: ");
    numero2 = entrada.nextDouble();
    resultado = numero1 + numero2;
    System.out.println("El resultado es: " + resultado);
   } 
   else if (opcion == 2) {
    System.out.println("Resta");
    System.out.print("Introduce primer operador: ");
    numero1 = entrada.nextDouble();
    System.out.print("Introduce segundo operador: ");
    numero2 = entrada.nextDouble();
    resultado = numero1 - numero2;
    System.out.println("El resultado es: " + resultado);
   } 
    else if (opcion == 3) {
    System.out.println("Multiplicacion");
    System.out.print("Introduce primer operador: ");
    numero1 = entrada.nextDouble();
    System.out.print("Introduce segundo operador: ");
    numero2 = entrada.nextDouble();
    resultado = numero1 * numero2;
    System.out.println("El resultado es: " + resultado);
   } 
   else if (opcion == 4) {
    System.out.println("Division");
    System.out.print("Introduce primer operador: ");
    numero1 = entrada.nextDouble();
    System.out.print("Introduce segundo operador: ");
    numero2 = entrada.nextDouble();
    resultado = numero1 / numero2;
    System.out.println("El resultado es: " + resultado);
   }
    else if(opcion == 5){
    System.out.println("Fin");
   }
    else {
    System.out.println("Opcion invalida");
    resultado = 0;
   }
   }while(opcion != 5);
    }
    
   public static void main(String[] args) {
        CicloOperacionesBasicas mostrar = new CicloOperacionesBasicas();
        mostrar.menuOperaciones(args);
    }
}
