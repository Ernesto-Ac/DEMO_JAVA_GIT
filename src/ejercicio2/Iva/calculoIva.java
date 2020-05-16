package ejercicio2.Iva;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

//clase principal
public class calculoIva {
    
    
    //metodo para calculo Iva
    public double CalculoIva(double precioProd, double porcIva){
    double IVA;
    IVA = precioProd * porcIva;
    return  IVA;
    }
    
    //metodo calculo de iva en producto
    public double calcularIVAprod(double precio_prodIVA, double porcIva){
    double IVAencontrado;
        System.out.println(porcIva);
        if (porcIva > 1) {
            porcIva /= 100;
            porcIva +=1;
            IVAencontrado = precio_prodIVA / porcIva;
            IVAencontrado = precio_prodIVA - IVAencontrado;
            System.out.println(porcIva);
            return IVAencontrado;
        }else{
            porcIva += 1;
            IVAencontrado = precio_prodIVA / porcIva;
            IVAencontrado = precio_prodIVA - IVAencontrado;
            return IVAencontrado;
        }
    }
 
    
    public static void main(String[] args) {
        //objeto de calculo
        calculoIva c = new calculoIva();
        NumberFormat formato = new DecimalFormat("$##,###.##");
        Scanner leer = new Scanner(System.in);
         double precioProd, porcIva;
         
         System.out.println("Ingrese el precio del producto");
         precioProd = leer.nextDouble();
         
         System.out.println("Ingrese el porcentaje del IVA");
         porcIva = leer.nextDouble();
         
         System.out.println("HEY MUCHACHO, QUE VAS HACER?");
         System.out.println("1 - Calculo de IVA de un producto");
         System.out.println("2 - Obtener IVA de un producto");
         int option = leer.nextInt();
         
         
         switch(option){
             case 1:
                 System.out.println("Precio del producto + iva %" + formato.format((precioProd += c.CalculoIva(precioProd, porcIva))));
                 break;
             case 2:
                 System.out.println("IVA del producto" + formato.format(c.calcularIVAprod(precioProd, porcIva)));
                 break;
             default:
                 System.out.println("Opcion invalida");
                 break;
         }
    }
}
