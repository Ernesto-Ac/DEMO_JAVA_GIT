package clases.y.objetos;

public class CuentaBancaria {
  long  numeroCuenta;
  Cliente propietarioCuenta;
  double saldoCuenta;
  
  public void abonar(double cantidad){
    saldoCuenta += cantidad; //lógica de negocio
  }
 
  public void retirar(double cantidad){
      if (cantidad > saldoCuenta) {
          System.out.println("!Saldo Insuficiente!");
      }
      saldoCuenta -= cantidad; ///lógica del negocio
  }
  
  public String datosPropietarioCuenta(){
  String informacion = "";
    informacion +="DUI:" + propietarioCuenta.duiCliente + "\n" ;
    informacion +="Nombre:" + propietarioCuenta.nombreCliente + "\n" ;
    informacion +="Telefono:" + propietarioCuenta.telefoCliente + "\n" ;
  return informacion;
  } 
}
