package ejercicio3.Estudiante;

import java.util.Scanner;


public class HashTabla {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long [] nCarnet = new long[5];
        String[] nEstudiante = new String[5];
        String [] codCarr = new String[5];
        
        //Estudiante uno
        
        for(int i = 0; i < nCarnet.length; i++){
            System.out.println("Numero Carnet");
            nCarnet[i] = leer.nextLong();
            
            System.out.println("Codigo Carrera");
            codCarr[i] = leer.next();
            
            System.out.println("Nombre Estudiante");
            nEstudiante[i] = leer.next();
        }
        Estudiante estud = new Estudiante(nCarnet[0],nCarnet[1],nCarnet[2],nCarnet[3],nCarnet[4],nEstudiante[0],nEstudiante[1],nEstudiante[2],nEstudiante[3],nEstudiante[4],codCarr[0],codCarr[1],codCarr[2],codCarr[3],codCarr[4]);
        Estudiante est = estud;
        
        for(int i = 0; i < nCarnet.length; i++){
            System.out.println(est.printEst(nCarnet[i], codCarr[i], nEstudiante[i]));
        }
    }
}
