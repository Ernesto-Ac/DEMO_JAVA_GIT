
package ejercicio1.casa;

import java.util.Scanner;


public class house {
 String numCasa, nomCalle;
 int numPasaje;

 //Inicializar Variables
    public house(String numCasa, String nomCalle, int numPasaje) {
        this.numCasa = numCasa;
        this.nomCalle = nomCalle;
        this.numPasaje = numPasaje;
    }
 
    public String obtenDatosCasa(){
    String Info;
    Info = "Numero de casa: " + numCasa;
    Info += "\nNumero de pasaje: " + numPasaje;
    Info += "\nNombre de calle: " + nomCalle;
    return Info;
    }
 
    public static void main(String[] args) {
        String num_casa, nom_calle;
        int num_Pasaje;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Numero de la casa");
        num_casa = leer.nextLine();
        
        System.out.println("Nombre de la calle");
        nom_calle = leer.nextLine();
        
        System.out.println("Numero de pasaje");
        num_Pasaje = leer.nextInt();
        
        house h = new house(num_casa,nom_calle, num_Pasaje);
        
        System.out.println(h.obtenDatosCasa());
    }
 
}


