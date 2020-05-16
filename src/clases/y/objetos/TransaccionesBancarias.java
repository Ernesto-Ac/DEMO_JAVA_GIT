package clases.y.objetos;

import java.util.Scanner;

public class TransaccionesBancarias {
    public static void main(String[] args) {
       
        CuentaBancaria cuenta = new CuentaBancaria();//crear instancia(objeto) de la clase Cuenta Bancaria
        Scanner leer = new Scanner(System.in);//objeto leer de la clase Scanner  para ingreso de datos desde teclado
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        
        System.out.println("Ingresar los datos que se le solicitan a continuacion:");
        System.out.println("Nombre del propietario: ");
        duiCliente = leer.nextLine();//asignar valores a los atributos de clase
        
        System.out.println("Numero de DUI");
        nombreCliente = leer.nextLine();//asignar valores a los atributos de clase
        
        System.out.println("Telefono:");
        telefonoCliente = leer.nextLong();//asignar valores a los atributos de clase
        
        //aqui le mando entonces los valores_?
        Cliente propietario = new  Cliente(duiCliente, nombreCliente,telefonoCliente);//Crear Objeto propietario 
        cuenta.propietarioCuenta = propietario; //Asignamos el objeto propietario al objeto cuenta
        
        
        System.out.println("Ingrese la cantidad a abonar:");
        cuenta.abonar(abono = leer.nextDouble());//Envio de parametros al metodo abonar de la clase CuentaBancaria
        
        System.out.println("Ingrese la cantidad a retirar: ");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("--------------------------------");
        System.out.println("Su saldo de la cuenta es: " +cuenta.saldoCuenta);//Obtiene saldo de la cuenta
        //Ontener informacion del propietario
        System.out.println("Datos del propietario :\n" + cuenta.datosPropietarioCuenta());
    }
}
