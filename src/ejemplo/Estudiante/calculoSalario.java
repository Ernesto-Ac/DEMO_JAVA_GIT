package ejemplo.Estudiante;

import java.util.Scanner;

//aplicando herencia de sueldo
public class calculoSalario extends sueldo {
    String nombreEmpleado = "";
    int edad = 0;
    
    
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        //sueldo sal = new sueldo();
        calculoSalario sal = new calculoSalario();
        
        System.out.println("Cual es su nombre?");
        sal.nombreEmpleado = leer.nextLine();
        System.out.println("Cuantas horas trabajo? ");
        sal.setHt(leer.nextDouble());
        System.out.println("Cual es el pago por hora? ");
        sal.setPxh(leer.nextDouble());
        
        System.out.println("Su salario sin renta es: " +sal.sueldo());
        System.out.println("Su salario con renta es: " + sal.sueldoDesc(sal));
        System.out.println("El nombre del empleado es: " +sal.nombreEmpleado);
        
        
    }
  
}

