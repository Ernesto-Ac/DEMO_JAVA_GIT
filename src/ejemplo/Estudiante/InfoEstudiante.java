package ejemplo.Estudiante;

import java.util.Scanner;

public class InfoEstudiante {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Estudiante objeto = new Estudiante();
        
          //Estudiante objeto1 = new Estudiante("A","B","C");
          System.out.println("Cual es su carnet? ");
          String c = leer.nextLine();
          objeto.setCarnet(c);
          System.out.println("Cual es su nombre? ");
          String n = leer.nextLine();
          objeto.setNombre(n);
          System.out.println("Cual es su direccion? ");
          String d = leer.nextLine();
          objeto.setDireccion(d);
          
          
          System.out.println(objeto.informacion());
          System.out.println("");
          //pasandole un objeto
         System.out.println(objeto.informacion1(objeto));
    }
}
