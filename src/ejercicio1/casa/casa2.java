package ejercicio1.casa;

import java.util.Scanner;


public class casa2 {
  String numeroCasa, nombreCalle;
  int numeroPasaje;

    public casa2(String numeroCasa, String nombreCalle, int numeroPasaje) {
        this.numeroCasa = numeroCasa;
        this.nombreCalle = nombreCalle;
        this.numeroPasaje = numeroPasaje;
    }
  
  
  
  public String DATOS(){
      String allDates = "";
      allDates = "Numero de casa es: " + numeroCasa;
      allDates += "\nNombre de calles es: " + nombreCalle;
      allDates += "\nNumero de pasaje es: " + numeroPasaje;
      return allDates;
      
  }
  
    public static void main(String[] args) {
       String numeroCasa, nombreCalle;
        int numeroPasaje;
        Scanner leer =  new Scanner(System.in);
        
        System.out.println("Escribe el numero de tu casa");
        numeroCasa = leer.nextLine();
        
        System.out.println("Digita el nombre de la calle");
        nombreCalle = leer.nextLine();
        
        System.out.println("Digita el numero de tu pasaje");
        numeroPasaje = leer.nextInt();
        
         casa2 c = new casa2(numeroCasa,nombreCalle, numeroPasaje);
         
         System.out.println(c.DATOS());
                
    }
}
